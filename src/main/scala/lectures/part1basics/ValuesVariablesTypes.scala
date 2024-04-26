package lectures.part1basics

// "extends App" is equivalent to creating a main function that makes the application runnable
// the alternative is to have a def main in the budy of the object (see Playground.scala)

object ValuesVariablesTypes extends App {

  // syntax is to use val then name, then type then assignment
  val x : Int = 42
  println(x)

  // x = 2 will upset the compiler. Val cannot be reassigned and are immutable.
  // Compiler can infer the type of val. Hence, val x = 42 is valid

  val aString : String = "This is a string";


  val aBool : Boolean = false // Boolean
  val aChar : Char = 'x' // characters
  val aShort : Short = 1233 // short
  val aLong : Long = 1234567L // long
  val afloat : Float = 2.0f // need the f behind otherwise would be considered double
  val aDouble : Double = 3.14

  // Variables. Can be reassigned. They are used as side-effects (i.e. seeing what the code is doing)
  var aVariable : Int = 4
  aVariable = 5

  // Func Prog is about working less with variables and using Vals more. So we need to prefer Vals to Vars.

}
