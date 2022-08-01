<%-- 
    Document   : index
    Created on : 4 Jul, 2022, 7:34:55 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CalculateServlet" method="POST">
            Enter Number 1: <input type="text" name="num1"/>
            <select name="op">
                <option value="+"> + </option>
                <option value="-"> - </option>
                <option value="*"> * </option>
                <option value="/"> / </option>
            </select>
            Enter Number 2: <input type="text" name="num2"/>
            <br/>
            <input type="submit" value="CALCULATE"/>
        </form>
    </body>
</html>
