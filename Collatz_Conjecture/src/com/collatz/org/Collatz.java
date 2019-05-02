//i have updated the code
//again updated
//
package com.collatz.org;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int x = sc.nextInt();
		Conjecture c = new Conjecture();

		while (x != 1) {
			if (c.isEven(x)) {
				x = x / 2;
				System.out.println(x);
			}

			else if (c.isODD(x)) {
				x = (x * 3) + 1;
				System.out.println(x);
			}

		}
	}

}

class Conjecture {
	boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else
			return false;
	}

	boolean isODD(int num) {
		if (num % 2 != 0) {
			return true;
		} else
			return false;
	}
}
