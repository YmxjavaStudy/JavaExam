package com.yanmingxing.javaexam;

import java.util.Scanner;

public class Triangle {
	Scanner input = new Scanner(System.in);
	 int row = input.nextInt();
	public void triangle1() {
		System.out.println("��ӡ���ĵ���������");
		if (row < 2) {
			System.out.println("��ӡ��������������ڵ���2����ֵ��");
		} else {
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= row - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 2 * i - 1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	}

	public void triangle2() {
		System.out.println("��ӡ���ĵ���������");
		if (row < 2) {
			System.out.println("��ӡ��������������ڵ���2����ֵ��");
		} else {
			for (int i = row; i > 0; i--) {
				for (int j = 1; j <= row - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i) - 1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	}

	public void triangle3() {
		if (row < 3) {
			System.out.println("��ӡ�հ׵���������������ֵ�����2��");
		} else {
			System.out.println("��ӡ���Ŀհ��ĵ���������");
			for (int i = 1; i <= row; i++) {
				for (int j = row - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i) - 1; k++) {
					if ( k == 1 || k == (2 * i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}

	}

	public void triangle4() {
		if (row < 3) {
			System.out.println("��ӡ�հ׵���������������ֵ�����2��");
		} else {
			System.out.println("��ӡ���Ŀհ׵���������");
			for (int i = row; i > 0; i--) {
				for (int j = 1; j <= row - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 2 * i - 1; k++) {
					if (i == row || k == 1 || k == (2 * i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("请输入行数：");
        
		Triangle p1 = new Triangle();
		
		p1.triangle1();
		p1.triangle2();
		p1.triangle3();
		p1.triangle4();
	}

}
