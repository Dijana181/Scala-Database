var msg = " I have four, four teams four"
var find = "four"
var i = 0 
var word = 0


while (i< msg.length()-find.length()){
	
	if (msg.substring(i, i+find.length()) == find){
		word +=1
	}

	i = i + 1	
}

print(word)