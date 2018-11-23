var A =2 
var T = 1 

for (A <- 1 to 20) {
	println("Print multiplication table")

	for(T <- 1 to 20){
		print(s"$A x $T ="+(A*T))	
		if ((A*T) %2 ==0){
			print("Even ")
		}
		else{
			print("Odd ")
		}
		
	}

T = 1

}