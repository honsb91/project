/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2024-02-01 01:54:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class notice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1706162905758L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1701841532375L));
    _jspx_dependants.put("jar:file:/D:/project/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hospital/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1706752436638L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/notice/notice.css\">\r\n");
      out.write("<script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("  integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"\" />\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"/resources/assets/favicon.ico\" />\r\n");
      out.write("<!-- Font Awesome icons (free version)-->\r\n");
      out.write("<script src=\"https://use.fontawesome.com/releases/v6.3.0/js/all.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- Google fonts-->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("<link href=\"/resources/css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Navigation-->\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light\" id=\"mainNav\">\r\n");
      out.write("		<div class=\"container px-4 px-lg-5\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"/main\">Health Care</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarResponsive\"\r\n");
      out.write("				aria-controls=\"navbarResponsive\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				Menu <i class=\"fas fa-bars\"></i>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("				<ul class=\"navbar-nav ms-auto py-4 py-lg-0 \">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/main\">Home</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/notice/notice.jsp\">FAQ</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/announcement/announcement.jsp\">공지사항</a></li>\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<!-- Page Header-->\r\n");
      out.write("	<header class=\"masthead\" style=\"background-image: url('/resources/assets/img/test4.png')\">\r\n");
      out.write("		<div class=\"container position-relative px-4 px-lg-5\">\r\n");
      out.write("			<div class=\"row gx-4 gx-lg-5 justify-content-center\">\r\n");
      out.write("				<div class=\"col-md-10 col-lg-8 col-xl-7\">\r\n");
      out.write("					<div class=\"site-heading\">\r\n");
      out.write("						<h1>Health Care</h1>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"faq\">\r\n");
      out.write("  <h2>FAQ</h2>\r\n");
      out.write("<ol class=\"qna-list accordion\">\r\n");
      out.write("						<li class=\"qna-item\">\r\n");
      out.write("							<div class=\"question-article\">\r\n");
      out.write("								<a href=\"#!\" class=\"question btn-fold\">\r\n");
      out.write("									<strong class=\"blind\">질문:</strong>\r\n");
      out.write("									<span class=\"q\">Q</span>방문 상담이 가능한가요?\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"answer-article\">\r\n");
      out.write("								<strong class=\"blind\">답변</strong>\r\n");
      out.write("								<div id=\"answer-cnt\">\r\n");
      out.write("									<p>보도자료 배포 결과는 뉴스 가치, 주제, 배포시기 등에 따라 달라집니다. </p>\r\n");
      out.write("									<p>평균적으로 <a href=\"#!\">스탠다드 서비스</a>는 보도자료 한 건당 7.9개 기사가 보도되며, 프리미엄 서비스는 평균 17개 기사가 보도됩니다.</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"qna-item\">\r\n");
      out.write("							<div class=\"question-article\">\r\n");
      out.write("								<a href=\"#!\" class=\"question btn-fold\">\r\n");
      out.write("									<strong class=\"blind\">질문:</strong>\r\n");
      out.write("									<span class=\"q\">Q</span>승인된 보도자료를 수정 또는 삭제하려면 어떻게 해야 하나요?\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"answer-article\">\r\n");
      out.write("								<strong class=\"blind\">답변</strong>\r\n");
      out.write("								<div id=\"answer-cnt\">\r\n");
      out.write("									<p>보도자료 배포 결과는 뉴스 가치, 주제, 배포시기 등에 따라 달라집니다. </p>\r\n");
      out.write("									<p>평균적으로 <a href=\"#!\">스탠다드 서비스</a>는 보도자료 한 건당 7.9개 기사가 보도되며, 프리미엄 서비스는 평균 17개 기사가 보도됩니다.</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"qna-item\">\r\n");
      out.write("							<div class=\"question-article\">\r\n");
      out.write("								<a href=\"#!\" class=\"question btn-fold\">\r\n");
      out.write("									<strong class=\"blind\">질문:</strong>\r\n");
      out.write("									<span class=\"q\">Q</span>방문 상담이 가능한가요?\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"answer-article\">\r\n");
      out.write("								<strong class=\"blind\">답변</strong>\r\n");
      out.write("								<div id=\"answer-cnt\">\r\n");
      out.write("									<p>보도자료 배포 결과는 뉴스 가치, 주제, 배포시기 등에 따라 달라집니다. </p>\r\n");
      out.write("									<p>평균적으로 <a href=\"#!\">스탠다드 서비스</a>는 보도자료 한 건당 7.9개 기사가 보도되며, 프리미엄 서비스는 평균 17개 기사가 보도됩니다.</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"qna-item\">\r\n");
      out.write("							<div class=\"question-article\">\r\n");
      out.write("								<a href=\"#!\" class=\"question btn-fold\">\r\n");
      out.write("									<strong class=\"blind\">질문:</strong>\r\n");
      out.write("									<span class=\"q\">Q</span>방문 상담이 가능한가요?\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"answer-article\">\r\n");
      out.write("								<strong class=\"blind\">답변</strong>\r\n");
      out.write("								<div id=\"answer-cnt\">\r\n");
      out.write("									<p>보도자료 배포 결과는 뉴스 가치, 주제, 배포시기 등에 따라 달라집니다. </p>\r\n");
      out.write("									<p>평균적으로 <a href=\"#!\">스탠다드 서비스</a>는 보도자료 한 건당 7.9개 기사가 보도되며, 프리미엄 서비스는 평균 17개 기사가 보도됩니다.</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"qna-item\">\r\n");
      out.write("							<div class=\"question-article\">\r\n");
      out.write("								<a href=\"#!\" class=\"question btn-fold\">\r\n");
      out.write("									<strong class=\"blind\">질문:</strong>\r\n");
      out.write("									<span class=\"q\">Q</span>방문 상담이 가능한가요?\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"answer-article\">\r\n");
      out.write("								<strong class=\"blind\">답변</strong>\r\n");
      out.write("								<div id=\"answer-cnt\">\r\n");
      out.write("									<p>보도자료 배포 결과는 뉴스 가치, 주제, 배포시기 등에 따라 달라집니다. </p>\r\n");
      out.write("									<p>평균적으로 <a href=\"#!\">스탠다드 서비스</a>는 보도자료 한 건당 7.9개 기사가 보도되며, 프리미엄 서비스는 평균 17개 기사가 보도됩니다.</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"qna-item\">\r\n");
      out.write("							<div class=\"question-article\">\r\n");
      out.write("								<a href=\"#!\" class=\"question btn-fold\">\r\n");
      out.write("									<strong class=\"blind\">질문:</strong>\r\n");
      out.write("									<span class=\"q\">Q</span>방문 상담이 가능한가요?\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"answer-article\">\r\n");
      out.write("								<strong class=\"blind\">답변</strong>\r\n");
      out.write("								<div id=\"answer-cnt\">\r\n");
      out.write("									<p>보도자료 배포 결과는 뉴스 가치, 주제, 배포시기 등에 따라 달라집니다. </p>\r\n");
      out.write("									<p>평균적으로 <a href=\"#!\">스탠다드 서비스</a>는 보도자료 한 건당 7.9개 기사가 보도되며, 프리미엄 서비스는 평균 17개 기사가 보도됩니다.</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"qna-item\">\r\n");
      out.write("							<div class=\"question-article\">\r\n");
      out.write("								<a href=\"#!\" class=\"question btn-fold\">\r\n");
      out.write("									<strong class=\"blind\">질문:</strong>\r\n");
      out.write("									<span class=\"q\">Q</span>방문 상담이 가능한가요?\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"answer-article\">\r\n");
      out.write("								<strong class=\"blind\">답변</strong>\r\n");
      out.write("								<div id=\"answer-cnt\">\r\n");
      out.write("									<p>보도자료 배포 결과는 뉴스 가치, 주제, 배포시기 등에 따라 달라집니다. </p>\r\n");
      out.write("									<p>평균적으로 <a href=\"#!\">스탠다드 서비스</a>는 보도자료 한 건당 7.9개 기사가 보도되며, 프리미엄 서비스는 평균 17개 기사가 보도됩니다.</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ol>\r\n");
      out.write("  </div>\r\n");
      out.write("<!-- <aside>\r\n");
      out.write("  <a href=\"javascript:void(0)\">\r\n");
      out.write("    <i class=\"fa fa-user-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("    공지사항\r\n");
      out.write("  </a>\r\n");
      out.write("  <a href=\"javascript:void(0)\">\r\n");
      out.write("    <i class=\"fa fa-laptop\" aria-hidden=\"true\"></i>\r\n");
      out.write("    자주묻는 질문\r\n");
      out.write("  </a>\r\n");
      out.write("  <a href=\"javascript:void(0)\">\r\n");
      out.write("    <i class=\"fa fa-clone\" aria-hidden=\"true\"></i>\r\n");
      out.write("    FAQ\r\n");
      out.write("  </a>\r\n");
      out.write("  <a href=\"javascript:void(0)\">\r\n");
      out.write("    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("    1대1 문의\r\n");
      out.write("  </a>\r\n");
      out.write("  <a href=\"javascript:void(0)\">\r\n");
      out.write("    <i class=\"fa fa-trash-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("    주의할점\r\n");
      out.write("  </a>\r\n");
      out.write("</aside> -->\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("$(function() {\r\n");
      out.write("	$('.btn-fold').on('click', function(){\r\n");
      out.write("		if(!$(this).closest('.qna-item').hasClass('on')){\r\n");
      out.write("			$('.qna-item').removeClass('on').find('.answer-article').hide();\r\n");
      out.write("			 var oft = $(this).offset().top;\r\n");
      out.write("			$('html,body').stop().animate({scrollTop:oft - 250 }, 300)\r\n");
      out.write("			$(this).closest('.qna-item').addClass('on').find('.answer-article').slideDown(300)\r\n");
      out.write("\r\n");
      out.write("		}else{\r\n");
      out.write("			$(this).closest('.qna-item').removeClass('on').find('.answer-article').slideUp(300)\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer class=\"border-top\">\r\n");
      out.write("		<div class=\"container px-4 px-lg-5\">\r\n");
      out.write("			<div class=\"row gx-4 gx-lg-5 justify-content-center\">\r\n");
      out.write("				<div class=\"col-md-10 col-lg-8 col-xl-7\">\r\n");
      out.write("					<div class=\"small text-center text-muted fst-italic\">Copyright\r\n");
      out.write("						&copy; A팀 최종 프로젝트 2024</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- Bootstrap core JS-->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<!-- Core theme JS-->\r\n");
      out.write("	<script src=\"js/scripts.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /include/header.jsp(37,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty patient and empty admin}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    				<!-- 로그인 안 된 경우 -->\r\n");
          out.write("    					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/member/login.jsp\">로그인</a></li>\r\n");
          out.write("    					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/admin/login.jsp\">관리자 로그인</a></li>\r\n");
          out.write("    					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/member/join.jsp\">회원가입</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /include/header.jsp(44,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty patient}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    				<!-- 일반 회원으로 로그인된 경우 -->\r\n");
          out.write("    					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/member/logout\">로그아웃</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /include/header.jsp(49,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty admin}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    				<!-- 관리자로 로그인된 경우 -->\r\n");
          out.write("    					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/admin/dashboard\">환자정보</a></li>\r\n");
          out.write("    					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/admin/dashboard\">FAQ 관리</a></li>\r\n");
          out.write("    					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/admin/dashboard\">공지사항 관리</a></li>\r\n");
          out.write("    					<li class=\"nav-item\"><a class=\"nav-link px-lg-3 py-3 py-lg-4\" href=\"/admin/logout\">로그아웃</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
