//Implement a Data Structure for Rational Number and create a method neg to class Rational that is used like this:
//x.neg // evaluates to -x

object Quiz01 extends App {

  class Rational(x:Int, y:Int){

    private def gcd(x:Int, y:Int):Int = if(y == 0) x else gcd(y, x % y)

    private val g = gcd(Math.abs(x), Math.abs(y))
    val numer = x / g
    val denom = y / g

    def neg = new Rational(- this.numer, this.denom)

    override def toString = this.numer.toString + " / " + this.denom.toString
  }

  val num1 = new Rational(2, 5)

  println(num1)
  println(num1.neg)

}
