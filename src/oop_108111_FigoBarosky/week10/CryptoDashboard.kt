package oop_108111_FigoBarosky.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 8.0))
    coinRepo.add(Coin("USDT", 2500.0))

    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )
}