package com.lmy2.www;
/*
 * Author:lmy
 * Time:02/08/16
 * Topical: interface
 * */
public class Demo2 {
	public static void main(String []  args){
		Computer computer = new Computer();
		Camera camear1 = new Camera();
		Phone phone1 = new Phone();
		computer.useUsb(camear1);
		computer.useUsb(phone1);
	}

}


//Usb�ӿ�
interface Usb{
	int a = 1;
	public void start();
	public void stop();
}

interface KK{
	public void cry();
}

//��д������࣬��ʵ��Usb�ӿ�
//��һ����ʵ����һ���ӿڣ���Ҫ������������ӿڵ����з���ȫ��ʵ�֣��ͳ�����һ��
class Camera implements Usb , KK{
	public void start(){
		System.out.println("�������ʼ");
	}
	public void stop (){
		System.out.println("�����ֹͣ");
	}	
	public void cry(){};
}

//�ֻ���
class Phone implements Usb{
	public void start(){
		System.out.println("�ֻ�����ʼ");
	}
	public void stop (){
		System.out.println("�ֻ���ֹͣ");
	}	
}

//�����
class Computer{
	//��ʼʹ��usb�ӿ�
	public void useUsb(Usb  usb){
		usb.start();
		usb.stop();
	}
}


//�ӿڼ̳б�Ľӿ�
class Base{
	
}
	
