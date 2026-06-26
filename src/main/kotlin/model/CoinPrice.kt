package org.example.model

import kotlinx.serialization.Serializable

@Serializable
data class CoinPrice(
    val usd: Double
)