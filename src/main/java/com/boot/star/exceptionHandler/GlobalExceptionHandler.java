package com.boot.star.exceptionHandler;
/**
 * Created by hujichang on 2018/11/9.
 */

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hujichang
 * @ClassName: GlobalExceptionHandler
 * @Description: 全局异常捕获
 * @date @create 2018年11月09 10:00
 */
@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
//    public String defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex){
//        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
//        System.out.println("=====================全局异常信息捕获=======================");
//
//        return "errorHandler";
//    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public JSONObject exceptionHandler(Exception ex){
        JSONObject json = new JSONObject();
        json.put("code","0");
        json.put("message","ExceptionHandler:"+ex.getMessage());
        //发生异常进行日志记录，写入数据库或者其他处理，此处省略
        return json;
    }
}