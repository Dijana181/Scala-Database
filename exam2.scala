var phy = 91
var che = 92
var mat = 93
var total = phy+che+mat 
var per = total*100/400
if (per < 60) {
	println("You have failed.")
}
if (per >= 60) {
	println("Total:"+total, " Percentage:"+per)

		if (per >= 90) {
			println("Grade A+")
		}
		if (per >= 80 && per < 90) {
			println("Grade A")
		}
		if (per >= 70 && per < 80) {
			println("Grade B")
		}
		if (per >= 60 && per < 70) {
			println("Grade C")
		}
}

