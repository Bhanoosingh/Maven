<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/Views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>your's registration is successfully.............</h1>
                </div>
            </div>
        </section>

        <section class="container">
            <p><a href="<spring:url value="/bookList" />" class="btn btn-default">Go to Products</a></p>
        </section>
</div></div>
<%@ include file="/WEB-INF/Views/template/footer.jsp" %>