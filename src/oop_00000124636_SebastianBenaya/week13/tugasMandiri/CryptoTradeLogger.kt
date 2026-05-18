package oop_00000124636_SebastianBenaya.week13.tugasMandiri

import oop_00000124636_SebastianBenaya.week13.Student

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id, $symbol, $type, $margin, $pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    return try {
        TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
    } catch (e: Exception) {
        println("(Log) Error: $line")
        null
    }
}