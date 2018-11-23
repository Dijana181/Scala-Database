var a = "I live in Manchester"
var b = ""
var i = a.length 
while (i > 0){
	b = b+a.substring(i-1,i)
	i = i-1
}

print(b)

