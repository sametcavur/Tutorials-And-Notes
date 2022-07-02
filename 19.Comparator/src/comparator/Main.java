package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Filtreleme classlari
		KisiSortingByName sortingByName = new KisiSortingByName();
		KisiSortingById sortingById = new KisiSortingById();
		
		List<Kisi> kisiler = new ArrayList<>();
		
		kisiler.add(new Kisi("Samet", 1, "Cavur"));
		kisiler.add(new Kisi("Ahmet", 99, "Tekin"));
		kisiler.add(new Kisi("Zeynep", 53, "Ayd�n"));
		kisiler.add(new Kisi("Turabi", 28, "Y�ld�z"));
		kisiler.add(new Kisi("Cetin", 17, "Palamut"));
		
		/*Collections paketini kullanabilmek altta verdigimiz 2. parametre olan 
		 filtreleme classi implements Comparator<Kisi> zorundadir. */
		Collections.sort(kisiler,sortingByName); 
		
		Collections.sort(kisiler,sortingById);
		
		//Comparator bir functional interface oldugu icin altta goruldugu gibi lambda expression'lar ile yazmak m�mk�n
		Collections.sort(kisiler, (kisi1, kisi2) -> kisi1.getName().compareTo(kisi2.getName()));
		
		for (Kisi kisi : kisiler) {
			System.out.println(kisi);
		}
	}
} 
/* Comparatorlarin en sik kullanim sekli lambda expressionlar iledir(28.satirda �rnek var) fakat yinede
 * lambda kullanmadan yazmak istiyorsak :
 * Filtrelemek istedigimiz entity'nin icerisinde de bu implements Comparator<Kisi> kullanabilir ve compare
 * metodunu override edebiliriz fakat...
 * o entity i�in sadece 1 filtreleme hakkimiz olur, bu sebepten �t�r� her bir filtre icin comparator classlar 
 * olusturup bunlari da comparator paketinin altinda tutmak gereklidir.
*/
