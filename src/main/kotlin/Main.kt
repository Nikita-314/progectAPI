package org.example
import org.example.api.StockApi



suspend fun main() {
    val api = StockApi()
    val stocks = api.getStocks()
    for (stock in stocks) {
        println("${stock}")
    }

//    val json = Json {ignoreUnknownKeys = true}
//    val stock = json.decodeFromString<List<Stock>>(stockText)
//
//    val result = stock.find { it.price > 300}
//
//    println("${result?.ticker} - ${result?.price}")

}

