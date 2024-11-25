package org.example.lesson2

/*
В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
который дает +20% к добытым материалам. Было добыто 7 кристаллической и 11 железной
руды без баффа – заранее известные данные, объявить и проинициализировать.

Напиши программу, которая будет учитывать действие баффа и выводить
в консоль количество “бонусных” (то есть тех материалов, которые даются “сверху” баффом).
По одной строке на материал с его названием.

Если получается нецелое число, то дробная часть должна отбрасываться.
 */

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    var buffCrystal: Int = (crystalOre * 1.2).toInt() - crystalOre
    var buffIron: Int = (ironOre * 1.2).toInt() - ironOre

    println(buffCrystal)
    println(buffIron)

}