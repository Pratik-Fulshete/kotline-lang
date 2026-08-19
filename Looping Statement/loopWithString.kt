fun main(args: Array<String>) {
    val name = "Praatik"
    var count=0
    for(ch in name){
        if(ch=='a'){
            count++
        }
    }
    println("a is occures $count times!")

   println("With indexes")

   val name1 = "Pratik"
   for(i in name1.indices){
    println("Index $i : ${name1[i]}")
   }
}