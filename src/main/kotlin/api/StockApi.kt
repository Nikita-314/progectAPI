package org.example.api
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import org.example.model.CoinPrice
import kotlinx.serialization.json.Json
import io.ktor.client.request.*
import io.ktor.client.statement.*



class StockApi {
    suspend fun getStocks(): Map<String, CoinPrice> {
        val client = HttpClient(CIO)
        val stockText = client.get("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd").bodyAsText()
        val json = Json { ignoreUnknownKeys = true }
        client.close()
        return json.decodeFromString<Map<String, CoinPrice>>(stockText)
    }
}



