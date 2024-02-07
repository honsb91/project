<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>boardList</title>
</head>
<link rel="stylesheet" href="/resources/css/board/notice.css">
<jsp:include page="/WEB-INF/views/include/header.jsp"/>
<body>
<section class="notice">
  <div class="page-title">
        <div class="container">
            <h3>질문게시판</h3>
        </div>
    </div>

    <!-- board seach area -->
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
   
  <!-- board list area -->
    <div id="board-list">
        <div class="container">
            <table class="board-table">
                <thead>
                <tr>
                    <th scope="col" class="th-num">번호</th>
                    <th scope="col" class="th-title">제목</th>
                    <th scope="col" class="th-date">등록일</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>7</td>
                    <th><a href="#!">[공지사항] 개인정보 처리방침 변경안내처리방침</a></th>
                    <td>2017.07.13</td>
                </tr>
                <tr>
                    <td>6</td>
                    <th><a href="#!">[공지사항] 개인정보 처리방침 변경안내처리방침</a></th>
                    <td>2017.07.13</td>
                </tr>
                <tr>
                    <td>5</td>
                    <th><a href="#!">[공지사항] 개인정보 처리방침 변경안내처리방침</a></th>
                    <td>2017.07.13</td>
                </tr>
                <tr>
                    <td>4</td>
                    <th><a href="#!">[공지사항] 개인정보 처리방침 변경안내처리방침</a></th>
                    <td>2017.07.13</td>
                </tr>
                <tr>
                    <td>3</td>
                    <th><a href="#!">[공지사항] 개인정보 처리방침 변경안내처리방침</a></th>
                    <td>2017.07.13</td>
                </tr>
                <tr>
                    <td>3</td>
                    <th><a href="#!">[공지사항] 개인정보 처리방침 변경안내처리방침</a></th>
                    <td>2017.07.13</td>
                </tr>

                <tr>
                    <td>2</td>
                    <th><a href="#!">공지사항 안내입니다. 이용해주셔서 감사합니다</a></th>
                    <td>2017.06.15</td>
                </tr>

                <tr>
                    <td>1</td>
                    <th><a href="#!">공지사항 안내입니다. 이용해주셔서 감사합니다</a></th>
                    <td>2017.06.15</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

</section>
</body>
<jsp:include page="/WEB-INF/views/include/footer.jsp"/>
</html>