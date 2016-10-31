package com.lmy1.www;
/*
 * 方法的覆盖
 * */
public class Demo1 
{
	public static void main(String[] args) 
	{
		Abc m = new Abc();
		System.out.println(m.getMax(5.9f, 9));
		
		
		Cat cat1 = new Cat();
		cat1.cry();
		
		Dog dog1  = new Dog();
		dog1.cry();
		
		Animal a = new Animal();
		a.cry();
	}
}
class Abc
{
	public int getMax(int i, int j)
	{
		return (i>j) ? i : j;
	}
	
	public double getMax(double a, double b)
	{
		return (a>b) ? a : b;
	}
}


class Animal
{
	int age;
	String name;
	
	public void cry()
	{
		System.out.println("不知道则么样叫");	
	}
}

class Cat extends Animal
{
	public void cry()
	{
		System.out.println("猫叫");	
	}	
}

class Dog extends Animal
{
	public void cry()
	{
		System.out.println("狗叫");	
	}	
}