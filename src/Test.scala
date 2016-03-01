/**
  * Created by prai21 on 2/24/2016.
  */
object Test {

  def main(args: Array[String]) {
    println("don't say hello world...")


      var x = 10: Int

    if(x<=10)
      println("Hollaaa")

    //--loop
    for(x <- 1 to 10) {
      println("Hollaaa : "+ x)
    }

    for (x <- 1 until 10) {
      println("Until Test => "+x)
    }

    //-List [Lists in scala are immutable]
    val list = List (1,2,3,4,5)
    for (x <- list) {
      println("list index = "+x)
    }

    val numList = List (10,20,30,40,50)

    //--yield
    var retVal = for {x <- numList
                    if x != 20; if x>30 && x <50
                  }yield x

    for (x <- retVal) {
      println("yield demo = " + x)
    }

    var sum = add(10, 20)
    println("sum = "+sum)
  }

  def add (a: Int, b: Int): Int = {
    println("add called: "+ (a+b))
    return (a+b)
  }

}
