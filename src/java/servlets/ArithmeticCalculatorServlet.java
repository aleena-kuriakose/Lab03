
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

  
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arthemeticjsp.jsp").forward(request, response);      
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstOne = request.getParameter("first");
        String secondOne = request.getParameter("second");
        String opr = request.getParameter("op");
        request.setAttribute("FirstNo", firstOne);
        request.setAttribute("SecondNo", secondOne);
        
        try {
            if(firstOne == null || firstOne.equals("")|| secondOne == null || secondOne.equals("")){
            String inMsg = "Invalid";
            request.setAttribute("invMessage", inMsg);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arthemeticjsp.jsp").forward(request, response);
            return;
            } else if (opr.equals("+")) {
                int num1 = Integer.parseInt(firstOne);
                int num2 = Integer.parseInt(secondOne);
                int num3 = num1 + num2;
                System.out.println(num3);
            
                String inMsg = "" + num3;
                
                request.setAttribute("invMessage", inMsg);
                getServletContext().getRequestDispatcher("/WEB-INF/arthemeticjsp.jsp").forward(request, response);
                return;

            }
            else if (opr.equals("-")) {
                int num1 = Integer.parseInt(firstOne);
                int num2 = Integer.parseInt(secondOne);
                int num3 = num1 - num2;
                System.out.println(num3);
                String inMsg = "" + num3;
                 request.setAttribute("invMessage", inMsg);
                getServletContext().getRequestDispatcher("/WEB-INF/arthemeticjsp.jsp").forward(request, response);
                return;

            }
           else if (opr.equals("*")) {
                int num1 = Integer.parseInt(firstOne);
                int num2 = Integer.parseInt(secondOne);
                int num3 = num1 * num2;
                System.out.println(num3);
                String inMsg = "" + num3;
                 request.setAttribute("invMessage", inMsg);
                getServletContext().getRequestDispatcher("/WEB-INF/arthemeticjsp.jsp").forward(request, response);
                return;

            }
           else if (opr.equals("%")) {
                int num1 = Integer.parseInt(firstOne);
                int num2 = Integer.parseInt(secondOne);
                int num3 = num1 % num2;
                System.out.println(num3);
                String inMsg = "" + num3;
                 request.setAttribute("invMessage", inMsg);
                getServletContext().getRequestDispatcher("/WEB-INF/arthemeticjsp.jsp").forward(request, response);
                return;

            }
        } catch (NumberFormatException e) {
            String inMsg = "Invalid";
            request.setAttribute("invMessage", inMsg);
            getServletContext().getRequestDispatcher("/WEB-INF/arthemeticjsp.jsp").forward(request, response);
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arthemeticjsp.jsp").forward(request, response);
        return;
        }
      
       
    }

  
  
    

