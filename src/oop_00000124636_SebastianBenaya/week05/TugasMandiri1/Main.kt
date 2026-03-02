package oop_00000124636_SebastianBenaya.week05.TugasMandiri1

fun main(){
    val mh = MathHelper()

    val luasPersegi = mh.hitungLuas(10)
    val luasPersegiPanjang = mh.hitungLuas(6, 7)
    val luasLingkaran = mh.hitungLuas(6.7)

    println("Luas Persegi adalah ${luasPersegi},\nluas persegi panjang adalah ${luasPersegiPanjang},\nluas lingkaran adalah ${luasLingkaran}.")
}