/*
 * ���ͣ�
 * */

package com.lmy4.www;

import java.util.*;

public class Demo7 {
	public static void main(String[] args) {
		ArrayList<Dog> ar = new ArrayList<Dog>();
		
		//����һֻ��
		Dog dog1 = new Dog();
		//�ŵ�������
		ar.add(dog1);
		//ȡ��
		//Dog temp = (Dog)ar.get(0);
		
		Dog c =  ar.get(0);
		
	}
}

class Cat{
	
	private String col;
	private int age;
	

	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}


class Dog{
	
	
	private String name;
	private int age;
	
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

	
}