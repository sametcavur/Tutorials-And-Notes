package Stream.Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		// Listedeki tekrar eden elemanlarý siler.

		List<String> asList = Arrays.asList("1", "1", "2", "3", "3", "4", "4");

		List<String> collect = asList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(collect); //[1, 2, 3, 4]


	}
}
