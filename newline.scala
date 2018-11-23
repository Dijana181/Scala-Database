var msg = "Hello how are you"
var letter = 0 
var space = 0  

while (letter < msg.length()){
	if(msg.substring(letter, letter+1) == " "){	
		println(msg.substring(space, letter))
		space = letter
	}

}
letter += 1	
print(msg.substring(space))