package org.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Stock(
    val ticker: String,
    val price: Double
)


@Serializable
data class CoinPrice(
    val usd: Double
)