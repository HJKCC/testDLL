package com.dll.util.security;

public class RSAEncryptUtil{
	static{
		System.loadLibrary("javaCallcpp");
		System.out.println(System.getProperty("java.library.path"));
	}
	
	public native String DLL_RSA_GETPUBLICKEY(String content,String publicKey);
	public native String DLL_HMAC(String random,String pass);
	
	public static void main(String args[]){
		RSAEncryptUtil rsa = new RSAEncryptUtil();
		String str = rsa.DLL_RSA_GETPUBLICKEY("hello", "DB893A17EAAB66202D511551626F3BE32078653A7A16C0A33D18F3D1BCE80CF6DA06AF742BB1C04B107BB5B95AF5292A94D22233C3FD9BF3E2183BFECA564EE6569A151A4E9DE1944D400CCD5990FFA8B8061642EC5368CCA20F6A1CD77CF862C39ABA44F59F6134D63F13E248DAEFDBF86D7672F1C1C15C2BFC15238F26CB5F");
//		String str = rsa.DLL_HMAC("GROySlzJX8AA9kAlZslMXd5pbbU=", "H4LJQr79optu1IelHaGZ94/OfwU=");
		System.out.print("hmac:"+str);
	}
}
