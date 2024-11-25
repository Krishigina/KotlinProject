package org.example.lesson2

/*
Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

fun main() {
    val hours: Int = 9
    val minuts: Int = 39
    val time: Int = 457

    val constMinut: Int = 60

    var amountTime: Int = hours * constMinut + minuts + time
    var arrivalHours: Int = amountTime / constMinut
    var arrivalMinutes: Int = amountTime % constMinut
    print("$arrivalHours:$arrivalMinutes")
}