package com.jesperdj.example

/**
  * Created by lenovo on 10/8/2017.
  */
case class Student(var name:String,var roll:Int,var marks:Double){
   def display()={
    println("Name :"+this.name)
    println("Roll no: "+this.roll)
    println("Marks:"+this.marks)
    }

  def >(s: Student): Boolean= if (this.marks > s.marks) { return true  } else return false
}
object TestObject {
  def main(args: Array[String]): Unit = {
     var s=new Student("pankaj",40,85.5)
    var s1=new Student("Rahul",54,79)
       s.display()
       s1.display()
       println(s.>(s1))
  }
}
