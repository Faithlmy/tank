package com.lmy4.www;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	//	int arr1[] = {3, -8, 9, 89, 0, 4};
		

	
	    int len = 100000000;
		int arr1[] = new int[len];
		for(int i = 0; i<len; i++){
			//�������һ�� 1����10000����
			//Math.random()�����һ�� 0 - 1
			int t = (int) (Math.random()*100);
			arr1[i] = t;
		}
		
		
		
		QuickSort q = new QuickSort();
		Calendar  cal = Calendar.getInstance();
		System.out.println("����ǰ" + cal.getTime());
		q.sort(0, arr1.length - 1, arr1);
		cal = Calendar.getInstance();
		System.out.println("�����" + cal.getTime());
		
		
		
		
		/*
		Insert is = new Insert();
		is.sort(arr1);
		*/
		

		
		
/*		//����һ��Bubble��
		Bubble bubble = new Bubble();
		Calendar  cal = Calendar.getInstance();
		System.out.println("����ǰ" + cal.getTime());
		//ð�����򷨵�ʱ�����
		bubble.sort(arr1);
		cal = Calendar.getInstance();
		System.out.println("�����" + cal.getTime());
		
*/

		
	/*	Select select = new Select();
		//������ǰ��ӡʱ��
		Calendar  cal = Calendar.getInstance();
		System.out.println("����ǰ" + cal.getTime());
		//ѡ�����򷨵�ʱ�����
		select.sort(arr1);
		cal = Calendar.getInstance();
		System.out.println("�����" + cal.getTime());
		*/
		
	/*	for(int i = 0; i<arr1.length; i++){
			System.out.print(arr1[i] + "  ");
		}
		*/

	}

}

//��������
class QuickSort{
	public void sort(int left , int right , int [] array){
		int l = left;
		int r = right;
		int pivot = array[(left + right)/2];
		int temp = 0;
		while (l < r){
			while(array[l]< pivot)  l++;
			while(array[r]> pivot)  r--;
			
			if(l>=r) break;
			temp = array[l];
			array[l] = array[r];
			array[r] = temp;
			
			if(array[l] == pivot)  --r;
			if(array[r] == pivot)  ++l;
		}
		
		if(l == r){
			l++;
			r--;
		}
		if(left < r)  sort(left , r , array);
		if(right> l)  sort(l, right, array);
		
	}
}

//����ʽ����
class Insert{
	public void sort (int arr[]){
		for(int i = 1;i < arr.length;i++){
			int insertVal = arr[i];
			//insertVal  ׼����ǰһ�����Ƚ�
			int index = i - 1;
			while(index >=0 && insertVal < arr[index]){
				//��arr[index]����ƶ�
				arr[index + 1] = arr[index];
				//��index��ǰ�ƶ�
				index--;
			}
			//��insertVal�����ʵ�λ��
			arr[index+1] = insertVal;
		}
	}
}






//ð������
class Bubble{
	public void sort(int arr[]){
		int temp = 0;
		//������򣬾����߼���
		for(int i = 0; i<arr.length; i++){
			//�ڲ�ѭ������ʼ�Ƚϣ�����ǰһ���Ⱥ�һ�����򽻻�
			for(int j = 0;j<arr.length -1 -i; j++){
				//�Ѿ��źõľͲ���Ҫ�ٲ������򣬹�Ҫ��i
				if(arr[j] > arr[j+1]){
					//��λ
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
				}
			}
		}
	}
}

//ѡ������
class Select{
	public void sort (int arr[]){
		//����Ϊ��һ����������С��
		int temp = 0;
		for(int j = 0; j<arr.length -1; j++){
			int min = arr[j];
			//��¼��С�±�
			int minIndex = j;
			for(int k = j+1; k<arr.length;k++){
				if(min>arr[k]){
					//�޸���С
					min = arr[k];
					minIndex = k;
				}
			}
			//���˳�forѭ����ʱ�� �� ���ҵ���С����
			temp = arr[j];
			arr[j] =arr[minIndex];
			arr[minIndex] = temp;
		}

	}
}






