package org.example.api

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.json.Json
import org.example.model.CoinPrice


class StockApi {
    suspend fun getStocks(): Map<String, CoinPrice> {
        val client = HttpClient(CIO)
        val stockText =
            client.get("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd")
                .bodyAsText()
        val json = Json { ignoreUnknownKeys = true }
        client.close()
        return json.decodeFromString<Map<String, CoinPrice>>(stockText)
    }

    suspend fun getPrices(coins: List<String>): Map<String, CoinPrice> {
        val coinIds = coins.joinToString(",")
        val client = HttpClient(CIO)
        val stockText =
            client.get("https://api.coingecko.com/api/v3/simple/price?ids=$coinIds&vs_currencies=usd").bodyAsText()
        val json = Json { ignoreUnknownKeys = true }
        client.close()
        return json.decodeFromString<Map<String, CoinPrice>>(stockText)
    }
}



