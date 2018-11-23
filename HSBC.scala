
abstract class Bank{
	def deposit(A:Int)
	def withdraw(A:Int)
	def ShowBalance()
	def msg()={
		println("Hello")
	}
}

class HSBC extends Bank{
	override def deposit(A:Int)={
		println(A+" pounds deposited")
	}
	override def withdraw(A:Int)={
		println(A+" pounds withdrawn")
	}
	override def ShowBalance()={
		println("Balance: ")
	}

}

var Ref = new HSBC()
Ref.ShowBalance()
Ref.deposit(100)
Ref.withdraw(5)

var Ref1 = new Bank()
Ref1.msg