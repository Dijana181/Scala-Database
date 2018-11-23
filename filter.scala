
var list1 = List(24,37,42,98,31)
var list2 = list1.filter(CheckNo)

def CheckNo(A:Int):Boolean={
	if(A%2==0){
		return true
	}
	else{
		return false
	}

}
print(list2)

