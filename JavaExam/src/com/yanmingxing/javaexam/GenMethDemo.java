package com.yanmingxing.javaexam;

class GenMethDemo {

	static <T,V extends T> boolean isin(T x,V[] y){
		for(int i=0;i<y.length;i++)
			if (x.equals(y[i]))
			//if(x.equals(y[i]))
				return true;
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer nums[]={1,2,3,4,5};
if(isin(2, nums)){
	System.out.println("2 is in y");

}
if (!isin(7, nums))
	System.out.println("7 is not in num");
/*if(!isin(7, nums)){
	System.out.println("7 is not in y");
}*/
System.out.println();
String strs[] = { "one", "two", "three", "four", "five" };
if (isin("two", strs))
	System.out.println("two is in strs");
if (!isin("seven", strs))
	System.out.println("seven is not in strs");
	}

}
