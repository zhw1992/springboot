package com.company.springboot.response;

/**
 * Created by zhanghongwei on 2018/4/7.
 */
public class BaseResponseVO<T> {

    /**
     * 结果
     */
    private Integer result;

    /**
     * 状态码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 返回内容
     */
    private T t;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
