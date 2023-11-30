interface IDrink {
    var sumCostofDrinks: Int
    var drinkCount: Int

    fun drinkSale(){
        println("Будете кофе?")
        println("1 - да, 2 - нет:")
        if (readln() == "1"){
            println("С вас 200 рублей.")
            sumCostofDrinks += 200
            drinkCount ++
        }
    }

    fun drinksStatistics(){
        println("Общее кол-во проданных напитков: $drinkCount")
        println("Общая стоимость проданных напистков: $sumCostofDrinks")
    }
}