package com.lmy1.www;
/*
 * Author: lmy
 * Time:01/08/16
 * topic:丢手帕问题
 *程序有问题  每次运行后CPU达到100%
 *第11讲
 *
 **/

public class Demo2 {
	public static void main(String[] args) {
		Cyclink c = new Cyclink();
		c.setLen(5);
		c.creatLink();
		c.setk(2);
		c.setM(2);
		c.show();
		c.play();
		
	}

}
class Child{
	int no;
	Child nextChild = null;
	public Child (int no){
		//给一个编号
		this.no = no;
	}
}


//环形链表
class Cyclink{
	//先定义一个指向链表第一个小孩的引用
	Child firstChild = null;
	int len = 0;
	Child temp = null;
	int k = 0;
	int m = 0;
	
	//设置M
	public void setM(int m){
		this.m = m;
	}
	
	//设置链表的大小
	public void setLen(int len){
		this.len = len ;
	}
	public void play(){
		Child temp = this.firstChild;
		//1、先找到开始数数的人
		for(int i = 1; i<k; i++){
			temp = temp.nextChild;
		}

		while(this.len != 1){
		//2、数m下
		for(int j = 0; j<m; j++){
			temp = temp.nextChild;
			
		}
		//找到要出圈的前一个小孩纸
		Child temp2 = temp ;
		while (temp.nextChild != temp){
			temp2 = temp2.nextChild;
		}
		
		//将数到m的小孩推出圈子
		temp2.nextChild = temp.nextChild;
		temp = temp.nextChild;
		this.len--;
		}
		//最后一个小孩
		System.out.println("最后一个孩子是：" + temp.no);

	}

	
	//设置从第k个人开始数
	public void setk(int k){
		this.k = k;
	}
	//初始化链表
	public void creatLink(){
		for(int i = 1;i<=len;i++ ){
			if (i == 1){
				//创建第一个小孩
				Child ch = new Child(i);
				this.firstChild = ch;
				this.temp = ch;
			}else
			{//继续创建下一个小孩
				if(i == len){//如果遇到的是最后一个小孩，让其链表指向第一个小孩子
					Child ch = new Child(i);
					temp.nextChild = ch;
					temp= ch;
					 temp.nextChild = this.firstChild;
					
				}else
				{//如果不是第一个小孩，则继续创建下一个小孩子
					Child ch = new Child(i);
					temp.nextChild = ch;
					temp = ch;
				}
			}
		}		
	}
	
	//打印环形链表
	public void show(){
		Child temp = this.firstChild ;
		do{
			System.out.print("  "+temp.no);
			temp = temp.nextChild;
		}while(temp !=this.firstChild);
	}
}

