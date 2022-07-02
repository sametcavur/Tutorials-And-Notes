package Stream.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		//Liste içindeki itemin listesini diger itemlerin listesiyle birlestirmeye yarar
		
		/*
		 * Ornegin bir kisinin birden fazla arabasi olabilir. Ve elimizde birden fazla arabasi olan kisilerde olusan liste olsun.
		 * Ve bu kisi altindaki arabalardan bir liste yapmak istersek flatMap'i kullaniyoruz.
		 */
		
		//ORNEK
		Kisi kisi1 = new Kisi("Samet", Arrays.asList("BMW","MERCEDES"));
		Kisi kisi2 = new Kisi("Samet", Arrays.asList("FORD","RENAULT"));
		Kisi kisi3 = new Kisi("Samet", Arrays.asList("PEUGEOT"));
		Kisi kisi4 = new Kisi("Samet", Arrays.asList("FIAT","RENAULT"));
		Kisi kisi5 = new Kisi("Samet", Arrays.asList("BUGATTÝ","TOFAS","FERRARI"));
		
		List<Kisi> kisiList = Arrays.asList(kisi1,kisi2,kisi3,kisi4,kisi5);
		
		List<String> carList = kisiList.stream()
			.flatMap(kisi -> kisi.getCars().stream())
			//.distinct()  -> distinct koyarak 2 defa var olan RENAULT'un birini silebiliriz.
			.collect(Collectors.toList());
		
		System.out.println(carList); //[BMW, MERCEDES, FORD, RENAULT, PEUGEOT, FIAT, RENAULT, BUGATTÝ, TOFAS, FERRARI]
		
		
		
	}
}
