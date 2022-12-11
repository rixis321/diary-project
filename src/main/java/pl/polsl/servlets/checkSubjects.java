/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pl.polsl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.polsl.model.Register;

/**
 * Servlet class of the application responsible for checking if a subject exists
 *
 * @author Konrad Sygut
 * @version 2.0
 */
@WebServlet(name = "checkSubjects", urlPatterns = {"/checkSubjects"})
public class checkSubjects extends HttpServlet {
    
    
    
            private Register register;
    
    
     @Override
    public void init() {
        
        register = (Register) getServletContext().getAttribute("register");
        if(register == null){
            getServletContext().setAttribute("register", new Register("grupa 5"));
            register = (Register) getServletContext().getAttribute("register");
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
           if(register.getSubjects().isEmpty()){
               out.println("<h2>There are no any exisitng subjects</h2>");
               out.println("<a href=\"index.html\"><button>Back</button></a> \n");
           }
           else{
               out.println("<h1>Existing subjects:</h1>");
              for(int i =0; i<register.getSubjects().size();i++){
                  String subject = register.getSubjects().get(i).getSubName();
                  out.println(subject +",");


                
              } 
                  out.println("<br>");
                  out.println("<br>");
                  out.println("<br>");
                  out.println("<a href=\"addSubject.html\"><button>Add a student to subject</button></a> \n");
                  out.println("<a href=\"index.html\"><button>Back</button></a> \n");
      
              
                 
           }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
