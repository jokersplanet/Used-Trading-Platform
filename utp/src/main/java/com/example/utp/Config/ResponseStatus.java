package com.example.utp.Config;

public enum ResponseStatus {

    OK(200,"OK"),

    CREATED(201,"SUCCESS"),

    NO_CONTENT(204,"DELETE"),

    ERROR(400,"ERROR"),

    NEED_LOGIN(401,"NEED LOGIN"),

    FORBIDDEN(403,"PERMISSION DENIED"),

    NOT_FOUND(404,"NOT FOUND"),

    SERVER_ERROR(500,"INTERNAL SERVER ERROR");


    private final int code;
    private final String desc;


    ResponseStatus(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getStatus(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}
