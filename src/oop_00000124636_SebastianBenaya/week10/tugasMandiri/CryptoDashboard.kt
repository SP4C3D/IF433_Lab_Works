package oop_00000124636_SebastianBenaya.week10.tugasMandiri

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 67.0))
    coinRepo.add(Coin("SWT", 19.0))
    coinRepo.add(Coin("SOL", 69.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
}