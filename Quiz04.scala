object Quiz04 extends App {

  class bankAccount(id:String,a:Int,b:Double){

    var nic:String=id
    var accnum:Int =a
    var balance:Double =b

    override def toString = "NIC : "+nic+"   Acc. NO : "+accnum+"   Balance : "+balance

  }

  val account1= new bankAccount("892652634",5001,30500)
  val account2= new bankAccount("653347851",5010,-10000)
  val account3= new bankAccount("245887634",6003,95400)
  val account4= new bankAccount("912576843",7100,-40000)
  val account5= new bankAccount("687412583",8025,58700)

  var bank:List[bankAccount]=List(account1,account2,account3,account4)

  val overdraft = bank.filter(x=>x.balance<0)
  val balance = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[bankAccount])=>b.map((x) => (x.nic,x.accnum,if(x.balance>0)  (x.balance+(x.balance*0.5)) else (x.balance+(x.balance*0.1)) ))

  println("Overdraft Account List : \n" + overdraft)
  println(" \n Sum of all accounts : Rs:" + balance)
  println(" \n After interest, sum of all accounts : \n" + interest(bank))

}
