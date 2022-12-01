package model.bo;

import model.dao.CheckLoginDAO;
import model.bean.*;
import java.util.*;


public class CheckLoginBO {
    CheckLoginDAO checkLoginDAO = new CheckLoginDAO();

    public boolean isValidUser(String userName, String password)
    {
        return checkLoginDAO.isExistUser(userName, password);
    }

    public ArrayList<Wife> getWifeList(String userName)
    {
        return checkLoginDAO.getWifeList(userName);
    }
}