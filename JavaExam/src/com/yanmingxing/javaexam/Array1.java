package com.yanmingxing.javaexam;
/* 
 * ��������
 * ����һ��ֵ����max��min
 * ����for�����Ƚ�min�Լ�max�����a[i]�Ĵ�С�����������ٸ�ֵ
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
		System.out.println("���ֵ��" + max1);
		System.out.println("��Сֵ��" + min1);
		System.out.println("ƽ��ֵ��" + avg1);
	}

}
