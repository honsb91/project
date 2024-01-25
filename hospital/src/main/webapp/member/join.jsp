<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/member/join.css">
</head>
<%@ include file="/include/header.jsp"%>
<body>
	<div>
		<form action="">
			<div class="wrap">
				<div class="subjecet">
					<span>회원가입</span>
				</div>

				<div class="id_wrap">
					<div class="id_name">아이디</div>
					<div class="id_input_box">
						<input class="id_input">
					</div>
				</div>

				<div class="pw_wrap">
					<div class="pw_name">비밀번호</div>
					<div class="pw_input_box">
						<input class="pw_input">
					</div>
				</div>

				<div class="pwck_wrap">
					<div class="pwck_name">비밀번호 확인</div>
					<div class="pwck_input_box">
						<input class="pwck_input">
					</div>
				</div>

				<div class="user_wrap">
					<div class="user_name">이름</div>
					<div class="user_input_box">
						<input class="user_input">
					</div>
				</div>

				<div class="phone_wrap">
					<div class="phone_name">전화번호</div>
					<div class="phone_input_box">
						<input class="phone_input">
					</div>
				</div>
				<div class="birth_wrap">
					<div class="birth_name">생년월일</div>
					<div class="birth_input_box">
						<input class="birth_input" type="date">
					</div>
				</div>

				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio"
						name="inlineRadioOptions" id="inlineRadio1" value="option1">
					<label class="form-check-label" for="inlineRadio1">남</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio"
						name="inlineRadioOptions" id="inlineRadio2" value="option2">
					<label class="form-check-label" for="inlineRadio2">2</label>
				</div>

				<select class="form-select" aria-label="Default select example">
					<option selected>혈액형</option>
					<option value="1">A</option>
					<option value="2">B</option>
					<option value="3">O</option>
					<option value="4">AB</option>
				</select>

				<div class="address_wrap">
					<div class="address_name">주소</div>
					<div class="address_input_1_wrap">
						<div class="address_input_1_box">
							<input class="address_input_1">
						</div>
						<div class="address_button">
							<span>주소 찾기</span>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="address_input_2_wrap">
						<div class="address_input_2_box">
							<input class="address_input_2">
						</div>
					</div>
					<div class="address_input_3_wrap">
						<div class="address_input_3_box">
							<input class="address_input_3">
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
<%@ include file="/include/footer.jsp"%>
</html>