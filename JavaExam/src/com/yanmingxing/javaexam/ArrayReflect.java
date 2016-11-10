package com.yanmingxing.javaexam;

import java.lang.reflect.*;

class Test {

	public int[] is = { 1, 2, 3 };

	public String[] ss = { "A", "B", "C" };

	public void print() {

		for (int index = 0; index < is.length; index++) {
			System.out.println("is[" + index + "]=" + is[index]);
		}

		System.out.println();

		for (int index = 0; index < ss.length; index++) {
			System.out.println("ss[" + index + "]=" + ss[index]);
		}
		System.out.println();
	}

}

public class ArrayReflect {
	public static Object addArrayLength(Object array, int newLength) {
		Object newArray = null;
		Class componentType = array.getClass().getComponentType();
		newArray = Array.newInstance(componentType, newLength);
		System.arraycopy(array, 0, newArray, 0, Array.getLength(array));
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();

		test.print();

		test.is = (int[]) addArrayLength(test.is, 10);
		test.ss = (String[]) addArrayLength(test.ss, 10);

		test.print();

	}

}
