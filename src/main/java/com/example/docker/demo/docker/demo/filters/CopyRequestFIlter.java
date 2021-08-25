//package com.example.docker.demo.docker.demo.filters;
//
//import com.example.docker.demo.docker.demo.utils.CustomHttpRequestWrapper;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.web.util.ContentCachingResponseWrapper;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Slf4j
//@Component
//@Order(1)
//public class CopyRequestFIlter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        CustomHttpRequestWrapper requestWrapper = new CustomHttpRequestWrapper((HttpServletRequest) servletRequest);
//        log.info("Handling request = {}", requestWrapper.getRequestURI());
//        log.info("Request Method = {}", requestWrapper.getMethod());
//
//        String body = requestWrapper.getBody();
//        requestWrapper.setAttribute("Pulkit", "Pulkit");
//
//        log.info("Request = {}",  body);
//        ContentCachingResponseWrapper contentCachingResponseWrapper = new ContentCachingResponseWrapper((HttpServletResponse) servletResponse);
//        filterChain.doFilter(requestWrapper, contentCachingResponseWrapper);
//
//        String responseBody = new String(contentCachingResponseWrapper.getContentAsByteArray(), contentCachingResponseWrapper.getCharacterEncoding());
//        log.info("response = {}", responseBody);
//        contentCachingResponseWrapper.copyBodyToResponse();
//    }
//}
