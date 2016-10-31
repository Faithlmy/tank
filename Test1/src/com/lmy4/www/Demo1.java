package com.lmy4.www;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	//	int arr1[] = {3, -8, 9, 89, 0, 4};
		

	
	    int len = 100000000;
		int arr1[] = new int[len];
		for(int i = 0; i<len; i++){
			//随机产生一个 1——10000的数
			//Math.random()会产生一个 0 - 1
			int t = (int) (Math.random()*100);
			arr1[i] = t;
		}
		
		
		
		QuickSort q = new QuickSort();
		Calendar  cal = Calendar.getInstance();
		System.out.println("排序前" + cal.getTime());
		q.sort(0, arr1.length - 1, arr1);
		cal = Calendar.getInstance();
		System.out.println("排序后" + cal.getTime());
		
		
		
		
		/*
		Insert is = new Insert();
		is.sort(arr1);
		*/
		

		
		
/*		//创建一个Bubble类
		Bubble bubble = new Bubble();
		Calendar  cal = Calendar.getInstance();
		System.out.println("排序前" + cal.getTime());
		//冒泡排序法的时间测试
		bubble.sort(arr1);
		cal = Calendar.getInstance();
		System.out.println("排序后" + cal.getTime());
		
*/

		
	/*	Select select = new Select();
		//在排序前打印时间
		Calendar  cal = Calendar.getInstance();
		System.out.println("排序前" + cal.getTime());
		//选择排序法的时间测试
		select.sort(arr1);
		cal = Calendar.getInstance();
		System.out.println("排序后" + cal.getTime());
		*/
		
	/*	for(int i = 0; i<arr1.length; i++){
			System.out.print(arr1[i] + "  ");
		}
		*/

	}

}

//快速排序
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

//插入式排序
class Insert{
	public void sort (int arr[]){
		for(int i = 1;i < arr.length;i++){
			int insertVal = arr[i];
			//insertVal  准备和前一个数比较
			int index = i - 1;
			while(index >=0 && insertVal < arr[index]){
				//把arr[index]向后移动
				arr[index + 1] = arr[index];
				//让index向前移动
				index--;
			}
			//将insertVal插入适当位置
			arr[index+1] = insertVal;
		}
	}
}






//冒泡排序
class Bubble{
	public void sort(int arr[]){
		int temp = 0;
		//外层排序，决定走几趟
		for(int i = 0; i<arr.length; i++){
			//内层循环，开始比较，发现前一个比后一个大，则交换
			for(int j = 0;j<arr.length -1 -i; j++){
				//已经排好的就不需要再参与排序，故要减i
				if(arr[j] > arr[j+1]){
					//换位
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
				}
			}
		}
	}
}

//选择排序
class Select{
	public void sort (int arr[]){
		//我认为第一个数就是最小的
		int temp = 0;
		for(int j = 0; j<arr.length -1; j++){
			int min = arr[j];
			//记录最小下标
			int minIndex = j;
			for(int k = j+1; k<arr.length;k++){
				if(min>arr[k]){
					//修改最小
					min = arr[k];
					minIndex = k;
				}
			}
			//当退出for循环的时候 ， 就找到最小的数
			temp = arr[j];
			arr[j] =arr[minIndex];
			arr[minIndex] = temp;
		}

	}
}






