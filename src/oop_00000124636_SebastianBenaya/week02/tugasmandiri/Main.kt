package oop_00000124636_SebastianBenaya.week02.tugasmandiri

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan judul buku: ")
    val judul = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val peminjam = scanner.nextLine()

    print("Masukkan lama meminjam (dalam hari): ")
    var lama = scanner.nextInt()

    val l1 = Loan(judul, peminjam, lama)
    println("Detail Peminjaman:\nJudul: ${l1.bookTitle}\nNama Peminjam: ${l1.borrower}\nLama Meminjam: ${l1.loanDuration}\nTotal Denda: Rp ${l1.calculateFine(l1.loanDuration)}")
}