package com.lmy4.www;

import java.util.*;
import java.io.*;



public class Demo5 {
	public static void main(String[] args)  throws Exception{
		
		
		
		//创建EmpMan对象
				EmpMan em = new EmpMan();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				//建立简易菜单
				while(true){
					System.out.println("请选择你要的操作：");
					System.out.println("1:	添加雇员");
					System.out.println("2:	查找雇员");
					System.out.println("3:	修改雇员");
					System.out.println("4:	删除雇员");
					System.out.println("5:	退出");

					String operType = br.readLine();
					
					if(operType.equals("1")){
						System.out.println("请输入编号：");
						String empNo = br.readLine();
						System.out.println("请输入名字：");
						String name = br.readLine();
						System.out.println("请输入工资：");
						float salary = Float.parseFloat(br.readLine());
						
						Emp emp  = new Emp(empNo, name, salary);
						em.addEmp(emp);
					}
					else if(operType.equals("2")){
						System.out.println("请输入编号：");
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






//雇员管理类
class EmpMan{
	public ArrayList a1 = null;
	
	//构造
	public 	 EmpMan(){
		a1 = new ArrayList();
	}
	//加入员工
	public void addEmp(Emp emp){
		a1.add(emp);
	}
	//显示员工的信息
	public void showInfo(String empNo){
		//遍历整个ArrayList
		for(int i = 0; i<a1.size(); i++){
			//取出Emp对象
			Emp emp = (Emp)a1.get(i);
			//比较编号
			if(emp.getEmpNo().equals(empNo)){
				System.out.println("找到该员工的信息为：");
				System.out.println("编号= " + empNo);//这里可以改吗？
				System.out.println("名字= " + emp.getName());
				System.out.println("工资= "+ emp.getSalary());
			}
		}
		
	}

	//修改工资
	public void updateSal(String empNo, float newSal){
		for( int i = 0; i<a1.size(); i++){
			Emp emp = (Emp)a1.get(i);
			if(emp.getEmpNo().equals(empNo)){
				//修改薪水
				emp.setSalary(newSal);
			}
		}
	}

	//删除员工
	public void delEmp(String empNo){
		for( int i = 0; i<a1.size(); i++){
			Emp emp = (Emp)a1.get(i);
			if(emp.getEmpNo().equals(empNo)){
				a1.remove(i);
			}
		}
	}
}












//员工类
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



