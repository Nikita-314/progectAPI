package org.example.model

import kotlinx.serialization.Serializable


@Serializable
data class PriceTik(
    val id: String,
    val symbol: String,
    val name: String
) {
}