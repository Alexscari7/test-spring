package com.github.alexscari.testspring.enums;

/**
 * @author wusd
 */
public enum ResponseEnum {

    SUCCESSD("200", "请求成功"),
    INTERNAL_ERROR("500", "后台服务异常");

    private final String code;

    private final String msg;

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
