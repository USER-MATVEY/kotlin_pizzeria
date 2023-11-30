interface ISouse {
    var souseDictionary: Map<
            String,
            Map<
                    String,
                    Double>
            >

    fun souseSale(){
        println("Будете соус брать к пицце?")
        println("1 - да, 2 - нет:")
        if (readln() == "2") return

        println("На выбор:")
        for (souse in souseDictionary.keys){
            println("$souse - ${souseDictionary[souse]?.get("price")} руб.")
        }
        val souseToBuy = readln().lowercase()
        if (souseToBuy in souseDictionary.keys.toList()){
            println("Благодарим за покупку!")

            val currentCount = souseDictionary[souseToBuy]?.get("count")
            if (currentCount != null) {
                val updatedSouse = souseDictionary[souseToBuy]?.plus("count" to (currentCount + 1.0))
                if (updatedSouse != null) {
                    souseDictionary = souseDictionary.plus(souseToBuy to updatedSouse)
                }
            }
        }
    }

    fun souseStatistics(){
        println("Статистика по соусам:")
        for (souse in souseDictionary.keys){
            println("$souse: Выручка - ${
                souseDictionary[souse]?.get("price")?.times(souseDictionary[souse]?.get("count") ?: 0.0)
            };\nКол-во продаж - ${souseDictionary[souse]?.get("count")} ")
        }
    }
}