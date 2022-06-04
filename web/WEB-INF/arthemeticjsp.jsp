<%-- 
    Document   : arthemeticjsp
    Created on : Jun 3, 2022, 8:53:31 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
         <h1>ARITHMETIC CALCULATOR</h1>
    <form method="post" action="arithmetic">
        <label for="first_no">First</label>
        <input type="int" name="first" value="">
        <br>
        <label for="second_no">Second</label>
        <input type="int" name="second" value="">
        <br>
        <input type="submit" value="+" name="op">
        <input type="submit" value="-" name="op">
        <input type="submit" value="*" name="op">
        <input type="submit" value="%" name="op">
    </form>
         <p>Result : ${invMessage}</p>
         <a href="http://localhost:8084/Age_Calculator/age"> Age Calculator </a>
    
    </body>
</html>
