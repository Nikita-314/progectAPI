package org.example.model

import kotlinx.serialization.Serializable


@Serializable
class StockInfo(
    val id: String,
    val symbol: String,
    val name: String,
) {
}