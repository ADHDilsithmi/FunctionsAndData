object Quiz03 extends App {

  class bankAccount(id:String, n:Int, b:Double){
    val nic:String = id
    val accnum:Int = n
    var balance:Double = b

    def withdraw(a:Double) = this.balance -= a

    def deposit(a:Double) = this.balance += a

    def transfer(a:bankAccount, b:Double):Unit = {
      this.withdraw(b)
      a.deposit(b)
    }

    override def toString = "NIC : " + this.nic + "   Acc. NO : " + this.accnum + "   Balance : " + this.balance
  }

  val acc1 = new bankAccount("892652634", 5035, 20000)
  val acc2 = new bankAccount("983924335", 8055, 50000)

  println("Before transfer money")
  println(acc1)
  println(acc2)

  acc1.transfer(acc2, 10000)

  println("After transfer money")
  println(acc1)
  println(acc2)

}
