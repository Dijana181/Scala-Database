

def ty(no:Int):String = {

	var result = " "

	no match {

		case 20 =>print(" twenty ")
		case 30 => print(" thirty ")
		case 40 =>print(" fourty ")
		case 50 =>print(" fifty ")
		case 60 =>print(" sixty ")
		case 70 =>print(" seventy ")
		case 80 =>print(" eighty ")
		case 90 =>print(" ninety ")		
		}
		return result
	}

def ones(no:Int):String = {

	var result = " "

	no match {

		case 1 => print(" one ")
		case 2 => print(" two ")
		case 3 => print(" three ")
		case 4 => print(" four ")
		case 5 => print(" five ")
		case 6 => print(" six ")
		case 7 => print(" seven ")
		case 8 => print(" eight ")
		case 9 => print(" nine ")
		case 10 => print(" ten ")
		case 11 => print(" eleven ")
		case 12 => print(" twelve ")
		case 13 => print(" thirteen ")
		case 14 => print(" fourteen ")
		case 15 => print(" fifteen ")
		case 16 => print(" sixteen ")
		case 17 => print(" seventeen ")
		case 18 => print(" eighteen ")
		case 19 => print(" ninteen ")
		}
		return result
	}

var num = 251
var answer = " "

if (num >= 1000){
	answer = ones(num/1000)+"Thousand"
	num = num - (num/1000)*1000
}

if (num >= 100) {
	answer += ones(num/100)+"Hundred"
	num = num - (num / 100 )*100
}	

if (num >= 20) {
	answer = ty(num/10*10)+ones(num%10)
}

if (num <= 19){
	answer += ones(num)
}