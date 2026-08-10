fun main(){
    //null safe ?
    var name:String ?=null//assign null value to variable
    println(name?.length)//null safe operator
   var name1: String?="Pratik"
    println(name1?.length)

    //Elvis operator ?:
    var name2:String?=null
    var lengthOfName:Int=name2?.length?:-1//if name is null then assign -1 to lengthOfName 
    println(lengthOfName)

    //Not null assertion operator !!

    val name3:String?="Pratik"
    println(name3!!.length) // if name3 is null then it will throw null pointer exception

    // null check using if else
    var name4:String?=null 
    if (name4!=null){
        println("length of name4 is ${name4.length}")
    }else{
        println("name4 is null")
    }
}