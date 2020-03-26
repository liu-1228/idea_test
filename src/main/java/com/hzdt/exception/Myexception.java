package com.hzdt.exception;

public class Myexception extends Exception {
    //无参构造方法
    public Myexception(){

        super();
    }

    //有参的构造方法
    public Myexception(String message){
        super(message);

    }

    // 用指定的详细信息和原因构造一个新的异常
    public Myexception(String message, Throwable cause){

        super(message,cause);
    }







}
