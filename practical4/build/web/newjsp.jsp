<%-- 
    Document   : newjsp
    Created on : Aug 29, 2022, 7:45:34 AM
    Author     : Admin
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% int i = Integer.parseInt(request.getParameter("t1"));
        for(int J=0; J<i; J++)
        {
            
            out.println("hello");
        }
        %>
    </body>
</html>
