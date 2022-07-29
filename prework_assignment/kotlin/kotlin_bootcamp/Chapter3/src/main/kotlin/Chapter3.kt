import java.util.Random

/*fun main(args: Array<String>) {
    println("Hello, world!")
}*/

/*fun main(){
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature>50) true else false
    println(isHot)

    val message = "The water temperature is ${if (temperature>50) "too warm" else "OK"}."

    println(message)
}*/

/*fun randomDay() : String {
    val week = arrayOf("Monday", "Thuesday", "WednesDay")
    return week[Random().nextInt(week.size)]
}

fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun main(args:Array<String>){
    feedTheFish()
}*/

/*fun fishFood (day : String) : String { //인자로 String
    var food = ""
    when (day) { //day가 월요일이면,, 화요일이면,,,
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"

        //else -> food = "fish"
    }
    return food
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println ("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = arrayOf("Monday", "Thuesday", "WednesDay")
    return week[Random().nextInt(week.size)]
}

fun main(args: Array<String>) {
    feedTheFish()
}
*/

////compact 함수////
fun swim(speed : String = "fast"){ //전달된 거 없으면 fast로 지정
    println("swimming $speed")
}

fun main(args : Array<String>){
    swim()
    swim("slow")
    swim(speed = "turtle")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean { //day의 기본값이 안정해졌으므로 전달되어야함
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}

