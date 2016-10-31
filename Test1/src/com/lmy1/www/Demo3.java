package com.lmy1.www;
/*
 * Author:lmy
 * Time:01/08/16
 *   主题：多态
 * */

public class Demo3 {
	public static void main(String[] args) {
		/*
		C_at c1 = new C_at();
		c1.cry();
		D_og d1 = new D_og();
		d1.cry();
		*/
/*		
		//多态的实例
		A_nimal an = new C_at();
		an.cry();
		an.eat();
		an = new D_og();
		an.cry();
		an.eat();
		*/
		
		Master m = new Master();
		m.feed(new D_og(), new Bone());
	}
}

//主人类
class  Master{
	public void feed (A_nimal an, Food f){
		an.eat();
		f.showName();
	}
}


//食物类
class Food{
	String name;
	public void showName(){
		
	}
}
//鱼类
class Fish extends Food{
	public void shouName(){
		System.out.println("我是鱼肉");
	}
}
//骨头类
class Bone extends Food{
	public void showName(){
		System.out.println("我是骨头");
	}
}


//动物类
class A_nimal{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//动物会叫
	public void cry(){
		System.out.println("不会叫");
	}
	public void eat(){
		System.out.println("不知道吃什么");
	}
}
class C_at extends A_nimal{
	public void cry(){
		System.out.println("猫叫");
	}
	public void eat(){
		System.out.println("鱼");
	}
}
class D_og extends A_nimal{
	public void cry(){
		System.out.println("狗叫");
	}
	public void eat(){
		System.out.println("骨头");
	}
}










