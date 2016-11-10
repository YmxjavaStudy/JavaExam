package com.yanmingxing.javaexam;

public class NewText<T extends Number> {
	T[] nums;

	NewText(T[] o) {
		nums = o;
	}

	double average() {
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i].doubleValue();

		}
		return sum / nums.length;

	}

	boolean sameAvg(NewText<?> ob) {
		if (average() == ob.average())
			return true;
		return false;
	}
}
