package org.example

import org.example.api.StockApi
import org.example.model.CoinPrice


suspend fun main() {
    val coins = listOf(
        "bitcoin",
        "ethereum",
        "dogecoin"
    )

    val api = StockApi()
    val prices = api.getPrices(coins)

    fun result(par: Map<String, CoinPrice>) {
        for (item in par) {
            val coinName = item.key.replaceFirstChar { it.uppercase() }
            println(
                """
            ${coinName}
            Цена: ${item.value.usd} USD
            
            """.trimIndent()
            )
        }
    }
    result(prices)


//    ethereum=CoinPrice(usd=1556.52)

}

