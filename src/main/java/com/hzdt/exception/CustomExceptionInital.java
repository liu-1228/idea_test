package com.hzdt.exception;

public class CustomExceptionInital {
    public void test1() throws Myexception{

        throw new Myexception("我喝酒了" ,new Throwable("心烦"));
    }

    public void test2(){
        try {
            test1();
        } catch (Myexception e) {
            RuntimeException exception  =  new RuntimeException();
            throw  exception;
        }


    }
    public void checkLength(String str) throws Myexception{
        if(str.length()<5){
            System.out.println("okok");
        }else{
            throw  new Myexception("长度太长");
        }
    }

    public static void main(String[] args) throws Myexception {
        CustomExceptionInital object =  new  CustomExceptionInital();
        //object.test1();

        String str="asds";
        object.checkLength(str);

    }
}
