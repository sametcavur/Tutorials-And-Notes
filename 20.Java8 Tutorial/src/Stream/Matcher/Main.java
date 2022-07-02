package Stream.Matcher;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Samet","Murat","Turan","Ayse","Elif","Fatma","Sadik");
		
		boolean isContainsA = nameList.stream()
		.anyMatch(name -> name.contains("a"));
		System.out.println(isContainsA);
		
		boolean isStartWithSandContainsE = nameList.stream() //Bas harfi buyuk S ve icerisinde e olan isim varsa true don
		.filter(name -> name.startsWith("S"))
		.anyMatch(name -> name.contains("e"));
		System.out.println(isStartWithSandContainsE);
	}
}

/*
 ***Asagidaki metodlar ayni filter metodunda oldugu gibi icerisine PREDICATE alir.***
 
 
noneMatch : Belirtilen kriter listede hiçbir elemanda bulunmuyor ise true döndürür.
allMatch : Belirtilen kriter listede tüm elemanlarda bulunuyor ise true döndürür.
anyMatch : Belirtilen kriter listede herhangi bir elemanlarda bulunuyor ise true döndürür.
*/