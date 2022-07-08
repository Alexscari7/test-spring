package com.github.alexscari.testspring.aop;

import com.github.alexscari.testspring.common.exception.BusinessException;
import com.github.alexscari.testspring.common.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author wusd
 */
@Slf4j
@RestControllerAdvice
public class HttpExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Response<Void> handleException(Exception e) {
        log.error("后台服务异常", e);
        return Response.failed();
    }

    @ExceptionHandler(BusinessException.class)
    public Response<Void> handleBusinessException(BusinessException e) {
        log.error("业务异常, 异常码: {}, 异常信息: {}", e.getErrorCode(), e.getErrorMsg(), e);
        return Response.failed(e.getErrorCode(), e.getErrorMsg());
    }
}
