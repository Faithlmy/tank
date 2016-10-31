package com.lmy3.www;


import java.io.*;


/*
 * Author: 
 * Time:
 * Topic:array
 * */
public class Demo2 {

	public static void main  (String[] args)   throws Exception {
		Dog dogs[] = new Dog[4];
		
	/*	
		//如果不加下面的new，将会出现空指针异常
		dogs[0] = new Dog();
		dogs[0].setName("花花");
		dogs[0].setWeight(9);
		*/
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i = 0; i<4; i++){
			dogs[i] = new Dog();
			
				System.out.println("请输入狗名：");
				//从控制台获取值
				String name = br.readLine();			
				dogs[i].setName(name);
				
				System.out.println("请输入狗的体重");
				String s_weight = br.readLine();
				float weight = Float.parseFloat(s_weight);
				//将名字付给对象
				dogs[i].setWeight(weight);
		}
		//计算总体重
		float allWeigth	 = 0;
		for(int i = 0; i <4; i++){
			allWeigth += dogs[i].getWeight();
		}
		//计算平均体重
		float avWeight = allWeigth / dogs.length;
		System.out.println("总体重" + allWeigth + "平均体重" + avWeight);
	}

}
class Dog{
	private String name;
	private float weight;

	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}