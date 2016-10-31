package com.lmy4.www;
/*
 * Author:lmy
 * Time:03/08/16
 * topic: LinkedList
 * */
import java.util.*;

public class Demo6 {

	public static void main(String[] args) {
		
	/*	
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		Emp emp1 = new Emp("sa01", "aa", 1.2f);
		Emp emp2 = new Emp("sa02", "bb", 13.2f);
		//表示加在链表的最前面
		ll.addFirst(emp1);
		ll.addFirst(emp2);
		
		for(int i = 0; i< ll.size(); i++){
			System.out.println(((Emp)ll.get(i)).getName());
		}
	}
	*/
		
	/*	Vector vv = new Vector();
		Emp emp1 = new Emp("sa01", "aa", 1.2f);
		vv.add(emp1);
		
		for(int i = 0; i< vv.size(); i++){
			 
				Emp emp = (Emp)vv.get(i);
			}
			*/
	
		/*
		HashMap hm = new HashMap();
		Emp emp1 = new Emp("sa01", "aa", 1.2f);
		Emp emp2 = new Emp("sa02", "bb", 18.2f);
		Emp emp3 = new Emp("sa03", "cc", 145.2f);
		//将emp放入hm
		hm.put("sa01", emp1);
		hm.put("sa02", emp2);
		hm.put("sa03", emp3);//不允许key值重复，如果重复，后面将覆盖前面的值
		
		//查找sa02
		if(hm.containsKey("sa02")){
			System.out.println("有该员工");
			
			//如何取出,键----值
			
			Emp emp = (Emp)hm.get("sa02");
			System.out.println("名字  :  "+ emp.getName());
					
			
		}
		else 
		{
			System.out.println("无改员工");
		}
		
		//遍历HashMap中所有的key和Value
		Iterator it = hm.keySet().iterator();
		//hasNext返回一个布尔型
		while(it.hasNext()){
			//取出key
			String key = it.next().toString();
			Emp emp = (Emp)hm.get(key);
			System.out.println("名字" + emp.getName());
			System.out.println("薪水" + emp.getSalary());
			
		}
		*/
		
		
		Hashtable ht = new Hashtable();
		
		
	}

}
	
	
	
	
	
	
	
	
