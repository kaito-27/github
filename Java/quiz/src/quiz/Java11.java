package quiz;

import java.util.Random;
public class Java11 {
	public static void main(String[] args) {
		int i = 0;
		System.out.println(i++);
		Random rand = new Random();
		int num= rand.nextInt(4) + 1;

		switch(num) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("小吉");
			break;
		case 4:
			System.out.println("凶");
			break;
		}
	}
}
