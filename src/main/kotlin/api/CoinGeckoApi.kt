package org.example.api

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.json.Json
import org.example.model.CoinPrice
import org.example.model.Currency


class CoinGeckoApi {
    suspend fun getStocks(): Map<String, CoinPrice> {
        val client = HttpClient(CIO)
        val stockText =
            client.get("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd")
                .bodyAsText()
        val json = Json { ignoreUnknownKeys = true }
        client.close()
        return json.decodeFromString<Map<String, CoinPrice>>(stockText)
    }

    suspend fun getPrices(coins: List<String>, currency: Currency): Map<String, Map<String, Double>> {
        val coinIds = coins.joinToString(",")
        val client = HttpClient(CIO)
        val stockText =
            client.get("https://api.coingecko.com/api/v3/simple/price?ids=$coinIds&vs_currencies=${currency.code}")
                .bodyAsText()
        val json = Json { ignoreUnknownKeys = true }
        client.close()
        return json.decodeFromString<Map<String, Map<String, Double>>>(stockText)
    }
}



