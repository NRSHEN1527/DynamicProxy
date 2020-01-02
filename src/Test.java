
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("1");
		s.intern();
		String s2 = "1";
		System.out.println(s == s2);
		 
		String s3 = new String("1") + new String("1");
		s3.intern();
		String s4 = "11";
		System.out.println(s3 == s4);

		StringBuilder sb = new StringBuilder("a");
		sb.toString();
		String str1 = new String("SEU") + new String("Calvin");      
		System.out.println(str1.intern() == str1);   
		System.out.println(str1 == "SEUCalvin"); 


	}

}
