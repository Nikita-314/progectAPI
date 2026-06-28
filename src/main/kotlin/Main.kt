package org.example

import org.example.api.StockApi
import org.example.formatter.StockFormatter

suspend fun main() {
    val coins: String = """
        [
            {
                "id": "bitcoin",
                "symbol": "btc",
                "name": "Bitcoin"
            },
            {
                "id": "ethereum",
                "symbol": "eth",
                "name": "Ethereum"
            },
            {
                "id": "dogecoin",
                "symbol": "doge",
                "name": "Dogecoin"
            },
            {
                "id": "litecoin",
                "symbol": "ltc",
                "name": "Litecoin"
            },
            {
                "id": "ripple",
                "symbol": "xrp",
                "name": "XRP"
            },
            {
                "id": "solana",
                "symbol": "sol",
                "name": "Solana"
            },
            {
                "id": "cardano",
                "symbol": "ada",
                "name": "Cardano"
            },
            {
                "id": "polkadot",
                "symbol": "dot",
                "name": "Polkadot"
            },
            {
                "id": "chainlink",
                "symbol": "link",
                "name": "Chainlink"
            },
            {
                "id": "avalanche-2",
                "symbol": "avax",
                "name": "Avalanche"
            }
        ]
    """
    val api = StockApi()
    val stocks = api.getStocks(coins)
    val formatter = StockFormatter()
    val text = formatter.format(stocks)
    println(text)
}
//    val coins: String =
//        """
//        [
//            {
//                "id": "bitcoin",
//                "symbol": "btc",
//                "name": "Bitcoin"
//            },
//            {
//                "id": "ethereum",
//                "symbol": "eth",
//                "name": "Ethereum"
//            },
//            {
//                "id": "dogecoin",
//                "symbol": "doge",
//                "name": "Dogecoin"
//            }
//        ]
//        """
//    val api = CoinPriceApi()
//    val prices = api.getPricesCoin(coins)
//    val formatter = PriceFormatter()
//    val text = formatter.format(prices)
//    println(text)


//    val coins = listOf(
//        "bitcoin",
//        "ethereum",
//        "dogecoin"
//    )

//    val dog = Dog()
//    dog.sayHello()
//    fun makeTea() {
//        println("Налил воду")
//        Thread.sleep(3000)
//        println("Чай готов")
//    }
//    makeTea()
//
//    suspend fun makeCoffee() {
//        println("Включил кофемашину")
//        Thread.sleep(3000)
//        println("Кофе готов")
//    }
//    makeCoffee()


//    val api = CoinGeckoApi()
//    val prices = api.getPrices(coins, Currency.RUB)
//    val formatter = CoinFormatter()
//    val text = formatter.format(prices, Currency.RUB)

// println(text)
// {bitcoin={rub=4740021.0}, dogecoin={rub=5.94}, ethereum={rub=124629.0}}


