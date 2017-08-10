import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class Solution {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Success");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBook", "adb", "test");
			System.out.println("Connection Success");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select id as identity,dob as dateofbirth from date_info");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"\t"+rs.getString("dob"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
