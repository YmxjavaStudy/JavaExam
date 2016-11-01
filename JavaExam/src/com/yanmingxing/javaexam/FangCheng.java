package com.yanmingxing.javaexam;

/*
 * 给a,b,c定义参数
 * 考虑一元二次方程无解的几种情况
 * 考虑方程一根和两根的情况
 * */
public class FangCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double m = b * b - 4 * a * c;
		double n = 2 * a;
		if (a == 0) {                   // a=0时
			if (b == 0) {              // a=0,b=0时
				System.out.println("方程式无解");
			} else {                  // a=0,b!=0时
				System.out.println("一元一次方程解的情况：" + (-c / b));
			}
		} else {
			if (m == 0) {              // b*b-4*a*c=0时
				System.out.println("方程有一个根:");
				System.out.println("二元一次方程一个根的情况：" + (-b / n));
			} else if (m > 0) {        // b*b-4*a*c>0时
				System.out.println("方程有两个根：");
				double z = Math.sqrt(m);
				System.out.println((-b + z) / n);
				System.out.println((-b - z) / n);
			} else {                  // b*b-4*a*c<0时
				System.out.println("方程无解！");
			}
		}
	}

}
