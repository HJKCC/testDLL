package com.hjkcc.jna;
/**
 * 什么是JNA？ 全称Java Native Access。
 * 只需要在Java接口中描述目标native library的函数与结构，JNA将自动实现Java接口到native function的映射，
 * 调用起来感觉就像在调用Java代码一样方便。
 * 使用JNA需要两个jar包，即jna-4.1.0.jar与jna-platform-4.1.0.jar。
 */


import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

/**
 *
 * @author chencheng0816@gmail.com 
 * @date 2018年5月15日 下午3:10:36
 */
public class TestJNA {
	public interface nativecode extends StdCallLibrary {
		nativecode INSTANCE = (nativecode) Native.loadLibrary("nativecode", nativecode.class);// 加载系统User32 DLL文件，也可以是C++写的DLL文件

		void sayHello();
	    void add(int a, int b);
	}

	public static void main(String[] args) throws Exception {
		nativecode.INSTANCE.sayHello();
		nativecode.INSTANCE.add(1,2);
	}
}
