package com.yanmingxing.javaexam;
/* 
 * 建立数组
 * 将第一个值赋给max和min
 * 利用for方法比较min以及max与后面a[i]的大小，满足条件再赋值
 * */

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 25, 45, 12, 18, 19, 16 };
		float max1, min1;
		double avg1 = 0;
		max1 = a[0];
		min1 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max1 = a[i];
			}
			if (min1 > a[i]) {
				min1 = a[i];
			}
		}
		avg1 =((min1 + max1) / 2);
		System.out.println("最大值：" + max1);
		System.out.println("最小值：" + min1);
		System.out.println("平均值：" + avg1);
	}

}
