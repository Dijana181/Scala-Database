

def ty(no:Int):String = {

	var result = ""

	no match {

		case 20 =>result=" twenty"
		case 30 => result=" thirty"
		case 40 =>result=" fourty"
		case 50 =>result=" fifty"
		case 60 =>result=" sixty"
		case 70 =>result=" seventy"
		case 80 =>result=" eighty"
		case 90 =>result=" ninety"
		case _   => result=""		
		}
		return result
	}

def ones(no:Int):String = {

	var result = ""

	no match {

		case 1 => result=" one"
		case 2 => result=" two"
		case 3 => result=" three"
		case 4 => result=" four"
		case 5 => result=" five"
		case 6 => result=" six"
		case 7 => result=" seven"
		case 8 => result=" eight"
		case 9 => result=" nine"
		case 10 => result=" ten"
		case 11 => result=" eleven"
		case 12 => result=" twelve"
		case 13 => result=" thirteen"
		case 14 => result=" fourteen"
		case 15 => result=" fifteen"
		case 16 => result=" sixteen"
		case 17 => result=" seventeen"
		case 18 => result=" eighteen"
		case 19 => result=" ninteen"
		case _   => result=""
		}
		return result
	}

	var answer = ""
	var start=200
	var end=345
	for (N <- start to end){
		var No=N
		answer=""
		if(No>=100 && No<1000){

			answer = ones(No/100) +" hundred "+ ty(No%100/10*10) + ones(No%100%10)
			No=No-(No/100*100)
		}

		if (No >= 20) {
			answer = ty(No/10*10)+ones(No%10)
		}
		
		if (No <= 19){
			answer += ones(No)
		}
	println(answer)

}