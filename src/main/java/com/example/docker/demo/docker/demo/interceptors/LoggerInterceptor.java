//package com.example.docker.demo.docker.demo.interceptors;
//
//import com.example.docker.demo.docker.demo.utils.CustomHttpRequestWrapper;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.lang.Nullable;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.util.ContentCachingResponseWrapper;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Slf4j
//@Component
//public class LoggerInterceptor implements HandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        log.info("Handling request = {}", request.getRequestURI());
//        log.info("Request Method = {}", request.getMethod());
//
//        String body = ((CustomHttpRequestWrapper) request).getBody();
//        request.setAttribute("Pulkit", "Pulkit");
//        log.info("Request = {}",  body);
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
//        ContentCachingResponseWrapper resp = ((ContentCachingResponseWrapper) response);
//        String responseBody = new String(resp.getContentAsByteArray(), resp.getCharacterEncoding());
//        log.info("response = {}", responseBody);
//        resp.copyBodyToResponse();
//    }
//}
