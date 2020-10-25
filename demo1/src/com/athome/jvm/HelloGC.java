package com.athome.jvm;

public class HelloGC {

    public static void main(String[] args) {
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello jvm***************");
    }
}
