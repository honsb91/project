<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/member/login.css">
</head>
<body>
<%@ include file="/include/header.jsp"%>
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 class="active"> Health Care </h2>


    <!-- Login Form -->
    <form>
    <div class="login-form">
      <input type="text" id="login" class="fadeIn second" name="login" placeholder="아이디">
      <input type="text" id="password" class="fadeIn third" name="login" placeholder="비밀번호">
      <input type="submit" class="fadeIn fourth" value="Log In">
      <input type="submit" class="fadeIn fourth" value="카카오 로그인">
      <input type="submit" class="fadeIn fourth" value="네이버 로그인">
      </div>
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>
</body>
<%@ include file="/include/footer.jsp"%>
</html>