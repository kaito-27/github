package quiz;

public class Java19 {
	public static void main(String[] args) {
		int x = 143;
		for(int i = 2; i < x; i++) {
			if(x % i == 0) {
				System.out.println("素数ではありません");
				return;
			}
		}
		System.out.println("素数です");
	}
}
