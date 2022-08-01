<%-- 
    Document   : index
    Created on : 11 Jul, 2022, 7:48:37 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .container{
                display: flex;
                justify-content:center;
                align-items:center;
            }
            form{
                border:1px solid black;
                padding: 50px;
                display: flex;
                justify-content:center;
                align-item:center;
                flex-direction:column;
                text-align: center;
            }
            
            input{
                padding: 10px;
                margin-top: 10px;      
            }
            
            input:hover{
                transition:.1s ease-out;
                border: 1px solid red;
            }
           
            
            #btn{
                padding: 5px;
                background:none;
                color: black;
                border-radius:4px;
                border: 1px solid black;
            }
            
            #btn:hover{
                background:black;
                color: white;
            }
        
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <form>
            Enter your UserName: <input type="text" name="user"/><br/>
            Enter your password: <input type="text" name="pwd"/><br/>
            Enter email: <input type="text" name="email"/><br/>
            Enter country: <input type="text" name="count"/><br/>
            <input id="btn" type="submit" value="Register"/>
        </form>
        <div/>
    </body>
</html>
