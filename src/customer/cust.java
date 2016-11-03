package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.json.JSONException;
import org.json.JSONObject;

public class cust {
	public JSONObject addcust(String cname,String cardno,String amount,int pid) throws JSONException {
		JSONObject result = new JSONObject();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/juice","root","root");
			Statement statement = con.createStatement();
			String query="insert into customer values('" + cname +"','" + cardno +"','" + amount +"')";
			statement.executeQuery(query);
			result.put("Status", "1");
			
		}
		catch(Exception e){
			JSONObject error= new JSONObject();
			error.put("Status", "0");
			error.put("message",e.getMessage());
			return error;
		}
		return result;
	}
}
