package quiz;

public class Java68 {
	public static void main(String[] args) {
		double ans = 0;
		try {
			ans = divide(8, 0);
		}
		catch(Exception e) {
			System.out.println("例外");
		}

		System.out.println(ans);
	}

	public static double divide(int a, int b) throws ArithmeticException {
        double ans = a / b;
        return ans;
    }
}
