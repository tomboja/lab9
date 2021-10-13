package assignment.lab9.Lab9Part1_4.prob4;

import java.util.stream.IntStream;

/**
 * Solution to Part A.
 * 
 * @author: tdessalegn
 * @email: tdessalegn@miu.edu
 * @date: Oct 13, 2021
 */
public class PrimeNumbersStream_A {
	final IntStream primes = IntStream.iterate(2, n -> PrimeFinder.nextPrime(n));
}
