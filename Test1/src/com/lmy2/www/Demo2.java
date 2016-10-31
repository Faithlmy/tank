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


//Usb接口
interface Usb{
	int a = 1;
	public void start();
	public void stop();
}

interface KK{
	public void cry();
}

//编写照相机类，并实现Usb接口
//当一个类实现了一个接口，就要求这个类把这个接口的所有方法全部实现，和抽象类一样
class Camera implements Usb , KK{
	public void start(){
		System.out.println("相机，开始");
	}
	public void stop (){
		System.out.println("相机，停止");
	}	
	public void cry(){};
}

//手机类
class Phone implements Usb{
	public void start(){
		System.out.println("手机，开始");
	}
	public void stop (){
		System.out.println("手机，停止");
	}	
}

//计算机
class Computer{
	//开始使用usb接口
	public void useUsb(Usb  usb){
		usb.start();
		usb.stop();
	}
}


//接口继承别的接口
class Base{
	
}
	
