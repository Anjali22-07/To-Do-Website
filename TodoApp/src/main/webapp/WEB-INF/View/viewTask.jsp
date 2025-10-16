<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@include file="base.jsp" %>
          <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Task</title>
</head>
<body>
<h1 class="text-center mt-5"> Your Task </h1>
<hr/>
<div class="container  mt-5">

<div class="col-md-9 offset-md-2">

<table class=" table table-warning">
  <thead>
    <tr>
      <th scope="col">S.No.</th>
      <th scope="col">Title</th>
      <th scope="col">content</th>
      <th scope="col">Date&Time</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${task }" var="t"  varStatus="loop">
    <tr>
       <th scope="row">Task${loop.index + 1}</th>
      <td>${t.taskTitle }</td>
      <td>${t.taskContent }</td>
      <td>${t.dueTime }</td>
      <td>
      <a href="${pageContext.request.contextPath}/delete/${t.taskId}">
      <i class="fa-solid fa-trash text-danger"></i>
      </a>
      <a href="${pageContext.request.contextPath}/updateTask/${t.taskId}">
      <i class="fa-solid fa-pen-to-square text-success"></i>
      </a>
      </td>
    </tr>
  
   </c:forEach>
    </tbody>
    </table>
    
    <div class="container text-center mt-3">
    <a href="home" class= "btn btn-outline-danger">Go to HomePage</a>
<a href="add_task" class= "btn btn-outline-success">Add task</a>
    </div>
</div>

</div>


</body>
</html>