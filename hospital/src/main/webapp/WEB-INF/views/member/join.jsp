<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/resources/css/member/join.css">
</head>
<jsp:include page="/WEB-INF/views/include/header.jsp"/>
<body>
<section class="h-100">
<form id="join_form" method="post">
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
                      <input type="text" name="patient_id" id="id_input" class="form-control form-control-lg" placeholder="아이디" />
                    </div>
                    <span class="id_input_re_1">사용 가능한 아이디입니다.</span>
					<span class="id_input_re_2">아이디가 이미 존재합니다.</span>
					<span class="final_id_ck">아이디를 입력해주세요.</span>
                  </div>
                </div>
                
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="password" name="patient_pw" id="form3Example1m1" class="form-control form-control-lg" placeholder="비밀번호"/>
                    </div>
                    <span class="final_pw_ck">비밀번호를 입력해주세요.</span>
                  </div>
                </div>
                
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="password" name="patient_pw_chk" id="form3Example1m1" class="form-control form-control-lg" placeholder="비밀번호 확인"/>
                    </div>
                    <span class="final_pwck_ck">비밀번호 확인을 입력해주세요.</span>
                    <span class="pwck_input_re_1">비밀번호가 일치합니다.</span>
                	<span class="pwck_input_re_2">비밀번호가 일치하지 않습니다.</span>
                  </div>
                </div>
                
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="text" name="patient_name" id="form3Example1m1" class="form-control form-control-lg" placeholder="이름"/>
                    </div>
                    <span class="final_name_ck">이름을 입력해주세요.</span>
                  </div>
                </div>
                
                <div class="row">
                  <div class="col-md-9 mb-4">
                    <div class="form-outline">
                      <input type="text" name="patient_phone" id="form3Example1m1" class="form-control form-control-lg" placeholder="전화번호"/>
                    </div>
                    <span class="final_phone_ck">전화번호를 입력해주세요.</span>
                  </div>
                </div>
                
                <div class="row">
  					<div class="col-md-9 mb-4">
    					<div class="form-outline">
      						<input type="date" name="patient_birth" id="form3Example1m1" class="form-control form-control-lg" placeholder="생년월일을 입력해주세요" />
    					</div>
  					</div>
				</div>
                
                <div class="row">
    				<div class="col-md-5 mb-4">
        				<div class="form-outline">
            				<input type="text" name="patient_address1" class="form-control form-control-lg" readonly="readonly" placeholder="주소"/>
        				</div>
    				</div>
    				<div class="col-md-5 mb-4">
        				<button type="button" class="btn btn-outline-primary" onclick="execution_daum_address()">주소찾기</button>
    				</div>
				</div>
                
                <div class="form-outline mb-4">
                  <input type="text" name="patient_address2" class="form-control form-control-lg" readonly="readonly" placeholder="기본주소"/>
                </div>
                
                <div class="form-outline mb-4">
                  <input type="text" name="patient_address3" class="form-control form-control-lg" readonly="readonly" placeholder="나머지주소"/>
                  <span class="final_addr_ck">주소를 입력해주세요.</span>
                </div>

              <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">
  					<h5 class="mb-0 me-4">성별 : </h5>
  					<div class="form-check form-check-inline mb-0 me-4">
    					<input class="form-check-input" type="radio" name="patient_gender" id="femaleGender" value="female" />
    					<label class="form-check-label" for="femaleGender">남</label>
  					</div>
  			  		<div class="form-check form-check-inline mb-0 me-4">
    					<input class="form-check-input" type="radio" name="patient_gender" id="maleGender" value="male" />
    					<label class="form-check-label" for="maleGender">여</label>
  					</div>
			  </div>

			  <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">
  				<h5 class="mb-0 me-4">혈액형 : </h5>
  				<div class="form-check form-check-inline mb-0 me-4">
    				<input class="form-check-input" type="radio" name="patient_blood" id="bloodTypeA" value="A" />
    				<label class="form-check-label" for="bloodTypeA">A</label>
  				</div>
  				
  			    <div class="form-check form-check-inline mb-0 me-4">
    				<input class="form-check-input" type="radio" name="patient_blood" id="bloodTypeB" value="B" />
    				<label class="form-check-label" for="bloodTypeB">B</label>
  				</div>
  				
  				<div class="form-check form-check-inline mb-0 me-4">
    				<input class="form-check-input" type="radio" name="patient_blood" id="bloodTypeO" value="O" />
    				<label class="form-check-label" for="bloodTypeO">O</label>
  				</div>
  				
  				<div class="form-check form-check-inline mb-0 me-4">
    				<input class="form-check-input" type="radio" name="patient_blood" id="bloodTypeAB" value="AB" />
    				<label class="form-check-label" for="bloodTypeAB">AB</label>
  				</div>
			  </div>

                <div class="d-flex justify-content-end pt-3">
                  <button type="button" name="join_button" class="btn btn-primary btn-lg ms-2">회원가입</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  </form>
