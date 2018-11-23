
def subtraction(X:Int,Y:Int)={
	print(" Result: "+(X-Y))
}

def addition(A:Int,B:Int)={
	print(" Result: "+(A+B))

}

def multiplication(C:Int,D:Int)={
	print(" Result: "+(C*D))
}

def division(E:Int,F:Int)={
	print(" Result: "+(E/F))
}
def operations(calc:(Int,Int)=> Unit){

	calc(7,2)

}

operations(subtraction)
operations(addition)
operations(multiplication)
operations(division)