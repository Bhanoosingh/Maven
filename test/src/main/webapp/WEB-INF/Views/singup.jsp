<%@include file="/WEB-INF/Views/template/header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1 class="text">Customer Registration Page</h1>

            <p class="lead">Fill the Information</p>
        </div>
        
	<div class="jumbotron">
        <form:form action="${pageContext.request.contextPath}/singup"
                   method="post" commandName="student">

        <h3>Basic Details</h3>

        <div class="form-group">
            <label for="name">Name</label>
            <form:input path="studentName" name="name" id="name" class="form-Control" />
            <form:errors path="studentName" style="color: #ff0000" />
        </div>

        <div class="form-group">
            <label for="email">Email</label>
            <span style="color: #ff0000;">${emailMsg}</span>
            <form:errors path="studentEmail" style="color: #ff0000" />
            <form:input path="studentEmail" id="email" name="email" class="form-Control" />
        </div>

        <div class="form-group">
            <label for="phone">Phone</label>
            <form:input path="studentPhone" id="phone" name="phone" class="form-Control" />
        </div>

        <div class="form-group">
            <label for="username">Username</label>
            <span style="color: #ff0000">${usernameMsg}</span>
            <form:errors path="username" style="color: #ff0000" />
            <form:input path="username" id="username" name="username" class="form-Control" />
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <form:errors path="password" style="color: #ff0000" />
            <form:password path="password" id="password" name="password" class="form-Control" />
        </div>

        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/" />" class="btn btn-default">Cancel</a>

        </form:form>
        </div>
</div>
</div>
<%@include file="/WEB-INF/Views/template/footer.jsp"%>