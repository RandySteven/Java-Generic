package generic.application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {

	public static void main(String[] args) {
		String names [] = {"Randy", "Felix", "Michael"};
		Integer scores [] = {10, 10, 10};
		System.out.println(ArrayHelper.count(names));
		System.out.println(ArrayHelper.count(scores));
	}

}
