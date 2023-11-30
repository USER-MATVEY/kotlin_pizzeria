import kotlin.system.exitProcess

abstract class PizzaRestoran(
    private val neapolitanPizzaPrice: Double, private val romanPizzaPrice: Double,
    private val sicilianPizzaPrice: Double, private val tyroleanPizzaPrice: Double
) {
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanianPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()

    private fun showStatistics(){
        println("Продано Неополитанской пиццы: $neapolitanPizzaCount")
        println("Продано Римской пиццы: $romanPizzaCount")
        println("Продано Сицилийской пиццы: $sicilianPizzaCount")
        println("Продано Тирольской пиццы: $tyroleanPizzaCount")

        var money = extraMoney()
        money += neapolitanPizzaCount * neapolitanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice +
                romanPizzaCount * romanPizzaPrice +
                tyroleanPizzaCount * tyroleanPizzaPrice
        println("Всего выручки: $money")
    }

    fun buyPizza(){
        println("Выберите пиццу:")
        println("1 - Неополитанская пицца\n2 - Римская пицца" +
                "\n3 - Сицилийская пицца\n4 - Тирольская пицца" +
                "\n5 - показать статистику")
        when(readln()){
            "1" -> {neapolitanPizzaSale()
                extraServise()
            }
            "2" -> {
                romanianPizzaSale()
                extraServise()
            }
            "3" -> {
                sicilianPizzaSale()
                extraServise()
            }
            "4" -> {
                tyroleanPizzaSale()
                extraServise()
            }
            "5" -> showStatistics()
            else ->{
                println("error to buy")
                exitProcess(1)
            }

        }


    }

    private fun extraServise() {
//        when (this) {
//            is ICheckPhoto -> this.showCheckPhoto()
//            is IDrink -> this.drinkSale()
//            is ISouse -> this.souseSale()
//        }
//
        if (this is ICheckPhoto) {
            this.showCheckPhoto()
        }
        if (this is IDrink) {
            this.drinkSale()
        }
        if (this is ISouse) {
            this.souseSale()
        }
    }

    private fun extraMoney(): Double {
        var extraMoney = 0.0
        if (this is ICheckPhoto) {
            this.photoStatistics()
            extraMoney -= this.sumDiscount
        }
        if (this is IDrink) {
            this.drinksStatistics()
            extraMoney += this.sumCostofDrinks
        }
        if (this is ISouse) {
            this.souseStatistics()
            var souseMoney = 0.0
            for (souse in this.souseDictionary.values) {
                souseMoney += souse["price"]!! * souse["count"]!!
            }
            extraMoney += souseMoney
        }
        return extraMoney
    }
}