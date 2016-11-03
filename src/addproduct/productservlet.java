package addproduct;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class productservlet
 */
@WebServlet("/productservlet")
public class productservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public productservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("operation");
		productclass productObject = new productclass();
		if(operation.equals("proadd"))
		{
			String  pName= request.getParameter("pname");
			String quantity = request.getParameter("qty");
			String price= request.getParameter("price");
			
			JSONObject result;
			try{
				result=productObject.productadd(pName,quantity,price);
				response.getWriter().print (result);
			}
			catch(JSONException e)
			
			{
			e.printStackTrace();
				
			}
		}
			else if(operation.equals("proupdate"))
			{
				String quantity = request.getParameter("qty");
				String price = request.getParameter("price");
				
				JSONObject result;
				
				try{
					result=productObject.proupdate(quantity,price);
					response.getWriter().print(result);
				}
				catch(JSONException e)
				{
					e.printStackTrace();
				}
			}
			else if(operation.equals("prodelete")){
				int pid=Integer.parseInt(request.getParameter("pid"));
				JSONObject result;
				try{
					result=productObject.prodelete(pid);
					response.getWriter().println(result);
					
				}
				catch(JSONException e){
					e.printStackTrace();
				}
			}
			
			else if(operation.equals("getallproduct")){
		JSONArray result;
			}
		try{
			JSONArray result = productObject.getallproduct();
			response.getWriter().print(result);
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
