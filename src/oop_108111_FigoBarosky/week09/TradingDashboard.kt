package oop_108111_FigoBarosky.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, 8.1, "OPEN"),
        TradeLog("XRPUSDT", "SHORT", 5, -2.5, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 25, 21.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 12, 4.8, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }
}