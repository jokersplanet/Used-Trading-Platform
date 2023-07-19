package com.example.utp.Config;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class ServerResponse<T> implements Serializable {
    private int status;
    private String msg;
    private T data;



    private ServerResponse(int status) {
        this.status = status;
    }

    private ServerResponse(String msg) {
        this.msg = msg;
    }

    private ServerResponse(T data) {
        this.data = data;
    }

    private ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(String msg,T data) {
        this.msg = msg;
        this.data = data;
    }

    private ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }




    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }


    

    public static <T> ServerResponse<T> OK() {
        return new ServerResponse<T>(ResponseStatus.OK.getStatus());
    }

    public static <T> ServerResponse<T> OK(String msg) {
        return new ServerResponse<T>(ResponseStatus.OK.getStatus(), msg);
    }

    public static <T> ServerResponse<T> OK(T data) {
        return new ServerResponse<T>(ResponseStatus.OK.getStatus(), data);
    }

    public static <T> ServerResponse<T> OK(String msg, T data) {
        return new ServerResponse<T>(ResponseStatus.OK.getStatus(), msg, data);
    }

    public static <T> ServerResponse<T> CREATED() {
        return new ServerResponse<T>(ResponseStatus.CREATED.getStatus());
    }

    public static <T> ServerResponse<T> CREATED(String msg) {
        return new ServerResponse<T>(ResponseStatus.CREATED.getStatus(), msg);
    }

    public static <T> ServerResponse<T> CREATED(T data) {
        return new ServerResponse<T>(ResponseStatus.CREATED.getStatus(), data);
    }

    public static <T> ServerResponse<T> CREATED(String msg, T data) {
        return new ServerResponse<T>(ResponseStatus.CREATED.getStatus(), msg, data);
    }


    public static <T> ServerResponse<T> NO_CONTENT() {
        return new ServerResponse<T>(ResponseStatus.NO_CONTENT.getStatus());
    }

    public static <T> ServerResponse<T> NO_CONTENT(String msg) {
        return new ServerResponse<T>(ResponseStatus.NO_CONTENT.getStatus(), msg);
    }

    public static <T> ServerResponse<T> NO_CONTENT(T data) {
        return new ServerResponse<T>(ResponseStatus.NO_CONTENT.getStatus(), data);
    }

    public static <T> ServerResponse<T> NO_CONTENT(String msg, T data) {
        return new ServerResponse<T>(ResponseStatus.NO_CONTENT.getStatus(), msg, data);
    }

    public static <T> ServerResponse<T> NEED_LOGIN() {
        return new ServerResponse<T>(ResponseStatus.NEED_LOGIN.getStatus());
    }

    public static <T> ServerResponse<T> NEED_LOGIN(String msg) {
        return new ServerResponse<T>(ResponseStatus.NEED_LOGIN.getStatus(), msg);
    }

    public static <T> ServerResponse<T> NEED_LOGIN(T data) {
        return new ServerResponse<T>(ResponseStatus.NEED_LOGIN.getStatus(), data);
    }

    public static <T> ServerResponse<T> NEED_LOGIN(String msg, T data) {
        return new ServerResponse<T>(ResponseStatus.NEED_LOGIN.getStatus(), msg, data);
    }

    public static <T> ServerResponse<T> FORBIDDEN() {
        return new ServerResponse<T>(ResponseStatus.FORBIDDEN.getStatus());
    }

    public static <T> ServerResponse<T> FORBIDDEN(String msg) {
        return new ServerResponse<T>(ResponseStatus.FORBIDDEN.getStatus(), msg);
    }

    public static <T> ServerResponse<T> FORBIDDEN(T data) {
        return new ServerResponse<T>(ResponseStatus.FORBIDDEN.getStatus(), data);
    }

    public static <T> ServerResponse<T> FORBIDDEN(String msg, T data) {
        return new ServerResponse<T>(ResponseStatus.FORBIDDEN.getStatus(), msg, data);
    }
    public static <T> ServerResponse<T> NOT_FOUND() {
        return new ServerResponse<T>(ResponseStatus.NOT_FOUND.getStatus());
    }

    public static <T> ServerResponse<T> NOT_FOUND(String msg) {
        return new ServerResponse<T>(ResponseStatus.NOT_FOUND.getStatus(), msg);
    }

    public static <T> ServerResponse<T> NOT_FOUND(T data) {
        return new ServerResponse<T>(ResponseStatus.NOT_FOUND.getStatus(), data);
    }

    public static <T> ServerResponse<T> NOT_FOUND(String msg, T data) {
        return new ServerResponse<T>(ResponseStatus.NOT_FOUND.getStatus(), msg, data);
    }
    public static <T> ServerResponse<T> SERVER_ERROR() {
        return new ServerResponse<T>(ResponseStatus.SERVER_ERROR.getStatus());
    }

    public static <T> ServerResponse<T> SERVER_ERROR(String msg) {
        return new ServerResponse<T>(ResponseStatus.SERVER_ERROR.getStatus(), msg);
    }

    public static <T> ServerResponse<T> SERVER_ERROR(T data) {
        return new ServerResponse<T>(ResponseStatus.SERVER_ERROR.getStatus(), data);
    }

    public static <T> ServerResponse<T> SERVER_ERROR(String msg, T data) {
        return new ServerResponse<T>(ResponseStatus.SERVER_ERROR.getStatus(), msg, data);
    }
}
