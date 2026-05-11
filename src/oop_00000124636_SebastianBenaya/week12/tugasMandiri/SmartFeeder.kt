package oop_00000124636_SebastianBenaya.week12.tugasMandiri

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int{
    require(requestedGram > 0){
        "Porsi kibble harus lebih dari 0 gr"
    }

    if(isJammed){
        throw DispenserJamException()
    }

    if(requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main(){
    var currentKibbleStock = 50

    try{
        dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException){
        println("Error 01: ${e.message}")
    } catch (e: FoodEmptyException){
        println("Error 19: ${e.message}")
    } catch (e: Exception){
        println("Error 67: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    runCatching {
        dispenseKibble(30, 1000, false)
    }.onSuccess {
        newStock -> currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }
}