package StringTest;

import java.util.ArrayList;
import java.util.List;

public class StringTest {
	private static List<String> list = new ArrayList<String>();

	public static String join(List<String> words) {
		String sentence = "";
		for (String word : words)
			sentence += word;
		return sentence;
	}

	public static String joinByStringBuilder(List<String> words) {
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word);
		}
		return sb.toString();
	}
	
	public static String joinByStringBuffer(List<String> words) {
		StringBuffer sb = new StringBuffer();
		for (String word : words) {
			sb.append(word);
		}
		return sb.toString();
	}

	public static void initalList() {
		for (int i = 0; i < 100000; i++) {
			list.add("a");
		}
	}

	public static void StringTimeConsume() {
		long startTime = System.currentTimeMillis();
		join(list);
		long endTime = System.currentTimeMillis();
		System.out.println("String Time consume==>" + (endTime - startTime));
	}

	public static void StringBuilderTimeConsume() {

		long startTime = System.currentTimeMillis();
		joinByStringBuilder(list);
		long endTime = System.currentTimeMillis();
		System.out.println("StringBuilder Time consume==>" + (endTime - startTime));
	}
	
	public static void StringBufferTimeConsume() {

		long startTime = System.currentTimeMillis();
		joinByStringBuffer(list);
		long endTime = System.currentTimeMillis();
		System.out.println("StringBuffer Time consume==>" + (endTime - startTime));
	}

	public static void main(String args[]) {
		initalList();
		StringTimeConsume();
		StringBuilderTimeConsume();
		StringBufferTimeConsume();

	}
}
