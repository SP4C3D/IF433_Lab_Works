package oop_00000124636_SebastianBenaya.week10.tugasMandiri

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 67.0))
    coinRepo.add(Coin("SWT", 19.0))
    coinRepo.add(Coin("SOL", 69.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
    println(response.status)
    response.data.forEach { println(it) }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("C1", 67.6767))
    txRepo.add(Transaction("C2", 7.9876))
    txRepo.add(Transaction("C3", 1.5678))
    txRepo.getAll().forEach { println(it) }
}