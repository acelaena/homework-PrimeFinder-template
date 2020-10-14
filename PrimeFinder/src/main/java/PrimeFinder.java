import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Finds primes.
 */
public class PrimeFinder {

	/**
	 * A terrible and naive approach to determining if a number is prime.
	 *
	 * @param number to test if prime
	 * @return true if the number is prime
	 */
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = number - 1; i > 1; i--) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	/*
	 * This is an intentionally TERRIBLE implementation to cause a long-running
	 * calculation. There really is no realistic use of this approach.
	 */

	/**
	 * Returns a collection of all primes less than or equal to the max value.
	 *
	 * @param max the maximum value to evaluate if prime
	 * @return all prime numbers found up to and including max
	 */
	public static TreeSet<Integer> trialDivision(int max) {
		TreeSet<Integer> primes = new TreeSet<Integer>();

		if (max > 0) {
			for (int i = 1; i <= max; i++) {
				if (isPrime(i)) {
					primes.add(i);
				}
			}
		}

		return primes;
	}

	/**
	 * Uses a work queue to find all primes less than or equal to the maximum
	 * value. The number of threads must be a positive number greater than or
	 * equal to 1.
	 *
	 * @param max the maximum value to evaluate if prime
	 * @param threads number of worker threads (must be positive)
	 * @return all prime numbers found up to and including max
	 */
	public static TreeSet<Integer> findPrimes(int max, int threads) {
		// TODO Fix this implementation (see trialDivision for starting point).
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	// TODO Add additional classes or methods as needed.

	/**
	 * Demonstrates this class.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		int max = 40;
		int threads = 3;

		System.out.println(trialDivision(max));
		System.out.println(findPrimes(max, threads));
		System.out.println();

		int count = Thread.activeCount();
		System.out.println("Estimated number of active threads: " + count);

		Thread[] active = new Thread[count * 2];
		Thread.enumerate(active);

		String names = Arrays.stream(active)
			.filter(t -> t != null)
			.map(t -> t.getName())
			.collect(Collectors.joining(", "));

		System.out.println("Estimated active threads: " + names);
	}
}
