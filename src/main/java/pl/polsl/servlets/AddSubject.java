/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pl.polsl.servlets;

import pl.polsl.manager.DBManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.polsl.model.Register;

/**
 * Servlet class of the application responsible for adding a student to
 * specific/exisiting subject
 *
 * @author Konrad Sygut
 * @version 2.0
 */
@WebServlet(name = "AddSubject", urlPatterns = {"/AddSubject"})
public class AddSubject extends HttpServlet {

    private Register register;
    private DBManager manager_DBM;

    @Override
    public void init() {

        register = (Register) getServletContext().getAttribute("register");
        if (register == null) {
            getServletContext().setAttribute("register", new Register("grupa 5"));
            register = (Register) getServletContext().getAttribute("register");
        }
        manager_DBM = (DBManager) getServletContext().getAttribute("DBM");
        if (manager_DBM == null) {
            getServletContext().setAttribute("DBM", new DBManager());
            manager_DBM = (DBManager) getServletContext().getAttribute("DBM");
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

            boolean isSubjectExists = false;
            int indexOfSubject = 0;
            String subject = request.getParameter("subject");
            String firstName = request.getParameter("name");
            String lastName = request.getParameter("surname");
            String grade = request.getParameter("grad");
            String activity = request.getParameter("actv");

            List<String> subjectsList = manager_DBM.getSubjectsName();

            for (int i = 0; i < subjectsList.size(); i++) {
                if (subjectsList.get(i).equals(subject)) {
                    isSubjectExists = true;
                    indexOfSubject = subjectsList.indexOf(subjectsList.get(i));
                }
            }
            if (isSubjectExists) {

                if (firstName.matches("[a-zA-Z]+") && lastName.matches("[a-zA-Z]+")
                        && activity.matches("^[a-zA-Z0-9]+$")
                        && grade.matches("[+-]?([2-5]*[.])?[2-5]+")) {

//                    register.addStudentToSubject(indexOfSubject, firstName, lastName,
//                            activity, Float.parseFloat(grade));
                    manager_DBM.addStudentToExistingSubject(subject, firstName, lastName, Float.parseFloat(grade), activity);

                    out.println("<h1>Successfully added a student to " + subject + "!</h1> \n");
                    out.println("<a href=\"index.html\"><button>Back to menu</button></a> \n");
                    out.println("<a href=\"checkSubjects\"><button>Add more students</button></a> \n");
                } else {
                    response.sendError(response.SC_BAD_REQUEST, "Invaild data input of student");
                }

            } else {
                response.sendError(response.SC_BAD_REQUEST, "Invaild subject");
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
