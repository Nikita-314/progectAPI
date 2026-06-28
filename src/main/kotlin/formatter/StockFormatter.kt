package org.example.formatter

import org.example.model.StockInfo

class StockFormatter {
    fun format(stocks: List<StockInfo>): String {
        var text = ""
        for (item in stocks) {
            text += "${item.id}\n"
            text += "${item.symbol}\n"
            text += "${item.name}\n________\n"
        }
        return text
    }
}