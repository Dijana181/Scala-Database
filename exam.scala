var phy = 60 
var che = 70 
var mat = 80
var total = phy + che + mat 
var per = total * 100/300
if (per >= 60){
		println("Total Marks:"+total+", Percentage:"+per+"%")
	}
if (per < 60){
	println("You have failed the exam.")
}
