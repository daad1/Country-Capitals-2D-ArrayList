
 fun main(args: Array<String>) {

     // Create arraylist of country and capital
     val countriesAndCapitals = mutableMapOf<String, String>()

     //Create for loop to ask user enter country and capital

     for (time in 0..2) {

         print("Enter the country : ")
         val country = readLine()!!.toString()
         print("Enter the capital : ")
         val capital = readLine()!!.toString()

         //After that add instead arraylist
         countriesAndCapitals[country] = capital
     }
     //finally, will print the arrayList

     println(countriesAndCapitals)
 }