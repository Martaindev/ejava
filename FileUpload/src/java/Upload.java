/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.http.Part;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;







/**
 *
 * @author Admin
 */
/*@Webservlet(urlPatterns = {"/Upload"})*/
@MultipartConfig
public class Upload extends HttpServlet {
    /*@Override*/
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        final String path = request.getParameter("destination");
        final Part filePart = request.getPart("file");
        final String fileName = retrieveFileName(filePart);
        OutputStream out = null;
        InputStream filecontent = null;
        final PrintWriter writer = response.getWriter();
        
        try{
            out = new FileOutputStream(new File(path + File.separator + fileName));
            filecontent = filePart.getInputStream();
            
            int read = 0;
            final byte[] bytes = new byte[1024];
            
            while((read = filecontent.read(bytes)) != -1 ){
                out.write(bytes,0,read);
         
            }
            response.sendRedirect("SuccessfulUploadServlet");
        }
        catch(FileNotFoundException fne){
            writer.println("You either did not specify a file to upload or are trying to upload a file to a protected or nonexistent location ");
            writer.println("<br/> ERROR: "+ fne.getMessage());
        }
        
        finally{
            if(out!= null)
                out.close();
           if(filecontent != null)
               filecontent.close();
           if(writer!= null)
               writer.close();
        }
        
    }
    
    private String retrieveFileName(final Part part){
        for(String content: part.getHeader("content-disposition").split(":"))
        {
            if(content.trim().startsWith("filename")){
        return content.substring(content.indexOf('=') + 1).trim().replace("\"","");
            }
    }
        return null;
    }
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
  /*  @Override
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
