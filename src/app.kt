fun main() {
//    println("Запишите первое число")
//    val num1 = readln().toInt()
//    print("ВВедите аторое число")
//    val num2 = readln().toInt()
//
//    if (num1 > num2){
//        println("первое число больщн")
//    } else if (num1==num2){
//        println("Числа равны")
//    } else{
//        println("второе число больше ")
//    }
//
//    val max = if (num1 > num2) num1 else num2
//    println(max)
//
//    val age = readln().toInt()
//    val statys = if (age > 18) "Взрослый" else "Ребенок"
//    println(statys)


    //диапазоны
//    val num = 1..2
//    val num2 = 1 until 100 //не включительно этого диапозона
//    val num3 = 100 downTo 1
//    val num4 = 100 downTo 1 step 5
//    println(num2)
//    println(num3)
//    println(num4)
//    val symbol = 'a'..'z'
//    println(num)
//    for (i in symbol){
//        println(i)
//    }

//
//    println("Введите порядковый номер месяцв 1 - 12")
//    val num = readln().toInt()
//    var month = when (num) {
//        1 -> "январь"
//        2 -> "февраль"
//        3 -> "март"
//        4 -> "апрель"
//        5 -> "май"
//        6 -> "июнь"
//        7 -> "июль"
//        8 -> "август"
//        9 -> "сентябрь"
//        10 -> "октябрь"
//        11 -> "ноябрь"
//        12 -> "декабрь"
//        else -> "нет"
//    }
//    if (num in 1..12){
//        println("Ваш индекс $num соотествует месяцу $month")
//    }else{
//        println("индекс вне диапазоне")
//    }

    //шаг 3  игра
//    var lvl: Int = 0
//    println("Добро пожаловать в Подземелье!")
//    while (lvl<5){
//        println("Вы на уровне $lvl")
//        println("Выберите действия [1]Вперед | [2]Осмотреться |[0]Сдаться")
//        val q = readln()
//        when (q) {
//            "1" -> {
//                lvl++
//                println("Вы перешли на уровень $lvl")
//            }
//            "2" -> {
//                println("Вы осматриваетесь. Тут нечего интересного" )
//                continue
//            }
//            "0" -> {
//                println("Вы сдались. Игра окончена.")
//                break
//            }
//            else -> {
//                println("Неверный выбор")
//                continue
//            }
//        }
//        if (lvl == 5){
//            println("Поздравляем вы на 5 уровне!")
//        }
//    }


    //4 шаг
//    var num : Int
//    do {
//        println("Введите число больше 10: ")
//        num = readln().toInt()
//    }while (num <= 10)
//    println("Спасибо. Вы ввели $num")


//    println("Введите пароль")
//    var pass = readln()
//
//    while (pass != "qwerty"){
//        println("Введите пароль")
//        pass = readln()
//    }
//    println("Доступ разрешен")


//    var pass : String?
//    do{
//        println("Введите пароль")
//        val pass = readln()
//    }while (pass != "qwerty")
//
//    println("Доступ разрешен")
}