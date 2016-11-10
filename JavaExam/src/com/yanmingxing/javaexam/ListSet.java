package com.yanmingxing.javaexam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//对比list集合和set集合，set集合中不能包含重复对象
public class ListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=new ArrayList<>();
list.add("A");
list.add("a");
list.add("c");
list.add("C");
list.add("a");
System.out.println(list);
Set<String> list1=new HashSet<>();
list1.add("A");
list1.add("a");
list1.add("c");
list1.add("C");
list1.add("a");
System.out.println(list1);
	}

}
