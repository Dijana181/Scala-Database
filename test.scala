import java.sql.{Statement,Connection,DriverManager}

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


	// withdraw

	def checkbalance(accountno:Int):Int={
		var added = 0 
		var ddt = 0 
		var balance = 0
	    try {
		    val rs3 = statement.executeQuery("SELECT SUM(Amount) as Amount FROM deposit WHERE AccountNo="+accountno)
		    if (rs3.next){
		 	    added = rs3.getInt("Amount")
		 	    }	
 		    val rs4 = statement.executeQuery("SELECT SUM(Amount) as amount FROM withdraws where AccountNo="+accountno)
	 	    if (rs4.next){
	 	 	   ddt = rs4.getInt("Amount")
	 		}
	 		balance=added-ddt
	 	}
	 	catch {
	 		case e: Exception => print("Problem with account")
	 	}
	 	return balance
	 	
	}

}

var a = new Bank()

println(a.checkbalance(2))