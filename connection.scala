
import java.sql.{Connection,DriverManager}


    try {

        Class.forName("com.mysql.cj.jdbc.Driver")

        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijan", "root", "")

        val statement = connection.createStatement

        val rs = statement.executeQuery("SELECT * FROM personal")

println("-------------------------------")

        while (rs.next) {

            val name1 = rs.getString("name")

            val address1 = rs.getString("address")

            println(name1+"....."+address1)

        }

    } catch {

        case e: Exception => println(e)

    }

    //connection.close
