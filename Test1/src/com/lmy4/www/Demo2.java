package com.lmy4.www;
/*
 * Author:lmy 
 * Time:02/08/16
 * topic:  ���ֲ���
 * */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,7,9,6,56,12};
		BinaryFind b = new BinaryFind();
		b.find(0, arr.length -1, 12, arr);

	}

}
class BinaryFind{
	public void find (int rIndex, int lIndex, int val,int arr[]){
		//�����ҵ��м��ֵ
		int midIndex = (rIndex + lIndex)/2;
		int midval = arr[midIndex];
		
		if(rIndex >= lIndex){
		//���Ҫ�ҵ�����midval��
		if(midIndex > val){
			//���������
			find(lIndex,midIndex -1, val,  arr);
		}
		else if(midval<val){
			//��arry�ұ���
			find(midIndex+1, rIndex, val, arr);
		}
		else if(midval == val){
			System.out.println("�ҵ��±�"+ midIndex);
		}
		
	  }
	}
  
}
