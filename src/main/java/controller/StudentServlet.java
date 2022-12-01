package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.*;
import model.bo.CheckLoginBO;
import model.bo.StudentBO;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException{
    	
    }
    
    private void studentList(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
    	StudentBO studentBO = new StudentBO();
    	ArrayList<Student> studentList = null;
    	studentList = studentBO.getStudentList();
    	request.setAttribute("studentList", studentList);
    	RequestDispatcher dispatcher = request.getRequestDispatcher("students.jsp");
        dispatcher.forward(request, response);
    }
    private void showAddForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
    	RequestDispatcher dispatcher = request.getRequestDispatcher("addStudent.jsp");
        dispatcher.forward(request, response);
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String MSV = request.getParameter("msv");
        StudentBO studentBO = new StudentBO();
        Student student = studentBO.studentDetail(MSV);
        RequestDispatcher dispatcher = request.getRequestDispatcher("add_student.jsp");
        request.setAttribute("student", student);
        dispatcher.forward(request, response);
    }
    private void addStudent(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
    	String MSV = request.getParameter("MSV");
    	String hoten = request.getParameter("hoten");
    	String gioitinh = request.getParameter("gioitinh");
    	String khoa = request.getParameter("khoa");
    	StudentBO studentBO = new StudentBO();
    	Student student = new Student(MSV, hoten, gioitinh, khoa);
    	studentBO.addStudent(student);
    	RequestDispatcher dispatcher = request.getRequestDispatcher("students.jsp");
        dispatcher.forward(request, response);
    }
}