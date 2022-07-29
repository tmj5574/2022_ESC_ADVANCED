package example.myapp



/*class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) { //기본 생성자
        // Dimensions in cm
        var length: Int = length
        var width: Int = width
        var height: Int = height

        fun printSize(){
            println("Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm ")
        }

    }*/


class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init { //초기화될때 나타나는 문구들 정의
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} l")
    }
    fun printSize(){
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
    }
}



