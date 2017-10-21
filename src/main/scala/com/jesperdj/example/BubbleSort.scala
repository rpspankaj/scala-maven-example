package com.jesperdj.example


object BubbleSort {

  def swap(j: Int, k: Int, numbers: Array[Int]): Unit = {
    var t: Int =numbers(j)
    numbers(j)=numbers(k)
    numbers(k)=t
  }

  def main(args: Array[String]): Unit = {
    var numbers = Array(11, 10, 3, 4,1,17)
    var size =numbers.length
    var i=0
    for ( i <- size-1 to 0 by -1){
      for(j<- 0 until i){
        var k=j+1
        if(numbers(j)>numbers(k)){
          swap(j,k,numbers)
        }
        println(numbers.mkString(","))
      }
    }
  }
}
