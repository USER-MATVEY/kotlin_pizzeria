class PizzaMoscow(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaRestoran(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), ICheckPhoto {
    override var sumDiscount: Int = 0
    override var discountCount: Int = 0

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Благодарим за покупку Неополитанской пиццы в Москве!")
    }

    override fun romanianPizzaSale() {
        romanPizzaCount++
        println("Благодарим за покупку Римской пиццы в Москве!")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Благоддарим за покупку Сицилийской пиццы в Москве!")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Благодарим за покупку Тирольской пиццы в Москве!")
    }
}