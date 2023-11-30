fun main() {
    val pizzaPeter = PizzaPeter(
        175.0, 250.0,
        167.0, 215.0)
    val pizzaMoscow = PizzaMoscow(
        195.0, 275.0,
        175.0, 200.0
    )
    val pizzaEkb = PizzaEkb(
        180.0, 230.0,
        200.0, 150.0
    )

    var currentPizzaCity: PizzaRestoran

    while (true) {
        println("Приветствуем вас! Выберите город для заказа пиццы:")
        println("1 - Санкт-Ретербург, 2 - Москва, 3 - Екатеринбург\n0 - выход из программы")
        val city = readln()
        currentPizzaCity = when (city) {
            "1" -> pizzaPeter
            "2" -> pizzaMoscow
            "3" -> pizzaEkb
            "0" -> break
            else -> {
                println("error")
                continue
            }
        }
        currentPizzaCity.buyPizza()
    }
}

