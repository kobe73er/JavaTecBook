package StringTest;

public class StringEqualTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		String b="abc";
		String c=new String("abc");
		String d=new String("abc");
		String a1=a.intern();
		
		System.out.println(a1==a);
		System.out.println(a.contentEquals(c));
		System.out.println(d==c);
		System.out.println(a.equals(c));
	}

}
