package com.testDLL;

public class Test {
    
    static {
    	System.loadLibrary("nativecode");
    }
    
    public static void main(String[] args) {
    	TestNative testNative = new TestNative();
    	
    	testNative.sayHello();
    	testNative.add(1,2);
    }
}