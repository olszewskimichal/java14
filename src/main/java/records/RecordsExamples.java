package records;

import java.math.BigDecimal;

public class RecordsExamples {
	public static void main(String[] args) {
		Product product = new Product(1L, "Maseczka", BigDecimal.valueOf(100));
		System.err.println(product.id());  //auto generated getters
		System.err.println(product); //generated toString
		System.err.println(product.equals(new Product(1L, "Maseczka", BigDecimal.valueOf(100)))); //generated hashCode i equals

		System.err.println(new ValidatedProduct(3L, "Maseczka", BigDecimal.valueOf(1)));
	}
}
