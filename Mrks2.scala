var phy = 70 
var chem = 95 
var mat = 90
var fail = 0 
var total = phy + chem + mat
var per = total * 100/150
if (phy < 90){
	fail = fail + 1 
}
if (chem < 90){
	fail = fail + 1
}
if( mat < 90){
	fail = fail + 1
}

if (fail == 0){
	println(total)
	println(per)
}
if (fail == 1){
	println("Repeat Exam")
}
if(fail == 2){
	println("Repeat course")
}
if (fail ==3){
	println("Go Home")
}