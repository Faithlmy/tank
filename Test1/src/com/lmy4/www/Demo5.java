package com.lmy4.www;

import java.util.*;
import java.io.*;



public class Demo5 {
	public static void main(String[] args)  throws Exception{
		
		
		
		//����EmpMan����
				EmpMan em = new EmpMan();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				//�������ײ˵�
				while(true){
					System.out.println("��ѡ����Ҫ�Ĳ�����");
					System.out.println("1:	��ӹ�Ա");
					System.out.println("2:	���ҹ�Ա");
					System.out.println("3:	�޸Ĺ�Ա");
					System.out.println("4:	ɾ����Ա");
					System.out.println("5:	�˳�");

					String operType = br.readLine();
					
					if(operType.equals("1")){
						System.out.println("�������ţ�");
						String empNo = br.readLine();
						System.out.println("���������֣�");
						String name = br.readLine();
						System.out.println("�����빤�ʣ�");
						float salary = Float.parseFloat(br.readLine());
						
						Emp emp  = new Emp(empNo, name, salary);
						em.addEmp(emp);
					}
					else if(operType.equals("2")){
						System.out.println("�������ţ�");
						String empNo = br.readLine();
						
						em.showInfo(empNo);
					}
					else if(operType.equals("3")){
						
					}
					else if(operType.equals("4")){
						
					}
					else if(operType.endsWith("5")){
						System.out.println("exit");
						System.exit(0);
					}
				}
			}
		

		
		}






//��Ա������
class EmpMan{
	public ArrayList a1 = null;
	
	//����
	public 	 EmpMan(){
		a1 = new ArrayList();
	}
	//����Ա��
	public void addEmp(Emp emp){
		a1.add(emp);
	}
	//��ʾԱ������Ϣ
	public void showInfo(String empNo){
		//��������ArrayList
		for(int i = 0; i<a1.size(); i++){
			//ȡ��Emp����
			Emp emp = (Emp)a1.get(i);
			//�Ƚϱ��
			if(emp.getEmpNo().equals(empNo)){
				System.out.println("�ҵ���Ա������ϢΪ��");
				System.out.println("���= " + empNo);//������Ը���
				System.out.println("����= " + emp.getName());
				System.out.println("����= "+ emp.getSalary());
			}
		}
		
	}

	//�޸Ĺ���
	public void updateSal(String empNo, float newSal){
		for( int i = 0; i<a1.size(); i++){
			Emp emp = (Emp)a1.get(i);
			if(emp.getEmpNo().equals(empNo)){
				//�޸�нˮ
				emp.setSalary(newSal);
			}
		}
	}

	//ɾ��Ա��
	public void delEmp(String empNo){
		for( int i = 0; i<a1.size(); i++){
			Emp emp = (Emp)a1.get(i);
			if(emp.getEmpNo().equals(empNo)){
				a1.remove(i);
			}
		}
	}
}












//Ա����
class Emp{
	
	private String empNo;
	private String name;
	private float salary;
	
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}


	
	public Emp(String empNo, String name, float salary){
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	
}



