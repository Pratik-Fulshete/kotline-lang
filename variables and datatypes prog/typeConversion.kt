fun main(){
    var num1 = 10
    var num2 = 20.0
    var num3 = 30.0f
    println(num1 is Int)//true
    println(num2 is Double)//true
    println(num3 is Float)//true
    var num4 = num1.toInt()
    println(num4::class.simpleName )
    
    var age ="25"
    println(age is String)//true
    var age1 = age.toInt()
   println(age1 is Int)

}
