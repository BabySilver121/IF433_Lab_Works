package oop_108111_FigoBarosky.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {

    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {

    return try {

        val parts = line.split(",")

        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )

    } catch (e: Exception) {

        println("(Log) Data korup diabaikan: $line")

        null
    }
}

fun saveTrades(
    trades: List<TradeRecord>,
    path: String
) {

    File(path).printWriter().use { writer ->

        trades.forEach {

            writer.println(it.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {

    return try {

        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }

    } catch (e: FileNotFoundException) {

        emptyList()
    }
}

fun main() {

    val trades = listOf(

        TradeRecord(1, "BTCUSDT", "LONG", 100.0, 35.5),
        TradeRecord(2, "ETHUSDT", "SHORT", 80.0, -12.0),
        TradeRecord(3, "SOLUSDT", "LONG", 50.0, 20.0)
    )

    saveTrades(trades, "crypto_trades.csv")
}