package com.lmy1.www;
/*
 * Author: lmy
 * Time:01/08/16
 * topic:����������
 *����������  ÿ�����к�CPU�ﵽ100%
 *��11��
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
		//��һ�����
		this.no = no;
	}
}


//��������
class Cyclink{
	//�ȶ���һ��ָ�������һ��С��������
	Child firstChild = null;
	int len = 0;
	Child temp = null;
	int k = 0;
	int m = 0;
	
	//����M
	public void setM(int m){
		this.m = m;
	}
	
	//��������Ĵ�С
	public void setLen(int len){
		this.len = len ;
	}
	public void play(){
		Child temp = this.firstChild;
		//1�����ҵ���ʼ��������
		for(int i = 1; i<k; i++){
			temp = temp.nextChild;
		}

		while(this.len != 1){
		//2����m��
		for(int j = 0; j<m; j++){
			temp = temp.nextChild;
			
		}
		//�ҵ�Ҫ��Ȧ��ǰһ��С��ֽ
		Child temp2 = temp ;
		while (temp.nextChild != temp){
			temp2 = temp2.nextChild;
		}
		
		//������m��С���Ƴ�Ȧ��
		temp2.nextChild = temp.nextChild;
		temp = temp.nextChild;
		this.len--;
		}
		//���һ��С��
		System.out.println("���һ�������ǣ�" + temp.no);

	}

	
	//���ôӵ�k���˿�ʼ��
	public void setk(int k){
		this.k = k;
	}
	//��ʼ������
	public void creatLink(){
		for(int i = 1;i<=len;i++ ){
			if (i == 1){
				//������һ��С��
				Child ch = new Child(i);
				this.firstChild = ch;
				this.temp = ch;
			}else
			{//����������һ��С��
				if(i == len){//��������������һ��С������������ָ���һ��С����
					Child ch = new Child(i);
					temp.nextChild = ch;
					temp= ch;
					 temp.nextChild = this.firstChild;
					
				}else
				{//������ǵ�һ��С���������������һ��С����
					Child ch = new Child(i);
					temp.nextChild = ch;
					temp = ch;
				}
			}
		}		
	}
	
	//��ӡ��������
	public void show(){
		Child temp = this.firstChild ;
		do{
			System.out.print("  "+temp.no);
			temp = temp.nextChild;
		}while(temp !=this.firstChild);
	}
}

