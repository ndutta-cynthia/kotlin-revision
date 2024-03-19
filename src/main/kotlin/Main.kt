fun main() {
    var fname = "Martin"
    var lname = "Kasuku"
    var fullName = "$fname $lname"
    println(fullName)


    var name = "Jane"
    var age = 24
    var occupation = "pilot"
    var statement = "$name, who is $age years old is a $occupation"
    println(statement)

    val fruit = "Avocado"
    println(fruit[0])
    println(fruit[3])
    println(fruit.first())
    println(fruit.last())
    println(fruit.indexOf("a"))
    println(fruit.indexOf("d"))
    println(fruit.lastIndexOf("o"))
    println(fruit.indexOf("x"))


    val city = "Kigali"
    val city2 = "Kiseka"
    println(city == city2)
    println(city.uppercase())
    println(city.lowercase())

    val emptyString = ""
    val blankString = " "
    println(emptyString.isEmpty())
    println(blankString.isEmpty())
    println(blankString.isBlank())
    println(blankString.isBlank())

    val town = " Kampala "
    println(town)
    println(town.trimStart())
    println(town.trimEnd())
    println(town.trim())

    val sentence = "Jane is the minister for finance"
    println(sentence.startsWith("j"))
    println(sentence.startsWith("J"))
    println(sentence.startsWith("Jan"))
    println(sentence.endsWith("t"))
    println(sentence.endsWith("e"))

    println(sentence.replace("finance", "health"))
    println(sentence.replace("i", "v"))

    var phoneNumber = "0712345678"
    if (phoneNumber.startsWith("07")) {
        var slice = phoneNumber.substring(1)
        phoneNumber = "+254$slice"
        println(phoneNumber)

        var weight = 40.8
        println(weight.toString() + "kg is how much i weight")


        var sentence = "A small bird perched on rear window"
        println(sentence.split(" "))
        println(sentence.split("p"))
        println(sentence.split(""))


    }

}







