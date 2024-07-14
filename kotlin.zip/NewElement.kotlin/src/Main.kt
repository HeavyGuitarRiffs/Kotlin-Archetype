//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args : Array<String>) {
    var name: String
    name = "John"
    println(name)
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    // This is a comment
    /* The code below will print the words Hello World
to the screen, and it is amazing */
    println("Hello, " + name + "!") // This is a comment
    println("Kotlin = Java - SemiColons")
    println("Portmanteaus are powerful")
    println(1 + 3)

    val birthyear = 1989    // Int (number)

    println(name)          // Print the value of name
    println(birthyear) // Print the value of birthyear

    val pi = 3.14159265359
    println(pi)

    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    val myGrade: Char = 'B'
    println(myGrade)

    val myText: String = "Hello World"
    println(myText)

    var greeting: String = "Hello"

    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)

    var txt1 = "It's alright"
    var txt2 = "That's great"

    var firstName = "John"
    var lastName = "Doe"
    println("My name is $firstName $lastName")

    val x = 10
    val y = 9
    println(x > y) // Returns true, because 10 is greater than 9

    println(10 > 9) // Returns true, because 10 is greater than 9

    println(10 == 15); // Returns false, because 10 is not equal to 15

    if (20 > 18) {
        println("20 is greater than 18")

// Outputs "Good evening."

            var i = 0
            while (i < 10) {
                if (i == 4) {
                    i++
                    continue
                }
                println(i)
                i++
            }
// Now outputs Opel instead of Volvo

            val nums = arrayOf(1, 5, 10, 15, 20)
            for (x in nums) {
                println(x)
            }

            for (chars in 'a'..'x') {
                println(chars)
            }

            for (nums in 5..15) {
                println(nums)
            }

            val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
            if ("Volvo" in cars) {
                println("It exists!")
            } else {
                println("It does not exist.")
            }

            for (nums in 5..15) {
                if (nums == 10) {
                    break
                }
                println(nums)
            }

            for (nums in 5..15) {
                if (nums == 10) {
                    continue
                }
                println(nums)
            }

            fun main() {
            }
                println("Hello World")
            }

        fun myFunction() {
            println("Coding is Subversive")
        }

        
            myFunction() // Call myFunction

// Outputs "Coding is Subversive"

            myFunction()
            myFunction()
            myFunction()

// Coding is Subversive!
// Coding is Subversive!
// Coding is Subversive!

        fun myFunction(fname: String) {
            println(fname + " Doe")
        }

            myFunction("John")
            myFunction("Jane")
            myFunction("George")

// John Doe
// Jane Doe
// George Doe

        fun myFunction(fname: String, age: Int) {
            println(fname + " is " + age)
        }

            myFunction("John", 35)
            myFunction("Jane", 32)
            myFunction("George", 15)

// John is 35
// Jane is 32
// George is 15

        fun myFunction(x: Int): Int {
            return (x + 5)
        }

        fun main() {
            var result = myFunction(3)
            println(result)
        }

// 8 (3 + 5)

// 8 (3 + 5)

        fun myFunction(x: Int, y: Int) = x + y

            var result = myFunction(3, 5)
            println(result)

// 8 (3 + 5)

// Access the properties and add some values to it

        class Car(var brand: String, var model: String, var year: Int) {
            // Class function
            fun drive() {
                println("Wrooom!")
            }

            // Class function with parameters
            fun speed(maxSpeed: Int) {
                println("Max speed is: " + maxSpeed)
            }
        }
            val c1 = Car("Ford", "Mustang", 1969)

            // Call the functions
            c1.drive()
            c1.speed(200)

        // Superclass
        open class MyParentClass {
            val x = 5
        }

        // Subclass
        class MyChildClass: MyParentClass() {
            fun myFunction() {
                println(x) // x is now inherited from the superclass
            }
        }

        // Create an object of MyChildClass and call myFunction

        for (i in 1..5) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            println("i = $i")

        }}