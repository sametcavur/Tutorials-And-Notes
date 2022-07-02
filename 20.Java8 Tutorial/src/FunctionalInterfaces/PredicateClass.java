package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {
	
	public static void main(String[] args) {
	
	List<String> nameList = Arrays.asList("MURAT","fatma","ayse","Tekin","Metin","Samet");

	//ÖRNEK 1 Stream icerisinde tanimlanmis normal yol
	String selectedName = nameList.stream()
	.filter(name -> name.startsWith("S") && !name.isEmpty())
	.findFirst()
	.orElse(null);

	System.out.println(selectedName);
	
	//ÖRNEK 2 Stream icerisinde degisken ile tanimlanmis yol
	String selectedName2 = nameList.stream()
			.filter((String name) -> name.startsWith("a") && !name.isEmpty())
			.findFirst()
			.orElse(null);

			System.out.println(selectedName2);
	
	//ÖRNEK 3 Predicates
	Predicate<String> filteredName = name -> name.startsWith("T");
	Predicate<String> nonNullName= name -> !name.isEmpty();
	
	String selectedName3 = nameList.stream()
			.filter(filteredName)
			.filter(nonNullName)
			.findFirst()
			.orElse(null);
	
	System.out.println(selectedName3);
	
	//ÖRNEK 4 Merge Predicate, Birlestirilmis conditionlar
		Predicate<String> filteredName1 = name -> name.endsWith("AT");
		Predicate<String> nonNullName1= name -> !name.isEmpty();
		
		Predicate<String> mergePredicated = filteredName1.and(nonNullName1);
		
		String selectedName4 = nameList.stream()
				.filter(mergePredicated)
				.findFirst()
				.orElse(null);
		
		System.out.println(selectedName4);
	
	//ORNEK 5 Predicate test metodu ile Predicatemizi test etme
		Predicate<String> condition= name -> name.endsWith("t");
		System.out.println(condition.test("samet"));
	}
}


/*
Bu Predicate<T> interfacesinin mantigi sudur. Stream'lerde filter icine yazacagimiz tüm conditionlari
tek bir degiskende tutabiliriz. Üstteki ÖRNEK 3'te inceleyebilirsin. Örnek olmasi acisindan 2 degisken tanimladim 
fakat tek degisken icerisinde üstteki 2 conditionuda yazabilirdik.

Tek bir .filter(degisken) icerisinde 2 tane degisken yazamayýz 2 condition varsa 2 filter olmalidir yada 
2 condition tek bir degiskende olmalidir yada and metodunu çagirmaliyiz(ORNEK 4)

ORNEK 5'te goruldugu gibi yazdigimiz predicateleri test edebiliriz.
*/
