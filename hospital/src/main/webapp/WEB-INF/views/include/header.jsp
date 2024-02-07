<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">`
<title>Insert title here</title>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<link rel="icon" type="image/x-icon" href="/resources/assets/favicon.ico" />
<script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
<link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
	rel="stylesheet" type="text/css" />
<link href="/resources/css/styles.css" rel="stylesheet" />
</head>
<body>
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-light" id="mainNav">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="/main">Health Care</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto py-4 py-lg-0 ">
    				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/main">Home</a></li>
    				<!-- 관리자로 로그인시 faq 와 공지사항은 안보이게 처리-->
    				<c:if test="${empty admin}">
    					<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/board/faq'/>">FAQ</a></li>
    					<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/board/notice'/>">공지사항</a></li>
    					<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/board/qsboard'/>">질문게시판</a></li>
    				</c:if>

    				<c:if test="${empty patient and empty admin}">
        			<!-- 로그인 안 된 경우 -->
        				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/member/login'/>">로그인</a></li>
        				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/admin/login'/>">관리자 로그인</a></li>
        				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/member/join'/>">회원가입</a></li>
    				</c:if>

    				<c:if test="${not empty patient}">
        			<!-- 일반 회원으로 로그인된 경우 -->
        				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/member/logout'/>">로그아웃</a></li>
    				</c:if>

    				<c:if test="${not empty admin}">
        			<!-- 관리자로 로그인된 경우 -->
        				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/board/patient'/>">환자정보 관리</a></li>
        				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/board/faq'/>">FAQ 관리</a></li>
        				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/board/notice'/>">공지사항 관리</a></li>
        				<li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="<c:url value='/admin/logout'/>">로그아웃</a></li>
    				</c:if>
				</ul>
			</div>
		</div>
	</nav>
	<!-- Page Header-->
	<header class="masthead" style="background-image: url('/resources/assets/img/test4.png')">
		<div class="container position-relative px-4 px-lg-5">
			<div class="row gx-4 gx-lg-5 justify-content-center">
				<div class="col-md-10 col-lg-8 col-xl-7">
					<div class="site-heading">
						<h1>Health Care</h1>
					</div>
				</div>
			</div>
		</div>
	</header>