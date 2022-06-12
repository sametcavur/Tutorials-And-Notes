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
		kisiler.add(new Kisi("Zeynep", 53, "Aydýn"));
		kisiler.add(new Kisi("Turabi", 28, "Yýldýz"));
		kisiler.add(new Kisi("Cetin", 17, "Palamut"));
		
		/*Collections paketini kullanabilmek altta verdigimiz 2. parametre olan 
		 filtreleme classi implements Comparator<Kisi> zorundadir. */
		Collections.sort(kisiler,sortingByName); 
		
		Collections.sort(kisiler,sortingById);
		
		for (Kisi kisi : kisiler) {
			System.out.println(kisi);
		}
	}
} 
/*
 * filtrelemek istedigimiz entity'nin icerisinde de bu implements Comparator<Kisi> kullanabiliriz. Fakat...
 * o entity için sadece 1 filtreleme hakkimiz olur, bu sebepten ötürü her bir filtre icin comparator classlar 
 * olusturup bunlari da comparator paketinin altinda tutmak bir best practice'dir.
*/
