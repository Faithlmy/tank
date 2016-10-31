/*
 * 评委打分
 * */

package com.lmy4.www;

import java.io.*;

public class Demo10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Judge ju = new Judge();
		System.out.println("最终得分是"+ ju.lastFen());
		System.out.println("最差的裁判是" + (ju.getExcelent() + 1));
		
	}

}
class Judge{
	//定义一个存放8个数的数组
	float fens[] = null;
	int size = 3;
	//构造函数
	public Judge(){
		fens = new float[size];
		//初始化
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

			try {
				for(int i = 0; i<fens.length; i++){
					System.out.println("请输入第" + (i+1) +"裁判的成绩");
				fens[i] = Float.parseFloat(br.readLine());
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally {
				try {
					
					br.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}
	
	//得到最差评委
	public int  getExcelent()
	{
		float lastFen = this.lastFen();
		//我认为第一个评委最差
		int worstIndex = 0;
		float cai = Math.abs(fens[0] - lastFen);
		float tempcai = 0f;
		for(int i = 0; i<fens.length; i++)
		{
			tempcai = Math.abs(fens[i] - lastFen);
			if(cai < tempcai)
			{
				worstIndex = i;
				cai = tempcai;
			}
		}
		return worstIndex;
	}
	
	
	//得到运动员的最后得分
	public float lastFen(){


		//3、得到最后得分
		float lastFen = 0;
		float total = 0;
		int minIndex = this.getLowFen();
		int maxIndex = this.getHigFen();
		for(int i = 0; i<fens.length; i++){
			if(i!=minIndex && i!=maxIndex){
				total+=fens[i];
			}
		}
		return total/(fens.length - 2);

	}
	//2、去掉最高分
	public int getHigFen(){
		//认为第一个就是最低
		float maxFen = fens[0];
		int maxIndex = 0;
		for(int i = 0 ; i<fens.length; i++ ){
			//比较
			if(maxFen < fens[i]){
				//修改最低分
				maxFen = fens[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	
	
	//1、去掉最低分
	public int getLowFen(){
		//认为第一个就是最低
		float minFen = fens[0];
		int minIndex = 0;
		for(int i = 0 ; i<fens.length; i++ ){
			//比较
			if(minFen > fens[i]){
				//修改最低分
				minFen = fens[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
