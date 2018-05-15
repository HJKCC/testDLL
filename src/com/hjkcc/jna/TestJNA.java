package com.hjkcc.jna;
/**
 * ʲô��JNA�� ȫ��Java Native Access��
 * ֻ��Ҫ��Java�ӿ�������Ŀ��native library�ĺ�����ṹ��JNA���Զ�ʵ��Java�ӿڵ�native function��ӳ�䣬
 * ���������о������ڵ���Java����һ�����㡣
 * ʹ��JNA��Ҫ����jar������jna-4.1.0.jar��jna-platform-4.1.0.jar��
 */


import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

/**
 *
 * @author chencheng0816@gmail.com 
 * @date 2018��5��15�� ����3:10:36
 */
public class TestJNA {
	public interface nativecode extends StdCallLibrary {
		nativecode INSTANCE = (nativecode) Native.loadLibrary("nativecode", nativecode.class);// ����ϵͳUser32 DLL�ļ���Ҳ������C++д��DLL�ļ�

		void sayHello();
	    void add(int a, int b);
	}

	public static void main(String[] args) throws Exception {
		nativecode.INSTANCE.sayHello();
		nativecode.INSTANCE.add(1,2);
	}
}
