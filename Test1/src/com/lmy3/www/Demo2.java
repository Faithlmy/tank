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
		//������������new��������ֿ�ָ���쳣
		dogs[0] = new Dog();
		dogs[0].setName("����");
		dogs[0].setWeight(9);
		*/
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i = 0; i<4; i++){
			dogs[i] = new Dog();
			
				System.out.println("�����빷����");
				//�ӿ���̨��ȡֵ
				String name = br.readLine();			
				dogs[i].setName(name);
				
				System.out.println("�����빷������");
				String s_weight = br.readLine();
				float weight = Float.parseFloat(s_weight);
				//�����ָ�������
				dogs[i].setWeight(weight);
		}
		//����������
		float allWeigth	 = 0;
		for(int i = 0; i <4; i++){
			allWeigth += dogs[i].getWeight();
		}
		//����ƽ������
		float avWeight = allWeigth / dogs.length;
		System.out.println("������" + allWeigth + "ƽ������" + avWeight);
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