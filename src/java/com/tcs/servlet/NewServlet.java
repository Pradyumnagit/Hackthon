/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.servlet;

import com.tcs.beans.beans;
import com.tcs.services.dao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1528178
 */
public class NewServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");
        beans bean = new beans();
        bean.setFirst(first);
        bean.setSecond(second);
        bean.setOperation(operation);
        if (operation.equals("Division") && second.equals("0")) {
            out.println("<script>");
            out.println("alert('Are you mad...!!!Give valid input duffer...!!')");
            out.println("location='index.jsp';");
            out.println("</script>");
        } else {
            request.setAttribute("result", dao.calculate(bean));
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
