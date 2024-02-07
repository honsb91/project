<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="/resources/css/board/notwriter.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<body>
<jsp:include page="/WEB-INF/views/include/header.jsp"/>
<h1>공지사항 등록</h1>
<form id="notice_form" action="/board/notwriter" method="post">
<div class="container">
    <div class="form-container">
        <div class="menu">제목</div>
           <input type="text" name="notice_title" class="notice-subject" placeholder=" 제목을 입력해주세요.">
    </div>
    <div class="form-container">
        <div class="menu">내용</div>
           <textarea name="notice_content" cols="30" rows="10" placeholder=" 내용을 입력해주세요." class="content"></textarea>
    </div>
    <div class="form-container">
        <div class="menu">작성자</div>
        <input type="text" name="notice_writer" id="writer" class="notice-subject">
    </div>
    <div class="button-container">
    <button type="submit" class="btn">등록</button>
    <button type="button" class="btn" id="notice_list">목록으로</button>
    </div>
    </div>
</form>
<jsp:include page="/WEB-INF/views/include/footer.jsp"/>
</body>
<script>
$(document).ready(function(){
    $("#notice_list").click(function(){
        // 목록 페이지로 이동
        window.location.href = "/board/notice";
    });
});
</script>
</html>