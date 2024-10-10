package ParallelStreamsPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Using parallel stream to calculate squares
	        numbers.parallelStream()
                    .map(n -> {
                        // Print the current thread name
                        System.out.println("Processing " + n + " in thread: "
                        						+ Thread.currentThread().getName());
                        return n * n;
                    })
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
	}

}
