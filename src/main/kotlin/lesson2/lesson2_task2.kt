package org.example.lesson2

/*
Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30 000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату
в 20 000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.
 */

fun main() {
    var workers: Int = 50
    var intern: Int = 30
    var salaryWorkers: Int = 30000
    var salaryIntern: Int = 20000

    var sumSalaryWorkers: Int = salaryWorkers * workers
    var generalSum: Int = (salaryWorkers * workers) + (salaryIntern * intern)
    var averageSum: Int = generalSum / (workers + intern)

    println(sumSalaryWorkers)
    println(generalSum)
    println(averageSum)
}