fun main (){
    //inclusive .. range
    for (i in 1..10) {
        //println(i)
    }
    //until (ends value exclusive)
    for(i in 1 until 5){
       // println(i)
    }
    //downTo (for reverse iteration)
    for(i in 5  downTo 1){
       // println(i)
    }
    //step (use for loop value increases and decreases)
    for (i in 1..10 step 2) {//value increase by 2 
       // println(i)
        
    }
    for(i in 10 downTo 1 step 2){//value decrease by 2
       // println(i)
    }

    //even odd printing
    for(i in 2..20 step 2){
       // println(i)
    }
    for(i in 1..20 step 2){
        println(i)
    }
}