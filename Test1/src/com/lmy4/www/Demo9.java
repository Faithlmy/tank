/*
 * �ļ��쳣
 * */

package com.lmy4.www;

import java.io.*;
import java.net.*;

public class Demo9 {
	public static void main(String[] args) {
		
		
		FileReader fr = null;
		//������쳣:���ļ��쳣
		try {
			//�ڳ����쳣�ĵط���ִֹ�У�Ȼ�����Catch���
			//����ж��catch������ƥ�� �쳣�Ǹ�catch
			 fr = new FileReader("d:\\aa.text");
		} catch (Exception e) {
			//���쳣��Ϣ���
			e.printStackTrace();
		}finally{
			//�����䣬������û���쳣������ִ��
			//һ��˵������Ҫ�رյ���Դ���ļ������ӣ��ڴ档������
		}

		
		//�˿��쳣  
		//Socket s = new Socket("192.168.1.34",78);
		
		//�����쳣
		int a = 4/0;
		//����Խ��
	}

}
