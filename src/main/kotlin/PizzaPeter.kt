class PizzaPeter(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaRestoran(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), IDrink {
    override var sumCostofDrinks: Int = 0
    override var drinkCount: Int = 0

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Благодарим за покупку Неополитанской пиццы в Санкт-Петербурге!")
    }

    override fun romanianPizzaSale() {
        romanPizzaCount++
        println("Благодарим за покупку Римской пиццы в Санкт-Петербурге!")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Благоддарим за покупку Сицилийской пиццы в Санкт-Петербурге!")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Благодарим за покупку Тирольской пиццы в Санкт-Петербурге!")
    }
}