package com.jesperdj.example

object HelloScala extends App {
  println("Hello Scala")
  /*"pankaj".foreach(println)*/
  println("xxx".getClass.getName)
   val result = "hello world".filter(_ != 'l')
  "pankaj".foreach(println)
  println(result)
  "hello".getBytes().foreach(println)
  var s="welcome".take(6).capitalize

  //multiple line example
  var s1=
    """Pankaj
      |Kumar
      |Sharma
    """.stripMargin.replaceAll("P","A")
  /*String Interpolation */
  val name = "pankaj"
  val age = 30
  val weight= 80.9
  println(s"$name is $age years old and weighs is $weight." )
  /*
       s is method: The s that’s placed before each string literal is actually a method.
        */
val out = f"$name, you weigh $weight%.0f kgs."
  println(out)
/*
In addition to the s and f string interpolators, Scala 2.10 includes another interpolator
named raw.
 */
   val r= raw"pankaj\nsharma"
  println(r)

  /*
   In addition to the s, f, and raw interpolators that are built into Scala 2.10, you can define
your own interpolators.
    */

  val userDef = "%s is %d years old".format(name, age)
  println(userDef)


}
