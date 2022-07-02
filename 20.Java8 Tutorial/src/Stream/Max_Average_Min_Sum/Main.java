package Stream.Max_Average_Min_Sum;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> integerList2 = new ArrayList<String>();
		integerList2.add("1");
		integerList2.add("4");
		integerList2.add("7");
		integerList2.add("10");
		integerList2.add("3");
		
		double max = integerList2.stream()
			.mapToInt(Integer::parseInt) //String stream'i integer'a cevirir.
			.max().getAsInt(); //Bu stream icindeki en buyuk degeri bulur.
		System.out.println("Maksimum Deger :" + max); 
		
		
		double average = integerList2.stream()
				.mapToInt(Integer::parseInt)
				.average().getAsDouble();//Bu streamdeki degerlerin ortalamasini bulur.
		System.out.println("Ortalama Deger :" + average);
		
		
		double min = integerList2.stream()
				.mapToInt(Integer::parseInt) //String stream'i integer'a cevirir.
				.min().getAsInt(); //Bu stream icindeki en kucuk degeri bulur.
			
		System.out.println("Minimum Deger :" + min); 
			
		double sum = integerList2.stream()
				.mapToInt(Integer::parseInt) //String stream'i integer'a cevirir.
				.sum(); //Bu stream icindeki degerleri toplar .
				
		System.out.println("Toplam Deger :" + sum); 	
	}

}
