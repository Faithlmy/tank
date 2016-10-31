/*
 * 泛型2
 * */

package com.lmy4.www;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Bird> gen1 = new Gen<Bird>(new Bird());
		gen1.showTypeName();
	}

}

//定义一个鸟类
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
	//构造函数
	public Gen ( T a){
		o = a;
	}
	//得到T的泛型名称
	public void showTypeName(){
		System.out.println("类型是" + o.getClass().getName());
	}
}
