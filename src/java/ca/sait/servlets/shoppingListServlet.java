/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kalra
 */
public class shoppingListServlet extends HttpServlet {

    

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name= (String) request.getSession().getAttribute("name");
        
        if(name!=null){
            this.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }else{
            this.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
       
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
      String action=request.getParameter("action");  
       String name=request.getParameter("name");
       if(name!= null){
           request.getSession().setAttribute("name", name);
           
       }
       
       this.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
    }

   

}
