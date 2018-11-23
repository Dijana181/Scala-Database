import java.sql.{Statement,Connection,DriverManager}

var statement:Statement=null
   try{
        Class.forName("com.mysql.cj.jdbc.Driver")
        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijan", "root", "")
        statement = connection.createStatement()
    }
    catch{
    	case e:Exception=>println("something went wrong")
    }

//Create Account 
def create{ 
	print("Please enter your name")
	var name = readLine()
	print("Please enter your address")
	var address =readLine()
	try{
        statement.executeUpdate("INSERT into personal values(null,'"+name+"','"+address+"')")
    }
    catch {
       case e: Exception => println(e)
    }

}

def deposit{
	var acno = askAccno()
	try {
        		if( displayInfo(acno)==true){
	 	      		println("Enter the Amount to Deposit:")
	 	      		var amount=readInt
	 	      		var query="INSERT into deposit values("+acno+","+amount+",now())"
			        statement.executeUpdate(query)
		    	}	
		}
		catch {
    	case e: Exception => print("Incorrect details provided")
    }
	
}

// withdraw

def withdraw{
	
	print("Please enter your Account Number")
	var acno = readInt()
	var added = 0 
	var ddt = 0 
	var balance = added-ddt


    try {
        if (displayInfo(acno)){
	 	   	println("Please enter the amount that you wish to add: ")
		 	var amount=readInt()
		 	    if (checkbalance(acno) >= amount){	
		 	    	var query="INSERT into withdraws values("+acno+","+amount+",now())"
					statement.executeUpdate(query)
				}
			} 
		}   
	catch {
    		case e: Exception => print("Incorrect details provided")
    }
		
}
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
def displayInfo(acno:Int):Boolean={
		val rs = statement.executeQuery("SELECT * FROM personal where accountno="+acno)
        if(rs.next){
 	      		println("Name:"+rs.getString("Name"))
 	      		println("Address:"+rs.getString("address"))
     	return true
 	    } 
 	    else{
 	    	return false
 	    }
	}
def askAccno():Int={
	print("Please enter your Account Number")
	var acno = readInt()
	return acno
}


print("Please select an option. \n Option 1: Create Account, \n Option 2: Deposit Money, \n Option 3: Withdraw Funds Option, \n Option 4:Ends Session:\n")	
var choice = readInt()
var a = new Bank()

choice match {
	case 1 => a.create
	case 2 => a.deposit
	case 3 => a.withdraw
	case 4 => print("End of session")
	case _ => print("Invalid number entered")	
}
  