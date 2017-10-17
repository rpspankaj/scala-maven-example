package com.jesperdj.example

/**
  * Created by lenovo on 10/1/2017.
  */
object StringProcessing  extends App{
  val upper1 = "hello, world".map(c => c.toUpper)
  val upper = "hello, world".filter(_ != 'l').map(_.toUpper)
  val s="x||yz".toUpperCase
  System.out.println(s)
    println(upper)

  //understanding how map works
  val hello="HELL$O".map(c => (c.toByte+32).toChar)
  println(hello)

  // write your own method that operates on a character
  def toLower(c: Char): Char = (c.toByte+32).toChar
  "HELLO".map(toLower)

 // As an added benefit, the same method also works with the for/yield approach:
    for (c <- "HELLO") yield toLower(c)

  val a = Array("apple", "banana", "orange")
  for(e<-a)println(e.toUpperCase)
  //Returning values from a for loop In cases where you want to build a new
 // collection from the input collection, use the for/yield combination:
  val newArr=for(e<-a) yield e.toUpperCase
  for(e <- newArr)println(e)


}
