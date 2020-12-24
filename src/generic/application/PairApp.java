package generic.application;

import generic.Pair;

public class PairApp {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("Randy", 20);
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
	}
}
