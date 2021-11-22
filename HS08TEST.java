/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		int x;
		double y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextDouble();
		if (x % 5 == 0 && y >= (x + 0.50)) {
			System.out.printf("%.2f", y - x - 0.5);
		} else {
			System.out.printf("%.2f", y);
		}
		sc.close();
	}
}
