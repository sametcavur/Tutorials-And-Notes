package Stream.IfPresent;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		/*ifPresent bir önceki metoddan donen var ise calisan bir metoddur. Bir onceki
		 metodun findFirst yada findAny olmasi gerekir. ForEach gibi terminal bir islemdir,
		 ifpresenttan sonra baska metod gelmez.
		*/
		
		// ORNEK
		List<Integer> integerList1 = new ArrayList<Integer>();
		integerList1.add(1);
		integerList1.add(4);
		integerList1.add(7);

		integerList1.stream()
			.filter(num -> num > 5)
			.findAny()
			.ifPresent(num -> {
				System.out.println(num);
			});
	}
}
