/*
 * ����2
 * */

package com.lmy4.www;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Bird> gen1 = new Gen<Bird>(new Bird());
		gen1.showTypeName();
	}

}

//����һ������
class Bird{
	public void test1(){
		System.out.println("AbC");
	}
	public void cont (int a, int b){
		System.out.println( a+ b);
	}
}


class Gen<T>{
	private T o;
	//���캯��
	public Gen ( T a){
		o = a;
	}
	//�õ�T�ķ�������
	public void showTypeName(){
		System.out.println("������" + o.getClass().getName());
	}
}
