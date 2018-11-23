var countries = List("UK", "USA", "Pakistan")

def FindCapital(C:String):String={
	var City = ""
	if (C=="UK"){
		City = "London"
	} 
	if (C=="USA"){
		City = "Washington"
	}
	if (C=="Pakistan"){
		City = "Islamabad"
	}
	return City
}
var capitals = countries.map(FindCapital)

print(capitals)