package com.myorg.javacourse;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Google_App_Engine_projectServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		int num1, num2, num3, result;
		num1= 4;
		num2= 3;
		num3= 7;
		result = (num1+num2)*num3;
		String str = new String("<h1> The result of ("+num1+"+"+num2+") *"+num3+ " = "+result+"</h1>");
		resp.setContentType("text/plain");
		//resp.getWriter().println("Hello, world Ed");
		resp.getWriter().println(str);
		
	}
}
