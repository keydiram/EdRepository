package com.myorg.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class NewServlet extends HttpServlet {

                /**
                * 
                 */
                private static final long serialVersionUID = 1L;

                protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
                                                throws ServletException, IOException {
                                
                                int radius=50;
                                double pie=Math.PI;
                                double circleArea=(radius*radius)*pie;
                                
                                int hypo=50;
                                double angleB=30;
                                double radians = Math.toRadians(angleB);
                                double opposite=(int) Math.ceil(Math.sin(radians)*hypo);
                                
                                double base=20;
                                double exp=13;
                                double power=Math.pow(base, exp);
                                
                                String line1=new String ("<b>Area of circle with radius "+radius+ " is: "+circleArea+" squrae-cm.</b><br>");
                                String line2=new String ("<b>Length of opposite where angle B is "+angleB+" degrees and Hypotenuse length is "+hypo+"cm is: "+(int)opposite+"cm</b><br>");
                    String line3=new String ("<b>Power of "+base+" with exp of "+exp+" is "+power+"</b>");
                    String result=new String(line1+line2+line3);
                                
                                
                                
                                
                                
                resp.setContentType("text/html");

                resp.getWriter().println(result );
              
    }
}
