<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@include file="base.jsp" %>
          <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<h1 class="text-center mt-5">Update Task</h1>

<div class="container mt-5">
<div class="col-md-6 offset-md-3">

<form action="handleForm" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Id</label>
  <input type="text" class="form-control" id="exampleFormControlInput1"value="${task.taskId }" >
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Title</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" name="taskTitle"
  value=${task.taskTitle }>
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">Content</label>
  <textarea class="form-control" id="exampleFormControlTextarea1" name="taskContent"rows="3"value="${task.taskContent }"></textarea>
</div>
 <div class="mb-3">
      <label for="dueTime" class="form-label">Due Date & Time</label>
      <input type="datetime-local" class="form-control" id="dueTime" name="dueTime"value="${task.dueTime }" required>
    </div>
   <div class="conatiner text-center">
   <a href="${pageContext.request.contextPath}/viewTask" class="btn btn-outline-danger">Back</a>
   <a href="${pageContext.request.contextPath}/viewTask" class="btn btn-success">Update</a>
   </div>
</form>
</div>


</div>

</body>
</html>