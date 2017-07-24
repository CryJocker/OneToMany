package com.wleiy.otmDemo.entity;

import java.io.Serializable;

public class Result <T> implements Serializable{


    private Integer errorCode;

    private String msg;

    private T result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "errorCode=" + errorCode +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
