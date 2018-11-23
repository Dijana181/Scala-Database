
import java.sql.{Statement,Connection,DriverManager}

var statement:Statement=null
   try {

        Class.forName("com.mysql.cj.jdbc.Driver")

        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijan", "root", "")

        statement = connection.createStatement()
    }
    catch{
    	case e:Exception=>println("something went wrong")
    }
print("Please select an option. \n Option 1: Create Account, \n Option 2: Deposit Money, \n Option 3: Withdraw Funds")

var choice = readInt()
var counter = 3


//Create Account 

if (choice==1){ 
	print("Please enter your name")
	var name = readLine()
	print("Please enter you address")
	var address =readLine()
	var acno = counter 
	counter +=1

		try{
	        statement.executeUpdate("INSERT into personal values('"+acno+"','"+name+"','"+address+"')")
        }

    catch {

        case e: Exception => println(e)

    }

    //connection.close

}

// Deposit 

if (choice==2){
	
	print("Please enter your Account Number")
	var acno = readInt()
	
    try {
        val rs = statement.executeQuery("SELECT * FROM personal where accountno="+acno)
         if(rs.next){
        		val customer = rs.getString("Name")
 	      		val address = rs.getString("address")
 	      		println("Name:"+customer)
 	      		println("Address:"+address)
 	      		println("Enter the Amount to Deposite:")
 	      		var amount=readInt
 	      		var query="INSERT into deposit values("+acno+","+amount+",now())"
		        statement.executeUpdate(query)

		     }
		     else{
		     	println("Invalid Account Number")
		     }
	    }    
	  	catch {
    		case e: Exception => print("Incorrect details provided")
    	}
	}

