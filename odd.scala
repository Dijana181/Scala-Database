var A = 1 
while ( A<=100) {
	if (A!=5) {
		print(A)
		if (A>5) {
			print("x")
			if (A%2 == 0) {
				print("Even")
			}
			else {
				print("Odd")
			}
		}	
		else {
			print("y")
		}
	}	
	else {
		print("OOPS")
	}	
	A = A + 1 				
}