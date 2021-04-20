open class Person(val name:String, var age:Int) {
    fun talk(words: String) {
        println(words)
    }

    open fun sleep() {
        println("rrrrr")
    }
}
    class Teacher(name: String,age: Int):Person(name,age){
        fun teach(){
            println("i teach all the subjects")
        }

    }
    class Pilot(name: String,age: Int):Person(name, age){
        fun drive(){
            println("the most cherished person")
        }
    }
    class Lecture(name: String,age: Int):Person(name,age){
        fun lecture(){
            println("they lecture university students")
        }
        override fun sleep(){
            super.sleep()
            println("fffff")
        }
    }

fun main() {
    var myTeacher = Teacher("Mandek", 20)
    println(myTeacher.name)
    myTeacher.age
    myTeacher.talk("i teach all the subjects")
    var myPilot = Pilot("Hassan", 45)
    println(myPilot.age)
    myPilot.name
    println(myPilot.name)
    myPilot.talk("the most cherished person")
    var ourLecture = Lecture("zulia", 23)
    println(ourLecture.age)
    ourLecture.sleep()
    println(ourLecture.name)






}