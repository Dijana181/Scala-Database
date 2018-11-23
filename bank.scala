
print("Please select an option. Option 1: Create Account, Option 2: Deposit Money, Option 3: Withdraw Funds")

var choice = readInt()
var counter = 3

//Create Account 

if (choice==1){ 
	print("Please enter your name")
	var name = readLine()
	print("Please enter you address")
	var address =readLine()
	var accountno = counter 
	counter +=1


import java.sql.{Connection,DriverManager}


    try {

        Class.forName("com.mysql.cj.jdbc.Driver")

        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijan", "root", "")

        val statement = connection.createStatement

        val rs1 = statement.executeUpdate("INSERT into personal values('"+accountno+"','"+name+"','"+address+"')")

        }

    catch {

        case e: Exception => println(e)

    }

    //connection.close

}

// Deposit 

if (choice==2){
	
	print("Please enter your Account Number")
	var accountno = readInt()
	print("Please enter your name")
	var name = readLine()
	var validaccount = 0 


	import java.sql.{Connection,DriverManager}


    try {

        Class.forName("com.mysql.cj.jdbc.Driver")

        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijan", "root", "")

        val statement = connection.createStatement

        val rs = statement.executeQuery("SELECT * FROM personal")

        

        while(rs.next){

        	val customer = rs.getString("Name")
        	val customerid = rs.getString("AccountNo")

	        if (customer == name){ 
	        	validaccount +=1 
	        } 
	        if (customerid == accountno){
	        	validaccount +=1
	        }
	    }    

    }

    catch {
    	case e: Exception => print("Incorrect details provided")
    }


	if (validaccount ==2){

			print("How much do you want to deposit?")
			var deposit = readInt()

		import java.sql.{Connection,DriverManager}


		    try {

		        Class.forName("com.mysql.cj.jdbc.Driver")

		        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijan", "root", "")

		        val statement = connection.createStatement
		        var query="INSERT into deposit values("+accountno+","+deposit+",now())"
		        println(query)
		        val rs1 = statement.executeUpdate(query)

		    }

		    catch {

		        case e: Exception => println(e)

		    }

		    //connection.close

	}
}

//Withdraw

if(choice==3){
	print("Please enter your Account Number")
	var accountno = readInt
	print("How much do you want to withdraw?")
	var withdraw = readInt()

import java.sql.{Connection,DriverManager}


    try {

        Class.forName("com.mysql.cj.jdbc.Driver")

        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijan", "root", "")

        val statement = connection.createStatement

        val rs1 = statement.executeUpdate("INSERT into withdraws values('"+accountno+"','"+withdraw+"','now()'")

        }

    catch {

        case e: Exception => println(e)

    }

    //connection.close

}

