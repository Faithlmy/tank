package com.lmy2.www;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Fish{
	public void swimming();
}
interface Bird{
	public void fly();
}

class Monkey{
	int name;
	public void jump(){
		System.out.println("跳");
	}

}

class Lmonkey extends Monkey  implements Fish, Bird{

	public void swimming() {
		// TODO Auto-generated method stub
		
	}


	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

//final 的使用
//final修饰表示不能被修改
class Aaa{
	final double b = 3.14;
	 public void sedMes(){
		System.out.println("方法");
	}
}
class Bbb extends Aaa{
	public void sedMes(){
		System.out.println("经济");
	}
}



