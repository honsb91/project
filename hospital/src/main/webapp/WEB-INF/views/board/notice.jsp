<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>boardList</title>
</head>
<link rel="stylesheet" href="/resources/css/board/notice.css">
<jsp:include page="/WEB-INF/views/include/header.jsp"/>
<body>
<section class="notice">
  <div class="page-title">
        <div class="container">
            <h3>공지사항</h3>
        </div>
    </div>
    <div id="board-search">
        <div class="container">
            <div class="search-window">
                <form action="">
                    <div class="search-wrap">
                        <label for="search" class="blind">공지사항 내용 검색</label>
                        <input id="search" type="search" name="" placeholder="검색어를 입력해주세요." value="">
                        <button type="submit" class="btn btn-primary">검색</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="table_wrap">
            <table>
		<thead>
			<tr>
				<th class="bno_width">번호</th>
				<th class="title_width">제목</th>
				<th class="regdate_width">작성일</th>
				<th class="writer_width">작성자</th>
			</tr>
		</thead>
			<c:forEach items="${notice}" var="notice">
            <tr>
                <td><c:out value="${notice.notice_no}"/></td>
                <td>
                 	<a class="move" href='<c:out value="${notice.notice_no}"/>'>
        				<c:out value="${notice.notice_title}"/>
    				</a>
                </td>
                <td><fmt:formatDate pattern="yyyy/MM/dd" value="${notice.notice_regdate}"/></td>
                <td><c:out value="${notice.notice_writer}"/></td>
            </tr>
        </c:forEach>
	</table>
	<form id="moveForm" method="get">
	
	</form>
        <c:if test="${not empty admin}">
        	<button onclick="window.location.href='<c:url value='/board/notwriter'/>'">게시판 등록</button>
        </c:if>
   </div>
</section>
<jsp:include page="/WEB-INF/views/include/footer.jsp"/>
</body>
<script>

	// 공지사항 등록 성공 알람창
	$(document).ready(function(){
		let result = '<c:out value="${result}"/>';
		checkAlert(result);
		function checkAlert(result){
			if(result === ''){
				return;
			}
			if(result === "notwriter success"){
				alert("등록이 완료되었습니다.");
			}
		}
	});
	
	let moveForm = $("#moveForm");
	 
    $(".move").on("click", function(e){
        e.preventDefault();
        moveForm.empty();
        
        moveForm.append("<input type='hidden' name='notice_no' value='"+ $(this).attr("href")+ "'>");
        moveForm.attr("action", "/board/notpage");
        moveForm.submit();
    });
</script>
</html>