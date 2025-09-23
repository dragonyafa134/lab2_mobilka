import kotlin.random.Random
import kotlin.random.nextInt

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


    //шаг 6
//    val st = "hello world my code Kotlin"
//    val words = st.split("")
//    println(words)

//    val st = "hello world, my code Kotlin"
//    val words = st.split(",")
//    for (i in words) {
//        println(i)
//    }

//    val nq = "world!qwe%wqe&"
//    val wor = nq.split("!","%","&")
//    println(wor)
//    for (i in wor){
//        println(i)
//    }

//     val name =  "Иванов Ваня"
//     val pd = name.split(" ")
//    val hj = pd[0]
//    val jk = pd[1]
//    println("Фамилия $hj . Имя $jk")


//    println("Введите числа через пробел")
//    val num = readln()
//    val num2 = num.split(" ")
//    var sum = 0
//    for (i in num2){
//        sum += i.toInt()
//    }
//    println("Сумма $sum")


    //калькулятор
//    println("Введите первое число, знак операции, и второе число через пробел  ")
//    val input = readln().split(" ")
//    val symbol = input[1]
//    val num1 = input[0].toDouble()
//    val num2 = input[2].toDouble()
//    var sum = 0.0
//    when (symbol){
//        "/" -> sum = num1 / num2
//        "*" -> sum = num1 * num2
//        "+" -> sum = num1 + num2
//        "-" -> sum = num1 - num2
//        else -> println("Не правильный ввод")
//    }
//    println("$num1 $symbol $num2 = $sum")

    //шаг 8
//    println(Random.nextLong())
//    println(Random.nextFloat())
//    println(Random.nextDouble())

//    println(Random.nextLong(until = 100)) //чсла до 100
//    println(Random.nextInt(from = 1 , until = 200)) // числа с 1 до 200 можно
//    println(Random.nextDouble(until = 100.0))


    //игра
//    val number = Random.nextInt(from = 1, 100)
//    println("Угадайте число от 1 до 100")
//
//
//    while (true){
//        println("Введи число ")
//        val input = readln().toInt()
//        when{
//            input > number -> println("Число меньше")
//            input < number -> println("Число больше")
//            else -> {
//                println("Поздравляю вы угадали слова $number")
//                break
//            }
//        }
//    }

//    val dice1 = Random.nextInt(1,7)
//    val dice2 = Random.nextInt(1, 7)
//    val sum = dice1 + dice2
//    println("Первый кубик $dice1")
//    println("Второй кубик $dice2")
//    println("Сумма $sum")

    //шаг 9

//    val part1 = arrayOf("Опытный", "Безумный" , "Легендарный", "Скрытный", "Гагачад")
//    val part2 = arrayOf("Стрелок", "Геймер", "Воин", "Волшебник" , "Трейдир")
//    val part3 = arrayOf("из ксго" ,"на максималках" ,"из будущего" ,"в бане у гербина" ,"с проклятом лутом")
//    val rand1 = (Math.random() * part1.size).toInt()
//    val rand2 = (Math.random() * part2.size).toInt()
//    val rand3 = (Math.random() * part3.size).toInt()
//    val rt = "${part1[rand1]}, ${part2[rand2]}, ${part3[rand3]}"
//    println(rt)

    //САМОСТОЯТЕЛЬНЫЕ ЗАДАНИЯ
    //1 ЗАДАНИЯ

//    val number = Random.nextInt(from = 1, 50)
//    println("Угадайте число от 1 до 50")
//
//
//    while (true){
//        println("Введи число ")
//        val input = readln().toInt()
//        when{
//            input > number -> println("Число меньше")
//            input < number -> println("Число больше")
//            else -> {
//                println("Поздравляю вы угадали слова $number")
//                break
//            }
//        }
//    }

    //3 задания
//    println("Введите число")
//    var num = readln().toInt()
//    while (num<= 1){
//        println(num)
//        num = num+1
//    }

    //4 Задания

//    val lowerCase = ('a'..'z').toList()
//    val upperCase = ('A'..'Z').toList()
//    val digits = ('0'..'9').toList()
//    val special = "!@#$%^&*()_+-=[]{}|;:',.<>?/`~".toList()
//
//    val itog = lowerCase + upperCase + digits + special
//
//    val pass = Random.nextInt(8, 17)
//
//    val passw = StringBuilder() //изменяет последовательность
//
//    for (i in 0 until pass) {
//        val randomIndex = Random.nextInt(itog.size)
//        passw.append(itog[randomIndex])
//    }
//
//    println("Сгенерированный пароль: $passw")

    //5 задания



}