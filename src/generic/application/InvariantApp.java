package generic.application;

import generic.MyData;

public class InvariantApp {

	public static void main(String[] args) {
		MyData<String> stringMyData = new MyData<String>("Randy");
//		Invariant
//		doIt(stringMyData); //Error
//		MyData<Object> objectMyData = stringMyData; //Error
		MyData<Object> objectMyData = new MyData<Object>(200);
//		MyData<Integer> integerMyData = objectMyData; //Error
//		doItInteger(objectMyData);
	}

	public static void doIt(MyData<Object> objectMyData) {
		
	}

	public static void doItInteger(MyData<Integer> objectMyData) {
		
	}
	
}
