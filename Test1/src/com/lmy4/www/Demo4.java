///*
// * Author:lmy
// * Time:03/08/16
// * topic:java的集合类  ArrayList
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
//		//定义ArrayList对象
//		ArrayList a1 = new ArrayList();
//		System.out.println("al的大小为：" + a1.size());
//		//向al中加入数据（类型是object）
//		//创建一个职员
//		Clerk c1 = new Clerk("松江", 50, 1000);
//		
//		Clerk c2 = new Clerk("林冲", 55, 4000);
//		
//		Clerk c3 = new Clerk("奖励", 45, 7000);
//		//将c1加入到a1中
//		a1.add(c1);
//		a1.add(c2);
//		a1.add(c3);
//		a1.add(c1);
//	//	System.out.println("al的大小为：" + a1.size());
//	/*	
//		//如何访问a1中的数据
//		//访问第一个对象
//		Clerk temp =(Clerk)a1.get(0);
//		System.out.println("第一人名字：" + temp.getName());
//		*/
//		
//		//访问a1中所有人的类型
//		for(int i = 0; i<a1.size(); i++){
//			Clerk temp = (Clerk)a1.get(i);
//			System.out.println("名字是： " + temp.getName());
//		}
//		System.out.println();
//		
//		//如何删除元素
//		a1.remove(1);
//		
//		for(int i = 0; i<a1.size(); i++){
//			Clerk temp = (Clerk)a1.get(i);
//			System.out.println("名字是： " + temp.getName());
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