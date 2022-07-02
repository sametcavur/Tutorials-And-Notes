package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("MURAT","fatma","ayse","Tekin","Metin","Samet");
		
		Consumer<String> toUpperCase = name -> {
			name.toUpperCase();
			System.out.print(name + "-");
			//ConsumerClass.yazdir(name); bu sekilde metod da cagirabiliriz.
		};
		
		nameList.forEach(toUpperCase);
		
	}
	public static void yazdir(String str) {
		System.out.println(str);
	}
}
/*
 Bu consumer'in mantigi ise predicate ile ayni fakat stream içerisindeki filter ile degilde
 foreach metodunda kullaniliyor.
 */
