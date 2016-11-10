package com.yanmingxing.javaexam;

import java.util.Map;
import java.util.TreeMap;

public class Map1473 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map=new TreeMap<String,String>();
Emp emp=new Emp("012", "赵");
Emp emp1=new Emp("013", "钱");
Emp emp2=new Emp("014", "孙");
Emp emp3=new Emp("015", "李");
Emp emp4=new Emp("016", "周");
map.put(emp.getId(), emp.getName());
map.put(emp1.getId(), emp1.getName());
map.put(emp2.getId(), emp2.getName());
map.put(emp3.getId(), emp3.getName());
map.put(emp4.getId(), emp4.getName());
System.out.println(map);
map.remove("015");
for (String string : map.keySet()) {
	System.out.println(map.get(string));}}}
	


