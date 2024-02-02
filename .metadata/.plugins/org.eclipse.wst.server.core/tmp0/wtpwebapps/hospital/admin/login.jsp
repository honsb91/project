<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<%@ include file="/include/header.jsp"%>
<body>
<section class="vh-100">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-6 col-lg-5 d-none d-md-block">
              <img src="/resources/assets/img/test5.jpg" alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">
                <form id="login_form" method="post">
                  <div class="d-flex align-items-center mb-3 pb-1">
                    <i class="fas fa-cubes fa-2x me-3" style="color: #00ced1;"></i>
                    <span class="h1 fw-bold mb-0">Health Care</span>
                  </div>
                  <div class="form-outline mb-4">
                    <input type="text" name="admin_id" class="form-control form-control-lg" />
                    <label class="form-label" for="form2Example17">아이디</label>
                  </div>

                  <div class="form-outline mb-4">
                    <input type="password" name="admin_pw" class="form-control form-control-lg" />
                    <label class="form-label" for="form2Example27">비밀번호</label>
                  </div>
                  
                  <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" name="login_button" type="button">Login</button>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
<%@ include file="/include/footer.jsp"%>
<script>
	// 로그인 버튼 클릭 메서드
	$("[name=login_button]").click(function(){
		$("#login_form").attr("action", "/admin/login");
		$("#login_form").submit();
	});
</script>
</html>