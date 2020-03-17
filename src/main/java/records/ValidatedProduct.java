package records;

import java.math.BigDecimal;

public record ValidatedProduct(Long id, String name, BigDecimal price) {
	public ValidatedProduct(Long id, String name, BigDecimal price) {
		if (price.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException();
		}
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
