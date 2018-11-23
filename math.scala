class Math{

var a = 10 

def Addition (A:Int,B:Int){
	var Result = A+B
}

def subtraction (A:Int,B:Int){
	println(A-B)
}

}

class Math2 extends Math{
	def multiplication(A:Int,B:Int){
		var Result = A*B
		println("Result: "+Result)
	}
}

class Math3 extends Math{
	override def subtraction(A:Int,B:Int){
		var Result = A-B
		println("Result: "+Result)
	}
}

var ref = new Math3()
ref.subtraction(10,5)
println("")

var ref1 = new Math2()
ref1.multiplication(10,5)
println("")

var ref2 = new Math()
ref2.subtraction(10,5)