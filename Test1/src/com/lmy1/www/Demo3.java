package com.lmy1.www;
/*
 * Author:lmy
 * Time:01/08/16
 *   ���⣺��̬
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
		//��̬��ʵ��
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

//������
class  Master{
	public void feed (A_nimal an, Food f){
		an.eat();
		f.showName();
	}
}


//ʳ����
class Food{
	String name;
	public void showName(){
		
	}
}
//����
class Fish extends Food{
	public void shouName(){
		System.out.println("��������");
	}
}
//��ͷ��
class Bone extends Food{
	public void showName(){
		System.out.println("���ǹ�ͷ");
	}
}


//������
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
	
	//������
	public void cry(){
		System.out.println("�����");
	}
	public void eat(){
		System.out.println("��֪����ʲô");
	}
}
class C_at extends A_nimal{
	public void cry(){
		System.out.println("è��");
	}
	public void eat(){
		System.out.println("��");
	}
}
class D_og extends A_nimal{
	public void cry(){
		System.out.println("����");
	}
	public void eat(){
		System.out.println("��ͷ");
	}
}










