package CharSequence;

public class Chapter_5_String {

	public static CharSequence prefix(CharSequence s,char c){
		int numChars=s.length();
		for(int i=0;i<numChars;i++){
			if(s.charAt(i)==c)
				return s.subSequence(0, i+1);
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prefix("I am what I am", 'm'));

	}

}
