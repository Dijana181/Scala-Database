class Bank {
	var A = 100 
	def Amount(X:Int)={
		println("Amount: "+ (X*Bank.Dollar))
	}
	def setdollar(X:Int)={
		Bank.Dollar = X
	}
}

object Bank {
	var Dollar = 95
}

var HSBC = new Bank()
var Natwest = new Bank()
var Barclays = new Bank()

HSBC.Amount(1)
Natwest.Amount(1)
Barclays.Amount(1)

Natwest.setdollar(150)
HSBC.Amount(1)
