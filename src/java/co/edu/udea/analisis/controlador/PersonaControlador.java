/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.analisis.controlador;

import co.edu.udea.analisis.modelo.BO.PersonaBO;
import co.edu.udea.analisis.modelo.DTO.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
public class PersonaControlador extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            Persona p = new Persona();
            PersonaBO q = new PersonaBO();
            String respuesta="No entro";
            try {
                if (request.getParameter("btnIngresar") != null) {
                    p.setId(Integer.parseInt(request.getParameter("txtId")));
                    p.setNombre(request.getParameter("txtNombres"));
                    p.setApellido(request.getParameter("txtApellidos"));
                    p.setEdad(request.getParameter("txtEdad"));
                    respuesta = q.ingresarPersona(p);
                    request.getSession().setAttribute("RespuestaEjemplo", respuesta);
                    request.getRequestDispatcher("RespuestaEjemplo.jsp").forward(request, response);
                }else{
                    request.getSession().setAttribute("RespuestaEjemplo", respuesta);
                    request.getRequestDispatcher("RespuestaEjemplo.jsp").forward(request, response);
                }
            } catch (Exception e) {
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
