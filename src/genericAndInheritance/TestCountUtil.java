package genericAndInheritance;

import java.util.Arrays;
import java.util.List;

public class TestCountUtil {

	public static void main(String[] args) {

		List<Number> numbers = Arrays.asList(10D, 20D, 30D);
		double sum = CountUtil.count(numbers);
		System.out.println(sum);
		
		List<Integer> integers = Arrays.asList(10, 20, 30);
		// int sumInt = CountUtil.count(integers); // here is the issue
		//System.out.println(sumInt);

	}

}
