/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2024-02-06 03:43:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1701841532375L));
    _jspx_dependants.put("jar:file:/D:/project/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hospital/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/member/join.css\">\r\n");
      out.write("</head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/include/header.jsp", out, false);
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<section class=\"h-100\">\r\n");
      out.write("<form id=\"join_form\" method=\"post\">\r\n");
      out.write("  <div class=\"container py-5 h-100\">\r\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("      <div class=\"col\">\r\n");
      out.write("        <div class=\"card card-registration my-4\">\r\n");
      out.write("          <div class=\"row g-0\">\r\n");
      out.write("            <div class=\"col-xl-6 d-none d-xl-block\">\r\n");
      out.write("              <img src=\"/resources/assets/img/test5.jpg\" alt=\"Sample photo\" class=\"img-fluid\"\r\n");
      out.write("                style=\"border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xl-6\">\r\n");
      out.write("              <div class=\"card-body p-md-5 text-black\">\r\n");
      out.write("                <div class=\"d-flex align-items-center mb-3 pb-1\">\r\n");
      out.write("                    <i class=\"fas fa-cubes fa-2x me-3\" style=\"color: #00ced1;\"></i>\r\n");
      out.write("                    <span class=\"h1 fw-bold mb-0\">Health Care</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-9 mb-4\">\r\n");
      out.write("                    <div class=\"form-outline\">\r\n");
      out.write("                      <input type=\"text\" name=\"patient_id\" id=\"id_input\" class=\"form-control form-control-lg\" placeholder=\"아이디\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"id_input_re_1\">사용 가능한 아이디입니다.</span>\r\n");
      out.write("					<span class=\"id_input_re_2\">아이디가 이미 존재합니다.</span>\r\n");
      out.write("					<span class=\"final_id_ck\">아이디를 입력해주세요.</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-9 mb-4\">\r\n");
      out.write("                    <div class=\"form-outline\">\r\n");
      out.write("                      <input type=\"password\" name=\"patient_pw\" id=\"form3Example1m1\" class=\"form-control form-control-lg\" placeholder=\"비밀번호\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"final_pw_ck\">비밀번호를 입력해주세요.</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-9 mb-4\">\r\n");
      out.write("                    <div class=\"form-outline\">\r\n");
      out.write("                      <input type=\"password\" name=\"patient_pw_chk\" id=\"form3Example1m1\" class=\"form-control form-control-lg\" placeholder=\"비밀번호 확인\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"final_pwck_ck\">비밀번호 확인을 입력해주세요.</span>\r\n");
      out.write("                    <span class=\"pwck_input_re_1\">비밀번호가 일치합니다.</span>\r\n");
      out.write("                	<span class=\"pwck_input_re_2\">비밀번호가 일치하지 않습니다.</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-9 mb-4\">\r\n");
      out.write("                    <div class=\"form-outline\">\r\n");
      out.write("                      <input type=\"text\" name=\"patient_name\" id=\"form3Example1m1\" class=\"form-control form-control-lg\" placeholder=\"이름\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"final_name_ck\">이름을 입력해주세요.</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-9 mb-4\">\r\n");
      out.write("                    <div class=\"form-outline\">\r\n");
      out.write("                      <input type=\"text\" name=\"patient_phone\" id=\"form3Example1m1\" class=\"form-control form-control-lg\" placeholder=\"전화번호\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"final_phone_ck\">전화번호를 입력해주세요.</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("  					<div class=\"col-md-9 mb-4\">\r\n");
      out.write("    					<div class=\"form-outline\">\r\n");
      out.write("      						<input type=\"date\" name=\"patient_birth\" id=\"form3Example1m1\" class=\"form-control form-control-lg\" placeholder=\"생년월일을 입력해주세요\" />\r\n");
      out.write("    					</div>\r\n");
      out.write("  					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("    				<div class=\"col-md-5 mb-4\">\r\n");
      out.write("        				<div class=\"form-outline\">\r\n");
      out.write("            				<input type=\"text\" name=\"patient_address1\" class=\"form-control form-control-lg\" readonly=\"readonly\" placeholder=\"주소\"/>\r\n");
      out.write("        				</div>\r\n");
      out.write("    				</div>\r\n");
      out.write("    				<div class=\"col-md-5 mb-4\">\r\n");
      out.write("        				<button type=\"button\" class=\"btn btn-outline-primary\" onclick=\"execution_daum_address()\">주소찾기</button>\r\n");
      out.write("    				</div>\r\n");
      out.write("				</div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-outline mb-4\">\r\n");
      out.write("                  <input type=\"text\" name=\"patient_address2\" class=\"form-control form-control-lg\" readonly=\"readonly\" placeholder=\"기본주소\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-outline mb-4\">\r\n");
      out.write("                  <input type=\"text\" name=\"patient_address3\" class=\"form-control form-control-lg\" readonly=\"readonly\" placeholder=\"나머지주소\"/>\r\n");
      out.write("                  <span class=\"final_addr_ck\">주소를 입력해주세요.</span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"d-md-flex justify-content-start align-items-center mb-4 py-2\">\r\n");
      out.write("  					<h5 class=\"mb-0 me-4\">성별 : </h5>\r\n");
      out.write("  					<div class=\"form-check form-check-inline mb-0 me-4\">\r\n");
      out.write("    					<input class=\"form-check-input\" type=\"radio\" name=\"patient_gender\" id=\"femaleGender\" value=\"female\" />\r\n");
      out.write("    					<label class=\"form-check-label\" for=\"femaleGender\">남</label>\r\n");
      out.write("  					</div>\r\n");
      out.write("  			  		<div class=\"form-check form-check-inline mb-0 me-4\">\r\n");
      out.write("    					<input class=\"form-check-input\" type=\"radio\" name=\"patient_gender\" id=\"maleGender\" value=\"male\" />\r\n");
      out.write("    					<label class=\"form-check-label\" for=\"maleGender\">여</label>\r\n");
      out.write("  					</div>\r\n");
      out.write("			  </div>\r\n");
      out.write("\r\n");
      out.write("			  <div class=\"d-md-flex justify-content-start align-items-center mb-4 py-2\">\r\n");
      out.write("  				<h5 class=\"mb-0 me-4\">혈액형 : </h5>\r\n");
      out.write("  				<div class=\"form-check form-check-inline mb-0 me-4\">\r\n");
      out.write("    				<input class=\"form-check-input\" type=\"radio\" name=\"patient_blood\" id=\"bloodTypeA\" value=\"A\" />\r\n");
      out.write("    				<label class=\"form-check-label\" for=\"bloodTypeA\">A</label>\r\n");
      out.write("  				</div>\r\n");
      out.write("  				\r\n");
      out.write("  			    <div class=\"form-check form-check-inline mb-0 me-4\">\r\n");
      out.write("    				<input class=\"form-check-input\" type=\"radio\" name=\"patient_blood\" id=\"bloodTypeB\" value=\"B\" />\r\n");
      out.write("    				<label class=\"form-check-label\" for=\"bloodTypeB\">B</label>\r\n");
      out.write("  				</div>\r\n");
      out.write("  				\r\n");
      out.write("  				<div class=\"form-check form-check-inline mb-0 me-4\">\r\n");
      out.write("    				<input class=\"form-check-input\" type=\"radio\" name=\"patient_blood\" id=\"bloodTypeO\" value=\"O\" />\r\n");
      out.write("    				<label class=\"form-check-label\" for=\"bloodTypeO\">O</label>\r\n");
      out.write("  				</div>\r\n");
      out.write("  				\r\n");
      out.write("  				<div class=\"form-check form-check-inline mb-0 me-4\">\r\n");
      out.write("    				<input class=\"form-check-input\" type=\"radio\" name=\"patient_blood\" id=\"bloodTypeAB\" value=\"AB\" />\r\n");
      out.write("    				<label class=\"form-check-label\" for=\"bloodTypeAB\">AB</label>\r\n");
      out.write("  				</div>\r\n");
      out.write("			  </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"d-flex justify-content-end pt-3\">\r\n");
      out.write("                  <button type=\"button\" name=\"join_button\" class=\"btn btn-primary btn-lg ms-2\">회원가입</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </form>\r\n");
      out.write("</section>\r\n");
      out.write("</body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("  integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("/* 유효성 검사 통과유무 변수 */\r\n");
      out.write("\r\n");
      out.write("var idCheck = false;            // 아이디\r\n");
      out.write("var idckCheck = false;            // 아이디 중복 검사\r\n");
      out.write("var pwCheck = false;            // 비번\r\n");
      out.write("var pwckCheck = false;            // 비번 확인\r\n");
      out.write("var pwckcorCheck = false;        // 비번 확인 일치 확인\r\n");
      out.write("var nameCheck = false;            // 이름\r\n");
      out.write("var phoneCheck = false;				// 전화번호\r\n");
      out.write("var addressCheck = false         // 주소\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* 다음 주소 연동 */\r\n");
      out.write("function execution_daum_address(){\r\n");
      out.write(" \r\n");
      out.write("    new daum.Postcode({\r\n");
      out.write("        oncomplete: function(data) {\r\n");
      out.write("            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.\r\n");
      out.write("        	// 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("            var addr = ''; // 주소 변수\r\n");
      out.write("            var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                addr = data.roadAddress;\r\n");
      out.write("            } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                addr = data.jibunAddress;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("            if(data.userSelectedType === 'R'){\r\n");
      out.write("                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                    extraAddr += data.bname;\r\n");
      out.write("                }\r\n");
      out.write("                // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                }\r\n");
      out.write("                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                if(extraAddr !== ''){\r\n");
      out.write("                    extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                }\r\n");
      out.write("             // 주소변수 문자열과 참고항목 문자열 합치기\r\n");
      out.write("                addr += extraAddr;\r\n");
      out.write("            \r\n");
      out.write("            } else {\r\n");
      out.write("            	addr += ' ';\r\n");
      out.write("            }\r\n");
      out.write("            // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("            $(\"[name=patient_address1]\").val(data.zonecode);    // 대체가능\r\n");
      out.write("            $(\"[name=patient_address2]\").val(addr);            // 대체가능\r\n");
      out.write("            // 상세주소 입력란 disabled 속성 변경 및 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("            $(\"[name=patient_address3]\").attr(\"readonly\",false);\r\n");
      out.write("            $(\"[name=patient_address3]\").focus();\r\n");
      out.write("        }\r\n");
      out.write("    }).open();    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 비밀번호 확인 일치 유효성 검사 */\r\n");
      out.write("\r\n");
      out.write("$('[name=patient_pw_chk]').on(\"propertychange change keyup paste input\", function(){\r\n");
      out.write(" \r\n");
      out.write("    var pw = $('[name=patient_pw]').val();\r\n");
      out.write("    var pwck = $('[name=patient_pw_chk]').val();\r\n");
      out.write("    $('.final_pwck_ck').css('display', 'none');\r\n");
      out.write(" \r\n");
      out.write("    if(pw == pwck){\r\n");
      out.write("        $('.pwck_input_re_1').css('display','block');\r\n");
      out.write("        $('.pwck_input_re_2').css('display','none');\r\n");
      out.write("        pwckcorCheck = true;\r\n");
      out.write("    }else{\r\n");
      out.write("        $('.pwck_input_re_1').css('display','none');\r\n");
      out.write("        $('.pwck_input_re_2').css('display','block');\r\n");
      out.write("        pwckcorCheck = false;\r\n");
      out.write("    }        \r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("/* 회원가입 기능 작동관련 로직 */\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("	//회원가입 버튼(회원가입 기능 작동)\r\n");
      out.write("	$(\"[name=join_button]\").click(function(){\r\n");
      out.write("		\r\n");
      out.write("		/* 입력값 변수 */\r\n");
      out.write("        var id = $('[name=patient_id]').val();            // id 입력란\r\n");
      out.write("        var pw = $('[name=patient_pw]').val();            // 비밀번호 입력란\r\n");
      out.write("        var pwck = $('[name=patient_pw_chk]').val();      // 비밀번호 확인 입력란\r\n");
      out.write("        var name = $('[name=patient_name]').val();        // 이름 입력란\r\n");
      out.write("        var phone = $('[name=patient_phone]').val();        // 전화번호 입력란\r\n");
      out.write("        var addr = $('[name=patient_address3]').val();    // 주소 입력란\r\n");
      out.write("        \r\n");
      out.write("        /* 아이디 유효성검사 */\r\n");
      out.write("        if(id == \"\"){\r\n");
      out.write("            $('.final_id_ck').css('display','block');\r\n");
      out.write("            idCheck = false;\r\n");
      out.write("        }else{\r\n");
      out.write("            $('.final_id_ck').css('display', 'none');\r\n");
      out.write("            idCheck = true;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /* 비밀번호 유효성 검사 */\r\n");
      out.write("        if(pw == \"\"){\r\n");
      out.write("            $('.final_pw_ck').css('display','block');\r\n");
      out.write("            pwCheck = false;\r\n");
      out.write("        }else{\r\n");
      out.write("            $('.final_pw_ck').css('display', 'none');\r\n");
      out.write("            pwCheck = true;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /* 비밀번호 확인 유효성 검사 */\r\n");
      out.write("        if(pwck == \"\"){\r\n");
      out.write("            $('.final_pwck_ck').css('display','block');\r\n");
      out.write("            pwckCheck = false;\r\n");
      out.write("        }else{\r\n");
      out.write("            $('.final_pwck_ck').css('display', 'none');\r\n");
      out.write("            pwckCheck = true;\r\n");
      out.write("        } \r\n");
      out.write("        \r\n");
      out.write("        /* 이름 유효성 검사 */\r\n");
      out.write("        if(name == \"\"){\r\n");
      out.write("            $('.final_name_ck').css('display','block');\r\n");
      out.write("            nameCheck = false;\r\n");
      out.write("        }else{\r\n");
      out.write("            $('.final_name_ck').css('display', 'none');\r\n");
      out.write("            nameCheck = true;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /* 전화번호 유효성 검사 */\r\n");
      out.write("        if(name == \"\"){\r\n");
      out.write("            $('.final_phone_ck').css('display','block');\r\n");
      out.write("            nameCheck = false;\r\n");
      out.write("        }else{\r\n");
      out.write("            $('.final_phone_ck').css('display', 'none');\r\n");
      out.write("            nameCheck = true;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /* 주소 유효성 검사 */\r\n");
      out.write("        if(addr == \"\"){\r\n");
      out.write("            $('.final_addr_ck').css('display','block');\r\n");
      out.write("            addressCheck = false;\r\n");
      out.write("        }else{\r\n");
      out.write("            $('.final_addr_ck').css('display', 'none');\r\n");
      out.write("            addressCheck = true;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /* 최종 유효성 검사 */\r\n");
      out.write("        if(idCheck&&idckCheck&&pwCheck&&pwckCheck&&pwckcorCheck&&nameCheck&&phoneCheck&&addressCheck ){\r\n");
      out.write("\r\n");
      out.write("    		$(\"#join_form\").attr(\"action\", \"/member/join\");\r\n");
      out.write("    		$(\"#join_form\").submit();\r\n");
      out.write("        } \r\n");
      out.write("        \r\n");
      out.write("        return false;\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("/* 아이디 중복검사 로직 */\r\n");
      out.write("//아이디 중복검사\r\n");
      out.write("$('#id_input').on(\"propertychange change keyup paste input\", function(){\r\n");
      out.write("	\r\n");
      out.write("	var patient_id = $('#id_input').val(); // #id_input에 입력되는 값\r\n");
      out.write("	var data = {patient_id : patient_id}   // 컨트롤에 넘길 데이터 이름 : 데이터(#id_input에 입력되는 값)\r\n");
      out.write("	\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		type : \"post\",\r\n");
      out.write("		url : \"/member/patientIdChk\",\r\n");
      out.write("		data : data,\r\n");
      out.write("		success : function(result){\r\n");
      out.write("			if(result != 'fail'){\r\n");
      out.write("				$('.id_input_re_1').css(\"display\",\"inline-block\");\r\n");
      out.write("				$('.id_input_re_2').css(\"display\", \"none\");\r\n");
      out.write("				// 아이디 중복이 없는 경우\r\n");
      out.write("				idckCheck = true;\r\n");
      out.write("			} else {\r\n");
      out.write("				$('.id_input_re_2').css(\"display\",\"inline-block\");\r\n");
      out.write("				$('.id_input_re_1').css(\"display\", \"none\");	\r\n");
      out.write("				// 아이디 중복된 경우\r\n");
      out.write("				idckCheck = false;\r\n");
      out.write("			}\r\n");
      out.write("		} // success 종료\r\n");
      out.write("	}); // ajax 종료\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
