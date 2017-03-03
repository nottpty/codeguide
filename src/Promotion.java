import java.util.List;
import java.util.Map;

/**
 * The promotion of a product with a special price.
 * 
 * @author Patinya Yongyai
 *
 */
public class Promotion {
	/** All product in promotion. */
	private Map<String, Double> product;

	/**
	 * Constructor of Promotion class.
	 * 
	 * @param product
	 *            List of a product in promotion
	 */
	public Promotion(Map<String, Double> product) {
		// TODO fill your constructor
	}

	/**
	 * Set a new price of a product by using discount.
	 * 
	 * @param nameProduct
	 *            a name of a product
	 * @param percentDiscount
	 *            a percent discount of a product
	 */
	public void setPrice(String nameProduct, int percentDiscount) {
		// TODO Complete this method.
	}

	/**
	 * Get all name of product in promotion.
	 * 
	 * @return all name product in promotion.
	 */
	public List<String> getAllNameProduct() {
		// TODO Complete this method.
		return null;
	}

	/**
	 * Get a price of a product.
	 * 
	 * @param nameProduct
	 *            a name of a product
	 * @return price of a product
	 */
	public double getPrice(String nameProduct) {
		// TODO Complete this method.
		return 0;
	}

	/**
	 * Get a product in promotion.
	 * 
	 * @return product in promotion
	 */
	public Map<String, Double> getProduct() {
		// TODO Complete this method.
		return null;
	}

}
