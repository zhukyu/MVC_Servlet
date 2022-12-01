package model.dao;

import model.bean.Student;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {
	
    public ArrayList<Student> getStudentList()
    {
        ArrayList<Student> result = new ArrayList<Student>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test888", "root", "");
            Statement sm = conn.createStatement();
            String sql = "select * from student";
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student(rs.getString("MSV"), rs.getString("hoten"), rs.getString("gioitinh"), rs.getString("khoa"));
                result.add(student);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return result;
        
    }
    
    public Student studentDetail(String MSV) {
    	Student result = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test888", "root", "");
            Statement sm = conn.createStatement();
            String sql = "select * from student where msv = '" + MSV + "'";
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
            	result = new Student(rs.getString("MSV"), rs.getString("hoten"), rs.getString("gioitinh"), rs.getString("khoa"));
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return result;
    }
    
    public boolean addStudent(Student student) {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test888", "root", "");
            String sql = "insert into student (MSV, hoten, gioitinh, khoa) values (?, ?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setString (1, student.getMSV());
            preparedStmt.setString (2, student.getHoten());
            preparedStmt.setString (3, student.getGioitinh());
            preparedStmt.setString (4, student.getKhoa());
            preparedStmt.executeQuery(sql);
            conn.close();
            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	return false;
    }
    
    
    
    public boolean updateStudent(Student student) {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test888", "root", "");
            String sql = "update student set msv = '?', hoten = '?', gioitinh = '?', khoa = '?' where msv = '?'";
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setString (1, student.getMSV());
            preparedStmt.setString (2, student.getHoten());
            preparedStmt.setString (3, student.getGioitinh());
            preparedStmt.setString (4, student.getKhoa());
            preparedStmt.setString (5, student.getMSV());
            preparedStmt.executeQuery(sql);
            conn.close();
            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	return false;
    }
    
    public boolean deleteStudent(String MSV) {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test888", "root", "");
            String sql = "delete from student where msv = '?'";
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setString (1, MSV);
            preparedStmt.executeQuery(sql);
            conn.close();
            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	return false;
    }
}