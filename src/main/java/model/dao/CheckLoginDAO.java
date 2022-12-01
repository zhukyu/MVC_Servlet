package model.dao;

import model.bean.Wife;

import java.sql.*;
import java.util.ArrayList;

public class CheckLoginDAO {
	public boolean isExistUser(String userName, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test888", "root", "");
            Statement sm = conn.createStatement();
            String sql = "select * from admin";
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                if ((userName.equals(rs.getString("username"))) && password.equals(rs.getString("password"))) {
                    return true;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }
    public ArrayList<Wife> getWifeList(String userName)
    {
        ArrayList<Wife> result = new ArrayList<Wife>();

        Wife wife = new Wife();
        wife.setName("Thi No");
        wife.setAddress("Lo gach");
        wife.setAlive(false);
        result.add(wife);

        wife = new Wife();
        wife.setName("Chi Pheo");
        wife.setAddress("Ho ca");
        wife.setAlive(true);
        result.add(wife);

        return result;
    }
}