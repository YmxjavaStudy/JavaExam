package com.yanmingxing.javaexam;

/*
 * ��a,b,c�������
 * ����һԪ���η����޽�ļ������
 * ���Ƿ���һ�������������
 * */
public class FangCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double m = b * b - 4 * a * c;
		double n = 2 * a;
		if (a == 0) {                   // a=0ʱ
			if (b == 0) {              // a=0,b=0ʱ
				System.out.println("����ʽ�޽�");
			} else {                  // a=0,b!=0ʱ
				System.out.println("һԪһ�η��̽�������" + (-c / b));
			}
		} else {
			if (m == 0) {              // b*b-4*a*c=0ʱ
				System.out.println("������һ����:");
				System.out.println("��Ԫһ�η���һ�����������" + (-b / n));
			} else if (m > 0) {        // b*b-4*a*c>0ʱ
				System.out.println("��������������");
				double z = Math.sqrt(m);
				System.out.println((-b + z) / n);
				System.out.println((-b - z) / n);
			} else {                  // b*b-4*a*c<0ʱ
				System.out.println("�����޽⣡");
			}
		}
	}

}
