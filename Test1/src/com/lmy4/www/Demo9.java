/*
 * 文件异常
 * */

package com.lmy4.www;

import java.io.*;
import java.net.*;

public class Demo9 {
	public static void main(String[] args) {
		
		
		FileReader fr = null;
		//检查性异常:打开文件异常
		try {
			//在出现异常的地方终止执行，然后进入Catch语句
			//如果有多个catch，进入匹配 异常那个catch
			 fr = new FileReader("d:\\aa.text");
		} catch (Exception e) {
			//把异常信息输出
			e.printStackTrace();
		}finally{
			//这个语句，不管有没有异常，都会执行
			//一般说，把需要关闭的资源【文件，连接，内存。。。】
		}

		
		//端口异常  
		//Socket s = new Socket("192.168.1.34",78);
		
		//运行异常
		int a = 4/0;
		//数组越界
	}

}
