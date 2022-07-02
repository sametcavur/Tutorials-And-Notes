package Stream.GroupIngBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		//ORNEK1
		Kisi kisi1 = new Kisi("samet", "cavur", 25, "turkey");
		Kisi kisi2 = new Kisi("ayse", "dogan", 18, "turkey");
		Kisi kisi3 = new Kisi("fatma", "yildirim", 25, "usa");
		Kisi kisi4 = new Kisi("ali", "cicek", 25, "usa");
		Kisi kisi5 = new Kisi("metin", "gunes", 22, "italy");
		Kisi kisi6 = new Kisi("tekin", "arslan", 22, "italy");
		Kisi kisi7 = new Kisi("cetin", "yilmaz", 18, "england");
		List<Kisi> list = Arrays.asList(kisi1,kisi2,kisi3,kisi4,kisi5,kisi6,kisi7);
		
		Map<Integer, List<Kisi>> groupByAge = list.stream().collect(Collectors.groupingBy(Kisi::getAge));		
		System.out.println(groupByAge); // 18=[kisi2,kisi7], 22=[kisi5,kisi6], 25=[kisi1,kisi3,kisi4]
		
		
		Map<String, List<Kisi>> groupByCountry = list.stream().collect(Collectors.groupingBy(Kisi::getCountry));
		List<Kisi> kisiInEnglad = groupByCountry.get("england");
		System.out.println(kisiInEnglad); //[Kisi [name=cetin, surname=yilmaz, age=18, country=england]]
		
		
		//ORNEK2
		List<String> cityList = Arrays.asList("urfa","adana","trabzon","izmir","ankara","agri");
		Map<Integer, List<String>> collect = cityList.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(collect.get(4)); //[urfa, agri] (4 length'li iller)

	}
}
