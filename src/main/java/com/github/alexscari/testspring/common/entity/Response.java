package com.github.alexscari.testspring.common.entity;

import com.github.alexscari.testspring.enums.ResponseEnum;

/**
 * @author wusd
 */
public class Response<T> {

    private String code;

    private String message;

    private T data;

    public Response(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> succeed() {
        return new Response<>(ResponseEnum.SUCCESSD.getCode(), ResponseEnum.SUCCESSD.getMsg(), null);
    }

    public static <T> Response<T> succeed(T data) {
        return new Response<>(ResponseEnum.SUCCESSD.getCode(), ResponseEnum.SUCCESSD.getMsg(), data);
    }

    public static <T> Response<T> failed() {
        return new Response<>(ResponseEnum.INTERNAL_ERROR.getCode(), ResponseEnum.INTERNAL_ERROR.getMsg(), null);
    }

    public static <T> Response<T> failed(String code, String message) {
        return new Response<>(code, message, null);
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

}
