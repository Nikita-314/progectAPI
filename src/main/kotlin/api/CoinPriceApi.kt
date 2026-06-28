package org.example.api

import kotlinx.serialization.json.Json
import org.example.model.PriceTik

class CoinPriceApi {
    fun getPricesCoin(coins: String): List<PriceTik> {
        val json = Json { ignoreUnknownKeys = true }
        return json.decodeFromString<List<PriceTik>>(coins)

    }
}