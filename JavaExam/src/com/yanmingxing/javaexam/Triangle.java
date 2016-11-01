package com.yanmingxing.javaexam;

import java.util.*;

public class Triangle {
	Scanner input = new Scanner(System.in);
	int row = input.nextInt();

	public void triangle1() {
		System.out.println("打印正的等腰三角形");
		if (row < 2) {
			System.out.println("打印三角形需输入大于等于2的数值！");
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
		System.out.println("打印倒的等腰三角形");
		if (row < 2) {
			System.out.println("打印三角形需输入大于等于2的数值！");
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
			System.out.println("打印空白等腰三角形输入数值需大于2！");
		} else {
			System.out.println("打印正的空白心等腰三角形");
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
			System.out.println("打印空白等腰三角形输入数值需大于2！");
		} else {
			System.out.println("打印倒的空白等腰三角形");
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

		System.out.println("请输入大小：");

		Triangle p1 = new Triangle();
		p1.triangle1();
		p1.triangle2();
		p1.triangle3();
		p1.triangle4();
	}

}
