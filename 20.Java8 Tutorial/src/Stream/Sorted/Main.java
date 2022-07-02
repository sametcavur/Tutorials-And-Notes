package Stream.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		//ORNEK 1
		book book1 = new book(1, "samet",300);
		book book2 = new book(8, "cavur",544);
		book book3 = new book(4, "tekin",167);
		book book4 = new book(2, "cetin",390);
		List<book> booklist = Arrays.asList(book1,book2,book3,book4);
		
		List<book> sortedById = booklist.stream()
		.sorted(Comparator.comparingLong(book::getId)) //ID'ye gore siralama yaptirdik.
		.collect(Collectors.toList());
		System.out.println(sortedById);

		List<book> sortedByPageSize = booklist.stream()
		.sorted(Comparator.comparingLong(book::getPageSize)) //PageSize'a gore siralama yaptirdik.
		.collect(Collectors.toList());
		System.out.println(sortedByPageSize);
		
		//ORNEK 2
		List<String> stringList = Arrays.asList("a","A","c","h","g","B","b");
		
		stringList.stream()
			.sorted()
			.forEach(val -> System.out.print(val)); //ABabcgh
		System.out.println(" ");
		
		//ORNEK 3
		List<Integer> numList = Arrays.asList(1,9,-3,51,-10,3);
				
		numList.stream()
			.sorted()
			.forEach(val -> System.out.print(val + ",")); //-10,-3,1,3,9,51,
		System.out.println(" ");
		
		//ORNEK4 - Tersten siralama
		numList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(val -> System.out.print(val + ",")); //51,9,3,1,-3,-10,
		
	}
}
