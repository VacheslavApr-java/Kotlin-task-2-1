fun main() {
    val amount = 10000.0
    val commissionPercent = 0.75
    val minCommission = 35
    var commission = (amount * commissionPercent) / 100
    if (commission < minCommission) {
        commission = minCommission.toDouble()
    }
    val totalAmount = amount - commission

    println(
        "Перевод на сумму: $amount руб.\n" +
                "Комиссия: $commissionPercent" + '%' + " (минимум $minCommission рублей): " + "$commission руб.\n" +
                "Сумма к переводу: $totalAmount руб."
    )
}