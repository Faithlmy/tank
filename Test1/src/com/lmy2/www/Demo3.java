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
		System.out.println("��");
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

//final ��ʹ��
//final���α�ʾ���ܱ��޸�
class Aaa{
	final double b = 3.14;
	 public void sedMes(){
		System.out.println("����");
	}
}
class Bbb extends Aaa{
	public void sedMes(){
		System.out.println("����");
	}
}



