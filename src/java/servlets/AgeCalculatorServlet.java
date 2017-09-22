/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domainclasses.Person;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author awarsyle
 */
// @WebServlet(name = "AgeCalculator", urlPatterns = {"/AgeCalculator"})
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/ageNextBirthday.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageString = request.getParameter("age");
        try {
            int age = Integer.parseInt(ageString);
            age++;
            
            Person p = new Person();
            p.setName("Richard");
            p.setAge(age);
            
            request.setAttribute("person", p);
        } catch (Exception e) {
            request.setAttribute("error", true);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageNextBirthday.jsp").forward(request, response);
    }
}
