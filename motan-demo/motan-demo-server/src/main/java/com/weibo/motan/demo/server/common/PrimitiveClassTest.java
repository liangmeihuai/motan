package com.weibo.motan.demo.server.common;

/**
 * Created by tend on 2017/6/9.
 */
public class PrimitiveClassTest {
    public static void main(String[] args) {
        System.out.println("isprimitive="+Integer.class.isPrimitive());//false
        System.out.println("isprimitive="+int.class.isPrimitive());//true

        System.out.println("class Name="+Integer.class.getName());//java.lang.Integer
        System.out.println("simple Name="+Integer.class.getSimpleName());//Integer
    }

    public void testThrowException(){
        throw new IllegalStateException("interface not allow null!");
    }
}
