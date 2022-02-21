<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %> 
<%-- controller 수정하고 열기
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title> Notice - 상세보기</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
<title>Insert title here</title>
</head>
<body>
  <!-- Hero Section Begin -->
    <section class="hero hero-normal">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="hero__categories">
                        <div class="hero__categories__all">
                            <i class="fa fa-bars"></i>
                            <span>All departments</span>
                        </div>
                        <ul>
                            <li><a href="#">All</a></li>
                            <li><a href="category?kind=1">LIVING</a></li>
                            <li><a href="category?kind=2">KITCHEN</a></li>
                            <li><a href="category?kind=3">BATHROOM</a></li>
                            <li><a href="category?kind=4">KIT</a></li>
                            <li><a href="category?kind=5">ETC</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="hero__search">
                        <div class="hero__search__form">
                            <form action="#">
                                <div class="hero__search__categories">
                                    All Categories
                                    <span class="arrow_carrot-down"></span>
                                </div>
                                <input type="text" placeholder="What do yo u need?">
                                <button type="submit" class="site-btn">SEARCH</button>
                            </form>
                        </div>
                        <div class="hero__search__phone">
                            <div class="hero__search__phone__icon">
                                <i class="fa fa-phone"></i>
                            </div>
                            <div class="hero__search__phone__text">
                                <h5>+82 1688.1234</h5>
                                <span>평일 오전9시-오후6시 </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Hero Section End -->

    <!-- Blog Details Hero Begin -->
    <section class="blog-details-hero set-bg" data-setbg="img/blog/details/details-hero.jpg">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="blog__details__hero__text">
                        <h2>Notice | 게시글 확인</h2>
                        <ul>
                            <li><a href="index">Home 홈</a></li>
                            <li><a href="notice_list">list 목록</a></li>
                            <li><a href="shop-grid">shopping 쇼핑</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Blog Details Hero End -->

    <!-- Blog Details Section Begin -->
    <section class="blog-details spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-5 order-md-1 order-2">
                    <div class="blog__sidebar">
                        <div class="blog__sidebar__search">
                            <form action="#">
                                <input type="text" placeholder="Search...">
                                <button type="submit"><span class="icon_search"></span></button>
                            </form>
                            </div>
							<div class="blog__sidebar__item">
                            <h4>Categories | 카테고리</h4>
                            <ul>
                                <li><a href="#">All</a></li>
                                <li><a href="#">Notice | 일반 공지</a></li>
                                <li><a href="#">Shipping | 배송</a></li>
                                <li><a href="#">Events | 이벤트</a></li>
                                <li><a href="#">Etc | 기타</a></li>
                            </ul>
                        </div>
                        <!-- 제로웨이스트 관련 뉴스 url만 연결, 이미지는 수정필요 -->
                        <div class="blog__sidebar__item">
                            <h4>Recent News | 새 소식</h4>
                            <div class="blog__sidebar__recent">
                            
                                <a href="https://www.jungle.co.kr/magazine/203655" target="_blank" class="blog__sidebar__recent__item">
                                    <div class="blog__sidebar__recent__item__pic">
                                    	<img src="img/blog/sidebar/sr-1.jpg" alt="">                                     
                                    </div>
                                    <div class="blog__sidebar__recent__item__text">
                                    	<h6>Heniken Korea<br />zerowaste challenge</h6>
                                        <span>2021-12-02</span>
                                    </div>
                                </a>
                                <a href="https://www.sedaily.com/NewsView/22VELZCEP3" target="_blank" class="blog__sidebar__recent__item">
                                    <div class="blog__sidebar__recent__item__pic">
                                        <img src="img/blog/sidebar/sr-2.jpg" alt="">  
                                    </div>
                                    <div class="blog__sidebar__recent__item__text">
                                        <h6>LG Health & Beuty<br /> zerowaste challenge</h6>
                                        <span>2021-12-23</span>
                                    </div>
                                </a>
                                <a href="http://www.ezyeconomy.com/news/articleView.html?idxno=116218" target="_blank" class="blog__sidebar__recent__item">
                                    <div class="blog__sidebar__recent__item__pic">
                                        <img src="img/blog/sidebar/sr-3.jpg" alt=""> 
                                    </div>
                                    <div class="blog__sidebar__recent__item__text">
                                        <h6>Cheiljemyunso<br />zerowaste challenge</h6>
                                        <span>2022-02-08</span>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="blog__sidebar__item">
                            <h4>Search By | 검색 키워드</h4>
                            <div class="blog__sidebar__item__tags">
                                <a href="#">배송</a>
                                <a href="#">휴일</a>
                                <a href="#">공지사항</a>
                                <a href="#">계좌</a>
                                <a href="#">환불</a>
                                <a href="#">교환</a>
                            </div>
                        </div>
                    </div>
                </div>
               
                
                <!-- 세부화면 메인 이미지 / text 시작  02.21 수정-->
                <div class="col-lg-8 col-md-7 order-md-1 order-1">
                    <div class="blog__details__text">
                        <img src="img/blog/details/details-pic.jpg" alt="">
                        <p>Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet
                            dui. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Mauris blandit
                            aliquet elit, eget tincidunt nibh pulvinar a. Vivamus magna justo, lacinia eget consectetur
                            sed, convallis at tellus. Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada.
                            Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Proin eget tortor risus.
                            Donec rutrum congue leo eget malesuada. Curabitur non nulla sit amet nisl tempus convallis
                            quis ac lectus. Donec sollicitudin molestie malesuada. Nulla quis lorem ut libero malesuada
                            feugiat. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem.</p>
                        <h3>The corner window forms a place within a place that is a resting point within the large
                            space.</h3>
                        <p>The study area is located at the back with a view of the vast nature. Together with the other
                            buildings, a congruent story has been managed in which the whole has a reinforcing effect on
                            the components. The use of materials seeks connection to the main house, the adjacent
                            stables</p>
                    </div>
                 
                 
                <!-- ▶ C코드로 수정해보기 -->            
                <!-- 세부화면 메인 이미지 370px, 270px/ text 시작 C코드로 수정필요-->
                <!-- 
                <div class="col-lg-8 col-md-7 order-md-1 order-1">
                    <div class="blog__details__text">
                    <c:forEach items="${noticeList}" var="noticeVO">
                    
	                    <div class="blog__details__widget">	                       
	                       <ul>		                   	 		                     
		                     <li><span>Categories:</span>${noticeVO.nkind}</li>                               
		                     <li><h3><a href="notice_view?nseq=${noticeVO.nseq}">${noticeVO.subject}</a></h3><li>			                                          		                             	 
	                    	 <li><span>Notice작성일자:</span> <fmt:formatDate value="${noticeVO.indate}" type="date"/>	 조회수: ${noticeVO.count}</li> 
	                       </ul>
                    	</div> 		                	
                        <img src="img/blog/${noticeVO.image}"/>   
                        <p>${noticeVO.content}</p> 
                    </c:forEach>        
                    </div> 
                     -->
       
                    <!-- 버튼 -->
			        <div class="row">                   
			            <div class="col-lg-12 text-center">
			                <button type="button" class="site-btn" onclick="location.href='notice_list'">목록으로 돌아가기</button> <!--notice목록-->			                        
			             </div>
			        </div>	
                </div>
            </div>
        </div>  
    </section>
    <!-- Blog Details Section End -->


    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>
    
<%@ include file="../footer.jsp" %>

</body>
</html>