<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/include/header.jsp"%>
<body>
<h1 class="text-center mb-5">공지사항 관리</h1>
<form action="/admin/registr" method="post" id="registrForm">
<div class="btn_section">
<button id="btnWrite" class="writebtn">공지사항 작성</button>
</div>
<table class="table table-striped text-center"> 
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>
				<label for="title">제목</label><input type="text" id="title" name="title" />
				</td>
				<td>이게 맞는부분인거냐</td>
				<td>기기기</td>
				<td>2016-12-02</td>
				<td>2</td>
			</tr>
		</tbody>
	</table>
</form>
<div class="btn_section">
                   				<button id="cancelBtn" class="btn">취 소</button>
	                    		<button id="registrBtn" class="btn registr_btn">등 록</button>
	       </div> 
</body>
<%@ include file="/include/footer.jsp"%>
<script>
 
/* 등록 버튼 */
$("#registrBtn").click(function(){    
    $("#registrForm").submit();
});
 
/* 취소 버튼 */
$("#cancelBtn").click(function(){
    location.href="/admin/notice"
});

$(document).ready(function(){
    
	let result = '<c:out value="${registr_result}"/>';
    
    checkResult(result);
    
    function checkResult(result){
        
        if(result === ''){
            return;
        }
        
        alert("공지사항'${registr_result}' 을 등록하였습니다.");
        
    }
 
});
 
</script>
</html>