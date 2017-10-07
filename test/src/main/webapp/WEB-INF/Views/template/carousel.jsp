<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
      </ol>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img class="first-slide" src="<c:url value="/resources/images/slide1.jpg"/>" alt="First slide">
          <div class="container">
            <div class="carousel-caption d-none d-md-block text-left">
              <p><a class="btn btn-lg btn-primary" href="singup" role="button">Sign up today</a></p>
            </div>
          </div>
        </div>
        <div class="carousel-item">
          <img class="second-slide" src="<c:url value="/resources/images/slide2.png"/>" alt="Second slide">
          <div class="container">
            <div class="carousel-caption d-none d-md-block">
             <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
            </div>
          </div>
        </div>
        <div class="carousel-item">
          <img class="third-slide" src="<c:url value="/resources/images/slide3.jpg"/>" alt="Third slide">
          <div class="container">
            <div class="carousel-caption d-none d-md-block text-right">
              <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
            </div>
          </div>
        </div>
        <div class="carousel-item">
          <img class="fourth-slide" src="<c:url value="/resources/images/slide4.jpg"/>" alt="Second slide">
          <div class="container">
            <div class="carousel-caption d-none d-md-block">
             <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
            </div>
          </div>
      </div>
      </div>
      <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>