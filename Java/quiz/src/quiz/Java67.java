package quiz;

public class Java67 {
	public static void main(String[] args) {
		System.out.println(divide(8, 0));
	}

	 public static double divide(int a, int b){
		 try {
			 double ans = a / b;
			 return ans;
		 }
		 catch(ArithmeticException e) {
			 System.out.println("例外");
			 return 0;
		 }
	 }
}
