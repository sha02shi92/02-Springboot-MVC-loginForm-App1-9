<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        ${msg}
       <form:form action="checkLogin" modelAttribute="loginForm" method="POST">
       <table>
       <tr>
              <td> Email : </td>
              <td> <form:input path="email" /> </td> 
       </tr> 
       <tr>     
              <td> Password :</td>
              <td> <form:password path="pwd" />  </td>
          
       </tr>
       <tr>
              <td> <input type="submit" value="login" /></td>
       
       </tr>
       
       
       
       
       
       </table>
      </form:form>
      


</body>
</html>