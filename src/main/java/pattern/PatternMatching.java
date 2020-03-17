package pattern;

public class PatternMatching {
	public static void main(String[] args) {
		outputValueInUppercase(34L);
		outputValueInUppercase("value");
	}

	static void outputValueInUppercase(Object obj) {
		if (obj instanceof String s) {
			System.out.println(s.toUpperCase());
		}
	}
}

class Monitor {
	String model;
	double price;

	@Override
	public boolean equals(Object o) {
		if (o instanceof Monitor other) {
			return model.equals(other.model) && price == other.price;
		}
		return false;
	}
}
