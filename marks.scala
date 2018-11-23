
var phy = 30 
var phyper = phy * 100/150
var che = 30 
var cheper = che * 100/150
var mat = 30 
var matper = mat * 100/150 

var total_marks = phy + che + mat
var per = (phy+che+mat)*100/450

if (phyper > 60 && cheper > 60 && matper > 60) {
		println("Total Marks:"+total_marks+"Percentage:"+per)
}

if (phyper < 60 && cheper < 60 && matper < 60) {
		println("Go Home")
}



/*
if (phyper < 60 && cheper > 60 && matper > 60) {
		println("Repeat Exam")
}
if (phyper > 60 && cheper < 60   && matper > 60){
		println("Repeat Exam")
}
if (phyper > 60 &&  cheper > 60 && matper < 60 ){
		println("Repeat Exam")
}*/


if ((phyper < 60 && cheper < 60 && matper > 60) || (phyper < 60 && cheper > 60 && matper < 60) || (phyper > 60 && cheper < 60 && matper < 60)) {
		println("Repeat course")
}

else {
		println("Go Home")
}