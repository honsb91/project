<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<%@ include file="/include/header.jsp"%>
<body>
<section class="h-100">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4">
          <div class="row g-0">
            <div class="col-xl-6 d-none d-xl-block">
              <img src="/resources/assets/img/test5.jpg" alt="Sample photo" class="img-fluid"
                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
            </div>
            <div class="col-xl-6">
              <div class="card-body p-md-5 text-black">
                <div class="d-flex align-items-center mb-3 pb-1">
                    <i class="fas fa-cubes fa-2x me-3" style="color: #00ced1;"></i>
                    <span class="h1 fw-bold mb-0">Health Care</span>
                  </div>
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="text" id="form3Example1m" class="form-control form-control-lg" placeholder="아이디" />
                    </div>
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="password" id="form3Example1m1" class="form-control form-control-lg" placeholder="비밀번호"/>
                    </div>
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="text" id="form3Example1m1" class="form-control form-control-lg" placeholder="이름"/>
                    </div>
                  </div>
                </div>
                
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="text" id="form3Example1m1" class="form-control form-control-lg" placeholder="전화번호"/>
                    </div>
                  </div>
                </div>
                
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="date" id="form3Example1m1" class="form-control form-control-lg" />
                    </div>
                  </div>
                </div>
                
                <div class="row">
    				<div class="col-md-5 mb-4">
        				<div class="form-outline">
            				<input type="text" name="patient_addr1" class="form-control form-control-lg" readonly="readonly" placeholder="주소"/>
        				</div>
    				</div>
    				<div class="col-md-5 mb-4">
        				<button type="button" class="btn btn-outline-primary" onclick="execution_daum_address()">주소찾기</button>
    				</div>
				</div>
                
                <div class="form-outline mb-4">
                  <input type="text" name="patient_addr2" class="form-control form-control-lg" readonly="readonly" placeholder="기본주소"/>
                </div>
                
                <div class="form-outline mb-4">
                  <input type="text" name="patient_addr3" class="form-control form-control-lg" readonly="readonly" placeholder="나머지주소"/>
                </div>

              <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">
  <h5 class="mb-0 me-4">성별 : </h5>
  <div class="form-check form-check-inline mb-0 me-4">
    <input class="form-check-input" type="radio" name="gender" id="femaleGender" value="female" />
    <label class="form-check-label" for="femaleGender">남</label>
  </div>
  <div class="form-check form-check-inline mb-0 me-4">
    <input class="form-check-input" type="radio" name="gender" id="maleGender" value="male" />
    <label class="form-check-label" for="maleGender">여</label>
  </div>
</div>

<div class="d-md-flex justify-content-start align-items-center mb-4 py-2">
  <h5 class="mb-0 me-4">혈액형 : </h5>
  <div class="form-check form-check-inline mb-0 me-4">
    <input class="form-check-input" type="radio" name="bloodType" id="bloodTypeA" value="A" />
    <label class="form-check-label" for="bloodTypeA">A</label>
  </div>
  <div class="form-check form-check-inline mb-0 me-4">
    <input class="form-check-input" type="radio" name="bloodType" id="bloodTypeB" value="B" />
    <label class="form-check-label" for="bloodTypeB">B</label>
  </div>
  <div class="form-check form-check-inline mb-0 me-4">
    <input class="form-check-input" type="radio" name="bloodType" id="bloodTypeO" value="O" />
    <label class="form-check-label" for="bloodTypeO">O</label>
  </div>
  <div class="form-check form-check-inline mb-0 me-4">
    <input class="form-check-input" type="radio" name="bloodType" id="bloodTypeAB" value="AB" />
    <label class="form-check-label" for="bloodTypeAB">AB</label>
  </div>
</div>

                <div class="d-flex justify-content-end pt-3">
                  <button type="button" class="btn btn-primary btn-lg ms-2">회원가입</button>
                </div>

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
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

<script>
/* 다음 주소 연동 */
function execution_daum_address(){
 
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
        	// 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var addr = ''; // 주소 변수
            var extraAddr = ''; // 참고항목 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
            if(data.userSelectedType === 'R'){
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraAddr !== ''){
                    extraAddr = ' (' + extraAddr + ')';
                }
             // 주소변수 문자열과 참고항목 문자열 합치기
                addr += extraAddr;
            
            } else {
            	addr += ' ';
            }
            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            $("[name=patient_addr1]").val(data.zonecode);    // 대체가능
            $("[name=patient_addr2]").val(addr);            // 대체가능
            // 상세주소 입력란 disabled 속성 변경 및 커서를 상세주소 필드로 이동한다.
            $("[name=patient_addr3]").attr("readonly",false);
            $("[name=patient_addr3]").focus();
        }
    }).open();    
}
</script>
</html>