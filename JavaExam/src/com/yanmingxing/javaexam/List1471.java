package com.yanmingxing.javaexam;

import java.util.ArrayList;
import java.util.List;

public class List1471 {

	public static void main(String[] args) {
		// 定义一个list集合
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			// 将1-100加入list集合
			list.add(i);

		}
		System.out.println(list);
		// 移除索引位置为10的数
		list.remove(10);
		System.out.println(list);
	}

}
