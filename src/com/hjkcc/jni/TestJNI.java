package com.hjkcc.jni;

public class TestJNI {
    
    static {
    	System.loadLibrary("nativecode");
    }
    
    public static void main(String[] args) {
    	NativeInterface NativeInterface = new NativeInterface();
    	
    	NativeInterface.sayHello();
    	NativeInterface.add(1,2);
    }
}