<%-- 
    Document   : findAge
    Created on : Jun 3, 2022, 4:48:51 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Age</title>
    </head>
    <body>
    <h1> AGE CALCULATOR</h1>
    <form method="post" action="age">
    <label for="Age">Enter your age:</label>
    <input type="text" name="the_age" value="">
    <br>
    <br> <input type="submit" value="Age next birthday"/>
    <br>
    <p>${theNewAge}</p>
    <p> ${empTy} </p>
    
    
    <p><a href="http://localhost:8084/Age_Calculator/arithmetic"> Arithmetic Calculator </a> </p>
    </form>
    </body>
</html>
