fun main(){
    val amount = 1000000
    val taxes = amount/100*0.75
    val taxesRub = taxes/100
    if (taxes <3_500) {
        println("Перевод будет стоить 35рублей")
    } else {
        println("Перевод будет стоить $taxesRub рублей")
    }
}
