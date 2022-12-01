package controller;

import java.io.IOException;

import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.*;
import model.bo.CheckLoginBO;

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException{
        String destination = null;

        String userName = request.getParameter("userName");
        String password = request.getParameter("passWord");

        CheckLoginBO checkLoginBO = new CheckLoginBO();
        ArrayList<Wife> wifeArray = null;

        if(checkLoginBO.isValidUser(userName, password))
        {
            wifeArray = checkLoginBO.getWifeList(userName);
            request.setAttribute("wifeArray", wifeArray);
            destination = "/welcome.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        }
        else
        {
            destination = "/login.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        }
    }
    
}