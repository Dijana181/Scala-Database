



abstract class Draw{
	def Drawing()={

	}
}

class Line extends Draw {
	override def Drawing()={
		println("Draw Line")
	}

}

class Circle extends Draw {
	override def Drawing()={
		println("Draw Circle")
	}
}

def letsdodrawing(x:Draw){
	x.Drawing()
}

var L = new Line()
letsdodrawing(L)

var C = new Circle()
letsdodrawing(C)