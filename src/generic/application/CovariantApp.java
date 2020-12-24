package generic.application;

import generic.MyData;

public class CovariantApp {

	public static void main(String[] args) {
		//Covariant boleh ambil data tapi tidak boleh update data (dari child)
		MyData<String> stringMyData = new MyData<String>("Randy");
		process(stringMyData);
		
		MyData<? extends Object> myData = stringMyData;
		System.out.println(myData.getData());
	}
	
	public static void process(MyData<? extends Object> myData) {
		System.out.println(myData.getData());
		
//		myData.setData(1); //Tidak boleh karena berbahaya
	}

}
