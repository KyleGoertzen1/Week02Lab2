<%-- 
    Document   : ageNextBirthday
    Created on : 10-Sep-2015, 6:44:03 PM
    Author     : awarsyle
--%>

<!-- This is an HTML comment! -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator </title>
    </head>
    <body>
        <form action="Calc" method="post">
            Enter your age: <input type="number" name="age" />
            <br>
            <input type="submit" value="Submit" />
        </form>

        <div>
            <c:if test="${person != null}">
                Your age next birthday will be ${person.age}
            </c:if>
        </div>
        <c:if test="${error == true}">
            You must give your current age.
        </c:if>
        
        
    </body>
</html>
