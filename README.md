# Code Guide

## Don't repeat yourself(DRY)

Don't repeat yourself(DRY) is a one way to make your code easier to maintain because
this principle use for eliminate duplicate code or the same code. If your code has
the same code in many place, it hard to fix it in the later because you must change
it everywhere that you used the same code, it will bad if you forget to change it in
some place. So you should make it easier by creating some method or variable to keep
your code then call it to use in your project.

This is a simple example by using variable to eliminate duplicate code.
```
public class Dry {
	public static void main(String[] args) {
		Map<String, Integer> market = new HashMap<>();
		market.put("orange", 3);
		market.put("apple", 5);
		int totalValue = market.get("orange") + market.get("apple");
		double taxPrice = totalValue + (totalValue * 7);
		double deliveryPriceToThailand = taxPrice + (taxPrice * 0.1);
		double deliveryPriceToMalaysia = taxPrice + (taxPrice * 0.2);
		System.out.println("Total price in Thailand : " + deliveryPriceToThailand);
		System.out.println("Total price in Malaysia : " + deliveryPriceToMalaysia);
	}
}
```

Reference : https://javaadept.wordpress.com/2015/03/04/dont-repeat-yourself-dry/
            http://www.artima.com/weblogs/viewpost.jsp?thread=331531

## Write Code For The Maintainer

Almost any code that is worth writing is worth maintaining in the future. Almost
developer can't remember all code in the project, so you should write a code in a simple way
to read or fix it in the future. If you don't understand your code, that mean you must write
it again. So you should write a good java document, a good name variable and a good coding to
describe you or other developer in the future.

For example
```
public class Stopwatch {
	/** State of the stopwatch */
	private boolean state;
	/** Constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** Time that the stopwatch was started and stopped, in nanoseconds. */
	private long startTime, stopTime;

	/**
	 * @return the elapsed time in seconds with decimal. There are 2 cases: (a)
	 *         If the stopwatch is running, then return the elapsed time since
	 *         start until the current time. (b) If stopwatch is stopped, then
	 *         return the time between the start and stop times.
	 */
	public double getElapsed() {
		if (state)
			return (System.nanoTime() - startTime) * NANOSECONDS;
		return (stopTime - startTime) * NANOSECONDS;
	}

	/**
	 * To check state of the stopwatch.
	 *
	 * @return true if the stopwatch is running, false if stopwatch is stopped.
	 */
	public boolean isRunning() {
		return state;
	}

	/**
	 * Reset the stopwatch and start if if stopwatch is not running. If the
	 * stopwatch is already running then start does nothing.
	 */
	public void start() {
		if (!state)
			startTime = System.nanoTime();
		state = true;
	}

	/**
	 * Stop the stopwatch. If the stopwatch is already stopped, then stop does
	 * nothing.
	 */
	public void stop() {
		if (state)
			stopTime = System.nanoTime();
		state = false;
	}
}
```

Reference : https://dailycache.wordpress.com/tag/write-code-for-the-maintainer/
            http://www.artima.com/weblogs/viewpost.jsp?thread=331531
