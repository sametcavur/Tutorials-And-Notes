package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionClass {
	public static void main(String[] args) {

		List<String> numberList = Arrays.asList("1","43","9","35");
		Function<String, Integer> mapping = name -> Integer.parseInt(name);
		
		List<Integer> numList =numberList.stream()
		.map(mapping)
		.collect(Collectors.toList());
	}
}
/*
Bu functionun mantigi ise predicate ile ayni fakat stream içerisindeki filter ile degilde
map metodunda kullaniliyor.

Function<T,R> olarak kullanilan bu functional interfacenin T'si input deger R'si output degeridir
*/