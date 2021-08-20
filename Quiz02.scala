object Quiz02 extends App {

  class Rational(a:Int, b:Int){

    private def gcd(a:Int, b:Int):Int = if(b == 0) a else gcd(b, a % b)

    private val g = gcd(Math.abs(a), Math.abs(b))
    val numer = a / g
    val denom = b / g

    def neg = new Rational(- this.numer, this.denom)

    def +(num:Rational):Rational = {
      new Rational(this.numer * num.denom + num.numer * this.denom, this.denom * num.denom)
    }

    def com(num:Rational):Rational = {
      this + num.neg
    }

    override def toString = this.numer.toString + " / " + this.denom.toString
  }

    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    println(x.com(y).com(z))

}
