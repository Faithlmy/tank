/*
 * ��ί���
 * */

package com.lmy4.www;

import java.io.*;

public class Demo10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Judge ju = new Judge();
		System.out.println("���յ÷���"+ ju.lastFen());
		System.out.println("���Ĳ�����" + (ju.getExcelent() + 1));
		
	}

}
class Judge{
	//����һ�����8����������
	float fens[] = null;
	int size = 3;
	//���캯��
	public Judge(){
		fens = new float[size];
		//��ʼ��
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

			try {
				for(int i = 0; i<fens.length; i++){
					System.out.println("�������" + (i+1) +"���еĳɼ�");
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
	
	//�õ������ί
	public int  getExcelent()
	{
		float lastFen = this.lastFen();
		//����Ϊ��һ����ί���
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
	
	
	//�õ��˶�Ա�����÷�
	public float lastFen(){


		//3���õ����÷�
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
	//2��ȥ����߷�
	public int getHigFen(){
		//��Ϊ��һ���������
		float maxFen = fens[0];
		int maxIndex = 0;
		for(int i = 0 ; i<fens.length; i++ ){
			//�Ƚ�
			if(maxFen < fens[i]){
				//�޸���ͷ�
				maxFen = fens[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	
	
	//1��ȥ����ͷ�
	public int getLowFen(){
		//��Ϊ��һ���������
		float minFen = fens[0];
		int minIndex = 0;
		for(int i = 0 ; i<fens.length; i++ ){
			//�Ƚ�
			if(minFen > fens[i]){
				//�޸���ͷ�
				minFen = fens[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
