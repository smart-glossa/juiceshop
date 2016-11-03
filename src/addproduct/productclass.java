package addproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class productclass {
	public JSONObject productadd(String pName,String quantity,String price) throws JSONException{
		JSONObject result =new JSONObject();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/juice","root","root");
			Statement statement = con.createStatement();
			String query= "Insert into product values('"+ pName + "','" + product.getquantity() + "','" + product.getprice() +"')";
			
			statement.execute(query);
			result.put("Status" , "1");
					
		}
		catch(Exception e){
			JSONObject error= new JSONObject();
			error.put("Status" , "0");
			error.put("Message",e.getMessage());
			return error;
			
			
		}
		return result;
		
		}
	public JSONObject proupdate(String quantity,String price) throws JSONException{
		JSONObject result=new JSONObject();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/juice","root","root");
			Statement statement = con.createStatement();
			String query = "Insert into product values('" + quantity +"','" + price +"')";
			statement.execute(query);
			result.put("Status", "1");
			}
		catch(Exception e){
			JSONObject error = new JSONObject();
			error.put("Status", "0");
			error.put("Message", e.getMessage());
			return error;
			
		}
		return result;
	}
	public JSONObject prodelete(int pid) throws JSONException{
		JSONObject result=new JSONObject();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/juice","root","root");
			Statement statement = con.createStatement();
			String query = "delete from product where pid='" + pid +"'";
			statement.execute(query);
			result.put("Status", "1");		 
			
			}
		catch(Exception e){
			JSONObject error = new JSONObject();
			error.put("Status","0");
			error.put("Message",e.getMessage());
			//return error; 
		}
		
		return result;
		
	}
	public JSONArray getallproduct() throws JSONException{
		JSONArray result=new JSONArray();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/juice","root","root");
			Statement statement = con.createStatement();
			String query ="select * from product";
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()){
				JSONObject product =new JSONObject();
				product.put("pid",rs.getInt("pid"));
				product.put("pName",rs.getInt("pName"));
				product.put("quantity",rs.getInt("quantity"));
				product.put("price",rs.getInt("price"));
			}
		}
		catch(Exception e){
			JSONArray error = new JSONArray();
			error.put("Message");
			return error;
		}
		return result;
	}
}
