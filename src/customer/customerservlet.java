package customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

/**
 * Servlet implementation class customerservlet
 */
@WebServlet("/customerservlet")
public class customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public customerservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("operation");
		cust custObject =new cust();
		if(operation.equals("cusadd"))
		{
			String cname=request.getParameter("cname");
			String cardno=request.getParameter("cardNo");
			String amount=request.getParameter("amt");
			//int pid=request.getParameter("pid");
			JSONObject result;
		
	try{
		
		
		result=custObject.custadd(cname,cardno,amount,pid);
		response.getWriter().print(result);
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
		
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
