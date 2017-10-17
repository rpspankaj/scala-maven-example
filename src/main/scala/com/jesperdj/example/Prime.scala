package com.jesperdj.example

import scala.collection.immutable

/**
  * Created by lenovo on 10/15/2017.
  */
class SieveOfEratosthenes{
  def sieveOfEratosthenes(n:Int) ={
    val prime : Array[Boolean] = new Array[Boolean](n+1);
    for(i <- 0 to n) prime(i) = true;
      var p=2
     while (p*p <=n ){
         if(prime(p)){
           // Update all multiples of p
           var i = p * 2
           while ( i <= n) {
             prime(i) = false
             i += p
           }
         }
        p+=1
      }
    // Print all prime numbers// Print all prime numbers

    var i = 2
    while (i <= n) {
      if (prime(i)) println(i + " ")
        i += 1
    }

  }
}

object Prime {
  def main(args: Array[String]): Unit = {
    val n = 100000000
    var intial = System.currentTimeMillis()
    print("Following are the prime numbers ")
    println("smaller than or equal to " + n)
    val g = new SieveOfEratosthenes
    g.sieveOfEratosthenes(n)
    var aft = System.currentTimeMillis()
    println("total time taken in second:"+(aft-intial)/1000)
  }
}
