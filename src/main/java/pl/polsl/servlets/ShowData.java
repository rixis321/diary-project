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
 *
 * @author Konrad Sygut
 */
@WebServlet(name = "ShowData", urlPatterns = {"/ShowData"})
public class ShowData extends HttpServlet {

    private Register reg;
    
        @Override
    public void init() 
    {
        reg = (Register) getServletContext().getAttribute("register");
        if(reg == null)
        {
            getServletContext().setAttribute("register", new Register("grupa 5"));
            reg = (Register) getServletContext().getAttribute("register");
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
             
             if(reg.getSubjects().isEmpty()){
                 out.println("<h2>There are no any data yet</h2>");
             }

             for(int i =0; i<reg.getSubjects().size();i++){
                 out.println(reg.getSubjects().get(i).getSubName());
                 out.println("<br>");
                 
                  //printing students
                 for(int j=0; j<reg.getSubjects().get(i).getStudents().size();j++){
                 
                    out.println(reg.getSubjects().get(i).getStudents().get(j).getName() + " "
                        + reg.getSubjects().get(i).getStudents().get(j).getLastName() + " " );
                      
                      //printing grades
                    for(int k=0; k<reg.getSubjects().get(i).getStudents().get(j).grades.size();k++){
            
                        //printing activites
                        for(int m = 0; m<reg.getSubjects().get(i).getStudents().get(j).grades.get(k).getActivities().size();m++){
                                 out.println(reg.getSubjects().get(i).getStudents().get(j).grades.get(k).getActivities().get(m)+": " );
                 }
                 out.println(reg.getSubjects().get(i).getStudents().get(j).grades.get(k).getGrade() +" ");

                         }
                             out.println("average: " + reg.getSubjects().get(i).getStudents().get(j).average+ " ");
                             out.println("<br>");
             }
         }
         
             out.println("<a href=\"index.html\"><button>Back</button></a> \n");
         
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
