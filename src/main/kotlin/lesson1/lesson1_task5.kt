package org.example.lesson1
/*
Задача 5* к Уроку 1

Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы,
сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */

fun main(){
    var seconds: Int = 6480
    val n = 2
    val secondsOnMinute: Int = 60

    var hours: Int = seconds/(secondsOnMinute * secondsOnMinute)
    seconds -= hours * (secondsOnMinute * secondsOnMinute)
    var minutes: Int = seconds / secondsOnMinute
    seconds -= minutes * secondsOnMinute

    print(hours.toString().padStart(n, '0'))
    print(":")
    print(minutes.toString().padStart(n, '0'))
    print(":")
    print(seconds.toString().padStart(n, '0'))

}