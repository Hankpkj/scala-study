package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()

    print(balance("(just an) example".toList))

    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
     def factorial(n : Int): Int = {
       def loop(acc:Int, n: Int ): Int =
         if (n==0) acc
         else loop(acc * n, n-1)
       loop(1, n)
     }
       factorial(r)/( factorial(c) * factorial(r-c) )
    }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var nums = 0
      def or(as: List[Char]) : Int = {
        if (as.head == '(') 1
        else if (as.head == ')') -1
        else 0
      }
      def divid(chars: List[Char]): Unit = {
        if (chars.isEmpty == 1 ) 0
        else nums += or(chars.tail)
      }

    divid(chars: List[Char])
    if (nums == 0) true
    else false


  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    }


}
