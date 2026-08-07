fun main() {
    var age = 22 //mutable not suggested reassign allowed
    val country = "India" // immutable suggested reassigned not allowed
    println(age)
    age = 23  //reassign
    println(age)
    println(country)
   // country = "Usa"//Main.kt:8:5: error: val cannot be reassigned

}