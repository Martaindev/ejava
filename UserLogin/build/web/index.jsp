<%-- 
    Document   : index
    Created on : 4 Jul, 2022, 8:07:40 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login</title>
        <style>
            form{
                border:1px solid black;
                padding: 20px;
                display: flex;
                justify-content:center;
                align-items:center;
                flex-direction:column;
                
            }
            
            #btn{
                padding: 5px;
                background:black;
                color: white;
                border-radius:4px;
            }
        
        </style>
    </head>
    <body>
        <form action="LoginServlet" method="POST">
            Enter the Username: <input type="text" name="id"/>
            <br/>
            Enter the Password: <input type="password" name="pass"/>
            <br/>
            <input id="btn" type="submit" value="Login"/>
        </form>
    </body>
</html>
