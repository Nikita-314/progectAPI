package org.example.formatter

import org.example.model.Currency

class CoinFormatter {
    fun format(prices: Map<String, Map<String, Double>>, currency: Currency): String {
        var result = ""
        for (item in prices) {
            val coinName = item.key.replaceFirstChar { it.uppercase() }
            val pr = item.value[currency.code]
            result += "$coinName\n"
            result += "Цена: ${pr} ${currency.code}\n\n"
        }
        return result
    }
}

