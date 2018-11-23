import java.sql.{Connection,DriverManager}

class Bank{

 
	var statement:Statement=null

     try {

        Class.forName("com.mysql.cj.jdbc.Driver")

        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijan", "root", "")

        statement = connection.createStatement()
    }
    catch{
    	case e:Exception=>println("something went wrong")
    }
    //connection.close



	def create() { 
		print("Please enter your name")
		var name = readLine()
		print("Please enter you address")
		var address =readLine()
		var counter = 100
		var accountno = counter
		counter +=1
		try{
		        statement.executeUpdate("INSERT into personal values('"+accountno+"','"+name+"','"+address+"')")
	        }

	    catch {

	        case e: Exception => println(e)
	    }

	    //connection.close

	}

// Deposit 

	def deposit(){
		
		print("Please enter your Account Number")
		var accountno = readInt()
		
	    try {
	        val rs1 = statement.executeQuery("SELECT * FROM personal where AccountNo="+accountno)
	         if(rs1.next){
	        		val customer = rs1.getString("Name")
	 	      		val address = rs1.getString("address")
	 	      		println("Name:"+customer)
	 	      		println("Address:"+address)
	 	      		println("Enter the Amount to Deposit:")
	 	      		var amount=readInt

	 	      		var query="INSERT into deposit values("+accountno+","+amount+",now())"
			        statement.executeUpdate(query)

			}

			else{
			     	println("Invalid Account Number")
			}

		}	    

		catch{
	    		case e: Exception => print("Incorrect details provided")
	    }

	}

// Withdraw

	def withdraw(){

		print("Please enter your Account Number")
		var accountno = readInt()

		try {
			val rs2 = statement.executeQuery("SELECT * FROM personal where AccountNo="+accountno)
			val rs3 = statement.executeQuery("SELECT SUM(Amount) FROM deposit where AccountNo="+accountno)
			val rs4 = statement.executeQuery("SELECT SUM(Amount) FROM withdraws where AccountNo="+accountno)
			val added = rs3.getInt("Amount")
			val deducted = rs4.getInt("Amount")
			val balance = added-deducted
			if(rs2.next){
				val customer = rs2.getString("name")
				val address = rs2.getString("address")
				println("Name: "+customer)
				println("Address: "+address)
				println("Enter the Amount to Withdraw:")
				
				var amount = readInt
				if(balance > amount){
				var query= "INSERT into withdraws values("+accountno+","+amount+",now())"
				}
				else{
					print("Insufficient funds")
				}
		
			}	
			else{
				println("Invalid Account Number")
			}
		}
		catch {
	    		case e: Exception => print("Incorrect details provided")
	    }

	}


}






















