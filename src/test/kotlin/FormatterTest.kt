import org.example.formatter.CoinFormatter
import org.example.model.Currency

class FormatterTest {
    fun testFormatter() {
        val prices = mapOf("bitcoin" to mapOf("usd" to 60000.0))
        val formatter = CoinFormatter()

        val text = formatter.format(
            prices,
            Currency.USD
        )
        println(text)
    }

}


//fun testFormatter()
//1. Создай маленькую Map вручную.
//2. Вызови CoinFormatter.format(...).
//3. Выведи результат через println.