package model.bo;

import model.dao.StudentDAO;
import model.bean.*;
import java.util.*;


public class StudentBO {
    StudentDAO studentDAO = new StudentDAO();

    public ArrayList<Student> getStudentList() {
    	return studentDAO.getStudentList();
    }
    
    public boolean addStudent(Student student) {
    	return studentDAO.addStudent(student);
    }
    
    public Student studentDetail(String MSV) {
    	return studentDAO.studentDetail(MSV);
    }
}