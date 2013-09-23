package Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long now = System.currentTimeMillis();
		String s=String.format("%tR", now);
		System.out.println("s===>"+s);
		
		String s1=String.format("%tD", now);
		System.out.println("s===>"+s1);
	}

}
