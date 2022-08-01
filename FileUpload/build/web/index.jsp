<%-- 
    Document   : index
    Created on : 1 Aug, 2022, 7:33:27 AM
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
        <form action="Upload" method="POST" enctype="multipart/form-data">
            File: <input type="file" name="file" id="file"/>
            <br/>
            Destination: <input type="text" value="" name="destination"/>
            <input type="submit" value="Upload" name="upload" id="upload"/>
        </form>
    </body>
</html>
