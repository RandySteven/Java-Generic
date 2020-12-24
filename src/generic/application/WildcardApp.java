package generic.application;

import generic.MyData;

public class WildcardApp {

	public static void main(String[] args) {
		print(new MyData<String>("Randy"));
		print(new MyData<Boolean>(true));
		print(new MyData<Integer>(100));
	}

	public static void print(MyData<?> myData) {
		System.out.println(myData.getData());
	}
}
