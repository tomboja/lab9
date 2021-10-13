package assignment.lab9.Lab9Part1_4.prob4;

/**
 * Prime finder function
 * 
 * @author: tdessalegn
 * @email: tdessalegn@miu.edu
 * @date: Oct 13, 2021
 */
public class PrimeFinder {
	public static int nextPrime(int num) {
		if (num < 2)
			return 2;
		int next = num + 1;
		while (!isPrime(next)) {
			next = next + 1;
		}
		return next;
	}

	public static boolean isPrime(int n) {
		for (int k = 2; k * k <= n; ++k) {
			if (n % k == 0)
				return false;
		}
		return true;

	}

}
