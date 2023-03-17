fun main() {
    val discount = 0.05
    val addDiscount = 0.01 // доп. скидка
    val regularCustomer = true // Если покупатель постоянный, то писать true, если нет, false
    var totalPrice = 5000
    if (regularCustomer){
    if (totalPrice >= 0 && totalPrice <= 1000) {
        totalPrice = (totalPrice  - (totalPrice * addDiscount)).toInt()
        println(totalPrice)
    } else if (totalPrice in 1001..10_000){
        totalPrice = ((totalPrice - 100) - (totalPrice * addDiscount)).toInt()
        println(totalPrice)
    } else if (totalPrice > 10_000) {
        totalPrice = ((totalPrice  - (totalPrice * discount)) - (totalPrice * addDiscount)).toInt()
        println(totalPrice)
    }
    } else {
        if (totalPrice >= 0 && totalPrice <= 1000) {
            println(totalPrice)
        } else if (totalPrice in 1001..10_000){
            println(totalPrice - 100)
        } else if (totalPrice > 10_000) {
            totalPrice = (totalPrice  - (totalPrice * discount)).toInt()
            println(totalPrice)
        }
    }
}