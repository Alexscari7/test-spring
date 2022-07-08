package com.github.alexscari.testspring.common.exception;

import org.springframework.util.Assert;

import java.text.MessageFormat;

/**
 * @author wusd
 */
public class BusinessException extends RuntimeException {

    private final String errorCode;

    private final String errorMsg;

    public BusinessException(ErrorCode errorCode) {
        this.errorCode = errorCode.getErrorCode();
        this.errorMsg = errorCode.getErrorMsg();
    }

    public BusinessException(ErrorCode errorCode, Object... args) {
        this.errorCode = errorCode.getErrorCode();
        this.errorMsg = formatMsg(errorCode.getErrorMsg(), args);
    }

    public BusinessException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BusinessException(String errorCode, String errorMsg, Object... args) {
        this.errorCode = errorCode;
        this.errorMsg = formatMsg(errorMsg, args);
    }

    public BusinessException(String errorCode, String errorMsg, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public String getMessage() {
        return "[" + errorCode + "]" + errorMsg;
    }

    private String formatMsg(String errorMsg, Object... args) {
        Assert.notNull(args, "args must not be null");
        return MessageFormat.format(errorMsg, args);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
