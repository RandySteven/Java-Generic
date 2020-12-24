package generic.application;

import generic.MyData;

public class TypeErasureApp {

	public static void main(String[] args) {
		//Problem
		MyData myData = new MyData("Randy");
		MyData<Integer> integerMyData = (MyData<Integer>) myData;
		Integer integer = integerMyData.getData();
		
	}

}
