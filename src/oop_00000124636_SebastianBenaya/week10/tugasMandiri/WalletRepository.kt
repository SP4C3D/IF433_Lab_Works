package oop_00000124636_SebastianBenaya.week10.tugasMandiri

class WalletRepository<T> (){
    private val items = mutableListOf<T>()
    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T>{
        return items
    }
    fun search(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}