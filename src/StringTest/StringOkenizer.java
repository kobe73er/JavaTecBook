package StringTest;

import java.util.StringTokenizer;

public class StringOkenizer {

	public static void StringTokenizerTest() {
		// TODO Auto-generated method stub
		String s = "This is a test!";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
	}

	public static void StringTokenizerTestA() {
		String s = "a*b*c*d";
		StringTokenizer st = new StringTokenizer(s, "*");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	public static void main(String[] args) {
		StringTokenizerTest();
		StringTokenizerTestA();

	}

}
