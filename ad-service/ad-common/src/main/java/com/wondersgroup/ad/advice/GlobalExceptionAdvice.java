package com.wondersgroup.ad.advice;

import com.wondersgroup.ad.exception.AdException;
import com.wondersgroup.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 *  统一异常处理
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(AdException.class)
    public CommonResponse<String> handleException(HttpServletRequest request, AdException  ed){
        CommonResponse<String> response=new CommonResponse<>(0,"busscess err");
        response.setData(ed.getMessage());
        return response;
    }
}
