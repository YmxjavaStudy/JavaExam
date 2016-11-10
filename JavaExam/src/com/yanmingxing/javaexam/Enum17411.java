package com.yanmingxing.javaexam;

public class Enum17411 {

	public static void print(Enum1741 he){
		switch(he){
		case monday:
			System.out.println("Monday");
		    break;
		case tuesday:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Friday");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

print(Enum1741.tuesday);
	}

}
