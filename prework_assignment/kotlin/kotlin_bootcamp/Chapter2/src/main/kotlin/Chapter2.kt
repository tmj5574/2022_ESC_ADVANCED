import java.util.*

@Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
fun main() {

    /////////////1단계//////////////
    val b2: Byte = 1
    println(b2)

    // val i1 : Int = b2 *타입 캐스팅 오류

    val i4: Int = b2.toInt()
    val i5: String = b2.toString()
    val i6: Double = b2.toDouble()

    val oneMillion = 1_000_000 //긴 상수는 밑줄 넣기 가능


    //var -> 나중에 값 변경 가능

    var fish = 1
    fish = 2
    println(fish)
    val aquariunm = 1
    // aquariunm = 2 error

    //클론으로 타입 명시 가능

    var fishes: Int = 2
    var lakes: Double = 2.5

    //문자열은 + 을 통해서 합치기 가능

    val numberOfFish = 5
    val numberOfPlants = 12
    "I have $numberOfFish fish and $numberOfPlants plants"
    //$로 변수 출력
    "I have ${numberOfFish + numberOfPlants} fish and plants" // 17
    //중괄호 활용

    //////3.조건과 부울 비교///////
    val numberOfFish2 = 50
    val numberOfPlants2 = 23

    if (numberOfFish2 in 1..50){ //점 두개로 범위. 전체적인 조건문 작성은 자바랑 비슷
        println(numberOfFish2)
        numberOfFish2 //값 리턴
    }

    when(numberOfFish2){
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish")
        else -> println("That's a lot of fish")
    }


    //////4. null 허용 여부 알기///////
    //var rocks : Int = null *null 은 변수의 값이 될 수 없다

    var marbles : Int? = null //변수가 null일 수 있음을 밝힘

    var fishFoodTreats = 6
    //fishFoodTreats = fishFoodTreats?.dec() // if ( fishFoodTreats != null)

    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    //null이 아니면 감소 시키고 사용하고 null 이면 0으로 사용?

    /////5. 배열, 루프/////

    val school = listOf("mackerel","trout","halibut")
    println(school) // -> [mackerel, trout, halibut]
    val myList = mutableListOf("tuna", "salmon","shark")
    myList.remove("shark")

    println(myList) //->[tuna, salmon]

    //배열은 리스트와 달리 크기와 순서가 고정된다

    val school2 = arrayOf("Shark", "salmon", "minnow")
    println(Arrays.toString(school2)) //-> [Shark, Salmon, minnow]

    val mix = arrayOf(2, "fish") //타입 섞여도 무상관
    val numbers = intArrayOf(1,2,3)
    val numbers2 = intArrayOf(4,5,6)
    val new = numbers + numbers2

    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList) // 배열의 주소 인쇄

    //배열을 0으로 초기화 하는 대신 코드로 초기화 할 수 있다
    val array = Array(5) {it*2}
    println(Arrays.toString(array))


    for (element in school) { //in 을 사용한 for 루프
        print(element + " ")
    }

    for ((index, element) in school.withIndex()){
        println("Item at $index is $element\n")
    }


}


