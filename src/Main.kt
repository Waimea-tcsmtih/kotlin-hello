/**  Kotlin intro*/

/** the main function is the entry to any kotlin program */
fun main()
//output##############################################################################################################
/**we can output to the terminal using print() & println()*/
{
    println("Hello mortal!")
    println("It's time to make life balanced")
    println("THE END IS NEAR.")


//variables###########################################################################################################
//strings are concatenated with a +
    println("l" + "l" + "l")
// in kotlin, there are two types of variables
// if a variable will never change (immutable)
//we use "val" (value)...
    val name = "taine"
    val dab = "26,6,2008"

//if a variable will change (mutable)we use "var" (variable)
    var height = 184
//variable names should always start with a lower case letter
    val numLegs = 2 //good!
    val NumLegs = 2 //bad!

//multiple words in a variable##########################################################################################
    val speicesofpet = "cat" //bad!
    val speciesOfPet = "cat" //Good!....CamelCase
    val species_of_pet = "cat" //Also Good!...SnakeCase

// STRING TEMPLATES####################################################################################################
//We often want to output variable values with text

    println("my name is" + name) //using concentration


    println("my name is  = $name") //using  a template

    println("I have $numLegs = Legs")

    println("I have ${numLegs * 5} toes")

//String Manipulation###############################################################################################


    println(name.uppercase())
    println(name.lowercase())

    val scoreText = "1000" //this is a string
    val score = scoreText.toInt() //This is A Int and we can do maths
    println("score: $score")


    val testText = "Goat"
    val textNum = testText.toIntOrNull() //This copies with
    println(textNum)

//User Input#########################################################################################################
    print("Enter your favorite colour: ")
    val colour = readln()
    println("I like $colour too!")

    print("Enter your favorite number: ")
    val number = readln().toIntOrNull()

//Branching#########################################################################################################

    if (number == null)  {
        println("that's not a number")

    }

    else {

       println("oh, yes! $number is lovely!")

    }

//alternatively
when (number) {
    null -> println("that's not a number")
    7 -> println("Seven is just the best")
    13 -> println("No, That's unlucky")
    else -> println("Oh, interesting")

    }

    //looping / iteration#############################################################################################

    // while loops

    var count = 0
    while (count < 10) {
        println(count)
        count ++

    }

    while (true) {
        println("Hi! Type 'x' to exit")
        val input = readln()
        if (input == "x") break
    }


// for range loop
    for (num in 1..10) {
        println(num)
    

    }}





