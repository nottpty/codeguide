import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Exercise for other students to check understanding in The Principles of Good
 * Programming.
 * 
 * @author Patinya Yongyai
 *
 */
public class Main {
	/**
	 * Main to run an application.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		Map<String, Double> product = new HashMap<>();
		product.put("Noodle", 20.0);
		product.put("Core i5", 3500.0);
		product.put("Boots", 2150.5);
		Promotion promotion = new Promotion(product);
		// TODO Show the name of all product in promotion.
		// TODO Discount 10 percent with all product.
		// TODO Show the price of "Core i5"
	}
}
