package com.github.alexscari.testspring.common.exception;

/**
 * @author wusd
 */
public class BusinessErrorCode extends ErrorCode {

    public BusinessErrorCode(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public static final ErrorCode BUSINESS_EXPECTION = new BusinessErrorCode("BUS00001", "通用业务异常");

    public static final ErrorCode PARAM_MUST_NOT_NULL = new BusinessErrorCode("BUS00002", "{0}参数不能为空");
}
