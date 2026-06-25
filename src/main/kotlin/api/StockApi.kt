package org.example.api
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import org.example.model.Stock
import kotlinx.serialization.json.Json


class StockApi {
    fun getStocks(): List<Stock> {
        val client = HttpClient(CIO)
        val stockText = client.get([
            {"ticker":"SBER","price":315.42}
        ]).bodyAsText()
        val json = Json { ignoreUnknownKeys = true }
        client.close()
        return json.decodeFromString<List<Stock>>(stockText)
    }
}



