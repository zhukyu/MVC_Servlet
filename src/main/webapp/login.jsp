<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .sp1 {
            width: 100px;
        }
    </style>
</head>

<body bgColor="BBFFCC">
    <form name="f1" action="CheckLoginServlet" method="post" target="_top">

        <div style="display: flex; flex-direction: column;">
            <div style="margin: auto;">
                <h2 style="text-align: center;">Dang nhap he thong</h2>
                <div style="display: flex;">
                    <p style="min-width: 100px; margin: 0;">Ten dang nhap</p>
                    <input type="text" name="userName">
                </div>
                <div style="display: flex; margin-top: 2px;">
                    <p style="min-width: 100px; margin: 0;">Mat khau</p>
                    <input type="password" name="passWord">
                </div>
                <div style="display: flex; justify-content: center; white-space: nowrap; margin-top: 10px">
                    <span name="sp1" style="color: red;" class="sp1"></span>
                </div>
                <div style="display: flex; justify-content: center; margin-top: 10px;">
                    <input type="submit" name="Login" value="Login">
                    <input type="reset" name="resetBtn" value="Reset">
                </div>
            </div>
        </div>
    </form>

</body>

</html>