///*
// * Author:lmy
// * Time:03/08/16
// * topic:java�ļ�����  ArrayList
// * 
// * */
//
//package com.lmy4.www;
//
//import java.util.*;
//
//
//public class Demo4 {
//	public static void main(String[] args) {
//		//Clerk clerk[] = new Clerk[4];
//		
//		//����ArrayList����
//		ArrayList a1 = new ArrayList();
//		System.out.println("al�Ĵ�СΪ��" + a1.size());
//		//��al�м������ݣ�������object��
//		//����һ��ְԱ
//		Clerk c1 = new Clerk("�ɽ�", 50, 1000);
//		
//		Clerk c2 = new Clerk("�ֳ�", 55, 4000);
//		
//		Clerk c3 = new Clerk("����", 45, 7000);
//		//��c1���뵽a1��
//		a1.add(c1);
//		a1.add(c2);
//		a1.add(c3);
//		a1.add(c1);
//	//	System.out.println("al�Ĵ�СΪ��" + a1.size());
//	/*	
//		//��η���a1�е�����
//		//���ʵ�һ������
//		Clerk temp =(Clerk)a1.get(0);
//		System.out.println("��һ�����֣�" + temp.getName());
//		*/
//		
//		//����a1�������˵�����
//		for(int i = 0; i<a1.size(); i++){
//			Clerk temp = (Clerk)a1.get(i);
//			System.out.println("�����ǣ� " + temp.getName());
//		}
//		System.out.println();
//		
//		//���ɾ��Ԫ��
//		a1.remove(1);
//		
//		for(int i = 0; i<a1.size(); i++){
//			Clerk temp = (Clerk)a1.get(i);
//			System.out.println("�����ǣ� " + temp.getName());
//		}
//	}
//
//}
//class Clerk{
//	private String name;
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public float getSalary() {
//		return salary;
//	}
//
//	public void setSalary(float salary) {
//		this.salary = salary;
//	}
//
//	private int age;
//	private float salary;
//	
//	public Clerk( String name,  int age, float salary){
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//		
//	}
//}