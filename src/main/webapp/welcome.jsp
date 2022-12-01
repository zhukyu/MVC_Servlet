<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="model.bean.Wife" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<table>
<%
    ArrayList<Wife> wifeArray = (ArrayList<Wife>)request.getAttribute("wifeArray");
    for (int i = 0; i < wifeArray.size(); i++)
    {
%>
        <tr>
            <td><%= wifeArray.get(i).getName() %> </td>
            <td><%= wifeArray.get(i).getAddress() %> </td>
            <td><%= wifeArray.get(i).isAlive() %> </td>
        <tr>
<%
    }
%>
</table>

</body>
</html>