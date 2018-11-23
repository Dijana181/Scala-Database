class Manchester {

	var Qty = 100
	var Price = 2 

	def tot= {

		println(Qty*Price)

	}
}

var x = new Manchester()
println(x.Qty)
println(x.Price)
x.Qty = 50
println(x.Qty)
x.tot