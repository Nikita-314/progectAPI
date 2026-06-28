package org.example.api

import kotlinx.serialization.json.Json
import org.example.model.StockInfo

class StockApi {
    fun getStocks(coins: String): List<StockInfo> {
        val json = Json { ignoreUnknownKeys = true }
        return json.decodeFromString<List<StockInfo>>(coins)
    }
}