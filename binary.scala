
var num = 7
var sequence = ""

while (num > 0){
	
	if( num % 2 == 0){

		var zero = "0"
		sequence+=zero
	}
	
	if( num % 2 != 0){

		var one = "1"	
		sequence+=one
	}

	num = num/2

}

print(sequence)
