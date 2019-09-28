package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double a, double b) throws IllegalArgumentException {
		
		if(b==0) {
			throw new IllegalArgumentException();
		}
		
		return a/b;
		
	}
	public static String reverseString(String str) throws IllegalStateException{
		
		if(str.equals("")) {
			throw new IllegalStateException();
		}
		String out = "";
		for(int i = str.length()-1;i>=0;i--) {
			out+=str.substring(i,i+1);
		}
		return out;
	}
}
