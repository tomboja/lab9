package assignment.lab9.Lab9Part1_4.prob4;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * Solution to Part A.
 * 
 * @author: tdessalegn
 * @email: tdessalegn@miu.edu
 * @date: Oct 13, 2021
 */

public class PrimeNumbersStream_B {

	Function<Integer, IntStream> primesLimit = x -> IntStream.iterate(2, n -> PrimeFinder.nextPrime(n)).limit(x);

	public void printFirstNPrimes(int n) {
		System.out.println(Arrays.toString(primesLimit.apply(n).toArray()));

	}

	public static void main(String[] args) {
		PrimeNumbersStream_B ps = new PrimeNumbersStream_B();
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);

	}

}
