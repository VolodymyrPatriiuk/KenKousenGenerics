package genericAndInheritance;

import java.util.List;

public class CountUtil {

	public static double count(List<Number> numbers) {
		return numbers.stream().mapToDouble(Number::doubleValue).sum();
	}
	
}
