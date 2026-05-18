package oop_00000124636_SebastianBenaya.week13.tugasMandiri
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id, $symbol, $type, $margin, $pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    return try {
        TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String){
    File(path).printWriter().use{ writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException){
        println("Error, file tidak ditemukan.")
        emptyList()
    }
}

fun main() {
    val file = "crypto_trades.csv"

    val records = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 190.0, 45.5),
        TradeRecord(2, "ETHUSDT", "Short", 67.0, -12.3),
        TradeRecord(3, "SOLUSDT", "Long", 80.0, 15.8)
    )
    saveTrades(records, file)

    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSDT, HOLD, XX, YY\n")
}