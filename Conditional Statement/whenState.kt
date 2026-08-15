fun main (){
    val day = 5
  /*   when (day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wensday")
        4 -> println("Thursday")
        5 -> println("Friday")
        else -> println("Weekend")
    }*/
     val Day = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wensday"
        4 -> "Thursday"
        5 -> "Friday"
       else -> "Weekend"
         }
         println("Day is $Day")

        // multiple values in when statement
        val day1 = 6
        when(day1){
            1,2,3,4,5 -> println("Weekday")
            6,7 -> println("Weekend")
            else -> println("Invalid day")
        } 
      // when statement without argument 
      val number = 10
      when {
        number % 2 == 0
         -> println("Even")  
        number % 2 !=0
         -> println("Odd")
         else -> println("Invalid number")    
        }
        //when statement with range
        val number1 = 15
        when(number1){
            in 1..10 -> println("Number is between 1 to 10")
            in 11..20 -> println("Number is between 11 to 20")
            else -> println("Number is not in range")
        }

        //when statement with type checking using is keyword
        val value: Any = "Pratik"
        when(value){
            is String -> println("str")
            is Int -> println("Int")
            is Double -> println("Double")
            else -> println("Other type")
        }

    }
