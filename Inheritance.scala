class One{
	var A = 0

	def message()={
		println("hello")
	}
}

class Two extends One{
	def msg2()={
		println("hello my friend")
	}

}

var Ref = new Two()
Ref.message()
Ref.msg2()