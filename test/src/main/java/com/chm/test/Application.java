package com.chm.test;

import com.chm.test.starter.MiniApplication;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MiniApplication.run(Application.class,args);
    }
}
