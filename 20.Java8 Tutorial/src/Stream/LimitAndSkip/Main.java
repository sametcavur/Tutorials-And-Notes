package Stream.LimitAndSkip;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//elimizde 10'a kadar sayi listesi var
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		//ve asagida limit(5) ile listedeki ilk 5 sayiyi yazdir dedik.
		list.stream()
		.limit(5)
		.forEach(val -> System.out.print(val + "-")); //1-2-3-4-5-

		System.out.println("");
		
		// Asagida skip ile ise ilk 3 taneyi atla ve geri kalani yazdir dedik
		list.stream()
		.skip(3)
		.forEach(val -> System.out.print(val + "-")); //4-5-6-7-8-9-10-
		
		System.out.println("");
		
		// Asagida skip ile ise ilk 3 taneyi atla ve limit ile sonraki 5 taneyi yazdir dedik
		list.stream()
		.skip(3)
		.limit(5)
		.forEach(val -> System.out.print(val + "-")); //4-5-6-7-8-
		
	}
}
