package oop_00000124636_SebastianBenaya.week02.tugasmandiri2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Input nama hero: ")
    val nama = scanner.nextLine()

    print("Input HP hero (angka): ")
    val darah = scanner.nextInt()

    print("Input base damage (angka): ")
    val damage = scanner.nextInt()

    var enemyHp = 200
    val enemyName = "Bowowo"

    val h1 = Hero(nama, darah, damage)
    var kabur = false

    println("---Saviour of Sawit---")

    while (h1.isAlive() && enemyHp > 0) {
        print("Pilih:\n1.Serang\n2.Kabur\n")
        var pilihan = scanner.nextInt()
        if (pilihan == 1) {
            h1.attack(enemyName)
            enemyHp -= h1.baseDamage
            if (enemyHp < 0) {
                enemyHp = 0
                println("Sisa HP $enemyName adalah $enemyHp")
                break
            }
            println("Sisa HP $enemyName adalah $enemyHp")
            h1.takeDamage((10..20).random())
            println("Anda terkena serangan $enemyName. Sisa HP anda adalah ${h1.hp}\n")
        } else if (pilihan == 2) {
            kabur = true
            break
        }
    }
    if (h1.isAlive() && enemyHp <= 0) {
        println("Selamat $nama, kamu telah menyelamatkan para sawit!")
    } else if(kabur){
        println("Anda kabur, meninggalkan para sawit untuk diperbudak oleh $enemyName")
    } else {
        println("Anda telah kalah... $enemyName telah memperbudak para sawit.")
    }
}