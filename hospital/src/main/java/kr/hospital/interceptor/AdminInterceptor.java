package kr.hospital.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class AdminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.isUserInRole("ADMIN")) {
            return true; // 계속 진행
        } else {
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "Permission Denied");
            return false; // 요청 중지
        }
    }
}
