interface ICheckPhoto {
    var sumDiscount: Int
    var discountCount: Int

    fun showCheckPhoto(){
        println("У вас есть фото чека?")
        println("1 - да, 2 - нет:")
        if (readln() == "1") {
            println("Вам будет скидка в 50 рублей.")
            sumDiscount += 50
            discountCount ++
        }
    }

    fun photoStatistics(){
        println("Всего чеков показано: $discountCount")
        println("Общая сумма скидки по показу чека: $sumDiscount")
    }
}