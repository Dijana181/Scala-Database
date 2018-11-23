
var hundreds = 0
var tens = 0
var units = 0

var x = 100 




def num_reader(hundreds:Int, tens:Int, units:Int) = {


hundreds match {
		case 0 => print(" ")
		case 1 => print("one hundred and ")
		case 2 =>print("two hundred and ")
		case 3 => print("three hundred and ")
		case 4 =>print("four hundred and ")
		case 5 =>print("five hundred and ")
		case 6 =>print("six hundred and ")
		case 7 =>print("seven hundred and ")
		case 8 =>print("eight hundred and ")
		case 9 =>print("nine hundred and ")	
}

tens match {
	case 0 => print(" ")
	case 1 => print(" ")
	case 2 => print("twenty ")
	case 3 => print("thirty ")
	case 4 => print("fourty ")
	case 5 => print("fifty ")
	case 6 => print("sixty ")
	case 7 => print ("seventy ")
	case 8 => print("eighty ")
	case 9 => print("ninety ")
}

units match {
	case 0 => print(" ")
	case 1 => print("one")
	case 2 => print("two")
	case 3 => print("three")
	case 4 => print("four")
	case 5 => print("five")
	case 6 => print("six")
	case 7 => print("seven")
	case 8 => print("eight")
	case 9 => print("nine")
	
}
}
num_reader(7,3,1)