var word = 0 
var msg = "The Shafeeq was here Shafeeq Shafeeq"
var find = "Shafeeq"
var x=0 

while ( x < msg.length()){
	if(msg.substring(x,x+1) == find.substring(0,1)){
		if(msg.substring(x,x+find.length())==find){
			
			word+=1
			
			x = x+find.length()-1
		}
	}
	x = x+1
	if(msg.substring(msg.length())==find)
		word+=1
}
print(word)