</section>
</body>
<jsp:include page="/WEB-INF/views/include/footer.jsp"/>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>

<script>

/* 유효성 검사 통과유무 변수 */

var idCheck = false;            // 아이디
var idckCheck = false;            // 아이디 중복 검사
var pwCheck = false;            // 비번
var pwckCheck = false;            // 비번 확인
var pwckcorCheck = false;        // 비번 확인 일치 확인
var nameCheck = false;            // 이름
var phoneCheck = false;				// 전화번호
var addressCheck = false         // 주소


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
            $("[name=patient_address1]").val(data.zonecode);    // 대체가능
            $("[name=patient_address2]").val(addr);            // 대체가능
            // 상세주소 입력란 disabled 속성 변경 및 커서를 상세주소 필드로 이동한다.
            $("[name=patient_address3]").attr("readonly",false);
            $("[name=patient_address3]").focus();
        }
    }).open();    
}

/* 비밀번호 확인 일치 유효성 검사 */

$('[name=patient_pw_chk]').on("propertychange change keyup paste input", function(){
 
    var pw = $('[name=patient_pw]').val();
    var pwck = $('[name=patient_pw_chk]').val();
    $('.final_pwck_ck').css('display', 'none');
 
    if(pw == pwck){
        $('.pwck_input_re_1').css('display','block');
        $('.pwck_input_re_2').css('display','none');
        pwckcorCheck = true;
    }else{
        $('.pwck_input_re_1').css('display','none');
        $('.pwck_input_re_2').css('display','block');
        pwckcorCheck = false;
    }        
    
});

/* 회원가입 기능 작동관련 로직 */
	$(document).ready(function(){
	//회원가입 버튼(회원가입 기능 작동)
	$("[name=join_button]").click(function(){
		
		/* 입력값 변수 */
        var id = $('[name=patient_id]').val();            // id 입력란
        var pw = $('[name=patient_pw]').val();            // 비밀번호 입력란
        var pwck = $('[name=patient_pw_chk]').val();      // 비밀번호 확인 입력란
        var name = $('[name=patient_name]').val();        // 이름 입력란
        var phone = $('[name=patient_phone]').val();        // 전화번호 입력란
        var addr = $('[name=patient_address3]').val();    // 주소 입력란
        
        /* 아이디 유효성검사 */
        if(id == ""){
            $('.final_id_ck').css('display','block');
            idCheck = false;
        }else{
            $('.final_id_ck').css('display', 'none');
            idCheck = true;
        }
        
        /* 비밀번호 유효성 검사 */
        if(pw == ""){
            $('.final_pw_ck').css('display','block');
            pwCheck = false;
        }else{
            $('.final_pw_ck').css('display', 'none');
            pwCheck = true;
        }
        
        /* 비밀번호 확인 유효성 검사 */
        if(pwck == ""){
            $('.final_pwck_ck').css('display','block');
            pwckCheck = false;
        }else{
            $('.final_pwck_ck').css('display', 'none');
            pwckCheck = true;
        } 
        
        /* 이름 유효성 검사 */
        if(name == ""){
            $('.final_name_ck').css('display','block');
            nameCheck = false;
        }else{
            $('.final_name_ck').css('display', 'none');
            nameCheck = true;
        }
        
        /* 전화번호 유효성 검사 */
        if(name == ""){
            $('.final_phone_ck').css('display','block');
            nameCheck = false;
        }else{
            $('.final_phone_ck').css('display', 'none');
            nameCheck = true;
        }
        
        /* 주소 유효성 검사 */
        if(addr == ""){
            $('.final_addr_ck').css('display','block');
            addressCheck = false;
        }else{
            $('.final_addr_ck').css('display', 'none');
            addressCheck = true;
        }
        
        /* 최종 유효성 검사 */
        if(idCheck&&idckCheck&&pwCheck&&pwckCheck&&pwckcorCheck&&nameCheck&&phoneCheck&&addressCheck ){

    		$("#join_form").attr("action", "/member/join");
    		$("#join_form").submit();
        } 
        
        return false;
	});
});

/* 아이디 중복검사 로직 */
//아이디 중복검사
$('#id_input').on("propertychange change keyup paste input", function(){
	
	var patient_id = $('#id_input').val(); // #id_input에 입력되는 값
	var data = {patient_id : patient_id}   // 컨트롤에 넘길 데이터 이름 : 데이터(#id_input에 입력되는 값)
	
	$.ajax({
		type : "post",
		url : "/member/patientIdChk",
		data : data,
		success : function(result){
			if(result != 'fail'){
				$('.id_input_re_1').css("display","inline-block");
				$('.id_input_re_2').css("display", "none");
				// 아이디 중복이 없는 경우
				idckCheck = true;
			} else {
				$('.id_input_re_2').css("display","inline-block");
				$('.id_input_re_1').css("display", "none");	
				// 아이디 중복된 경우
				idckCheck = false;
			}
		} // success 종료
	}); // ajax 종료
});

</script>
</html>