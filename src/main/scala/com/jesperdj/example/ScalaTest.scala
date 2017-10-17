package com.jesperdj.example

/**
  * Created by lenovo on 10/7/2017.
  */
object ScalaTest {
  def main(args: Array[String]) {
    var i=0
    while (i<=10){
      println(i)
      i+=1;
    }
  //  var j=0
    val aList=List(1,2,3,4,5,6)
    for(j <-  aList){
      println(j)
    }
    var list= for {i <- 1 to 20
                   if (i % 2 == 0)
    } yield i
    println(list)
  }
}
