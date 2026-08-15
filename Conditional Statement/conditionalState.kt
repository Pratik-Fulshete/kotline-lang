fun main(){
val name = "Pratik"
val age = 22
val mark = 82
println("Name: $name")
println("Age: $age")
println("Mark: $mark")
if(age>=18){
    println("$name is eligible for voting")
}else{
    println("$name is not eligible for voting")
}

if(mark>=90){
    println("$name got A grade")
}else if(mark >=75){
    println("$name got B grade")
}else{
    println("$name got C grade")
}

//if statement as expression
val status = if(age>=18)"Adult"else "Minor"
println("$name is $status")

//if with is keyword
val value: Any = 10
if(value is Int){
    println ("$value is Integer")
}
}