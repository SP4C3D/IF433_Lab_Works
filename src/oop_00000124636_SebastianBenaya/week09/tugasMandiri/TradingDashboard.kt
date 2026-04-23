package oop_00000124636_SebastianBenaya.week09.tugasMandiri

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "Long", 20, 15.5, "OPEN"),
        TradeLog("ETHUSDT", "Short", 15, -10.3, "CLOSED"),
        TradeLog("SOLUSDT", "Long", 5, 7.3, "OPEN"),
        TradeLog("DOGEUSDT", "Short", 100, -1.3, "CLOSED"),
        TradeLog("SWTIDRT", "Long", 19, -19.0, "CLOSED"),
        TradeLog("OOPIDRT", "Short", 3, 17.6, "OPEN")
    )

    val closedTrades = tradeHistory.filter {it.status == "CLOSED"}
    val winningTrades = closedTrades.filter {it.roe > 0}
    val losingTrades = closedTrades.filter {it.roe <= 0}
    val sortedWins = winningTrades.sortedByDescending { it.roe }
    val sortedLosses = losingTrades.sortedBy { it.roe }
    val topPerformersString = sortedWins.map{"WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"}
    val worstPerformersString = sortedLosses.map{"LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"}
    val uniquePairs = tradeHistory.map {it.pair}.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach {println(it)}
}