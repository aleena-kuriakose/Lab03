
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ageServlet extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/findAge.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String oAge = request.getParameter("the_age");
       
       
        
        if (oAge == null || oAge.equals("")) {
            String emptyMessage = "You must give your current age";
            
            request.setAttribute("empTy", emptyMessage);
            getServletContext().getRequestDispatcher("/WEB-INF/findAge.jsp").forward(request, response);
            return;
       
        }
       try {
        int p_Age = Integer.parseInt(oAge);
        int newAge = p_Age + 1 ;
        String msg = "Your age next birthday will be ";
         request.setAttribute("theAge", oAge);
        request.setAttribute("theNewAge", msg + newAge);
       getServletContext().getRequestDispatcher("/WEB-INF/findAge.jsp").forward(request, response);
        
       } 
       catch(NumberFormatException e) {
       String number_message = "You must enter a number";
       request.setAttribute("empTy", number_message);
       getServletContext().getRequestDispatcher("/WEB-INF/findAge.jsp").forward(request, response);
       return;
       }
   
    }



}
