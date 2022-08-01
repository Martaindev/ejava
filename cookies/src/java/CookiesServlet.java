/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {
private int counter;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CookiesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
         boolean n_v = true;
            Cookie[]c=request.getCookies();
            if(c!=null)
            {
                for(Cookie tc:c)
                {
                    if(tc.getName().equals("old")&&tc.getValue().equals("1"))
                    {
                        n_v=false;
                        break;
                    }
                }
            } 
            if(n_v)
            {
                Cookie fc1=new Cookie("old","1");
                fc1.setMaxAge(360);
                response.addCookie(fc1);
                Cookie cc=new Cookie("cnt","1");
                cc.setMaxAge(360);
                response.addCookie(cc);
                out.println("This is the first time you are visiting this page");    
            } 
            else 
            {
                out.println("Welcome Back");
                if(c!=null)
                {
                    Cookie tc=null;
                    for (Cookie c1:c)
                    {
                        if(c1.getName().equals("cnt"))
                        {
                            tc=c1;
                            counter=Integer.parseInt(c1.getValue());
                            break;
                        }
                    }
                    counter++;
                    tc.setValue(Integer.toString(counter));
                    tc.setMaxAge(360);
                    response.addCookie(tc);
                    out.println("You have visited" +counter+ "times this page");
                }
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
