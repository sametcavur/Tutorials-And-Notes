package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Stream.Sorted.book;

public class StreamApi {
	public static void main(String[] args) {
		// List'i stream'e cevirme
		List<String> list = new ArrayList<String>();
		list.add("Samet");
		list.add("Cavur");
		Stream<String> listToStream = list.stream();

		//Array'i stream'e cevirme
		String[] nums = { "Samet" , "Çavur" };
		Stream<String> arrayToStream = Arrays.stream(nums);
		
		//Sifirdan stream olusturma
		Stream<String> streamOf = Stream.of( "Samet", "Çavur" );
		
		//Stream'i List'e cevirme
		List<String> streamToList = streamOf.toList();
		
		//Stream'i Array'e cevirme
		Object[] streamToArray = streamOf.toArray();	
		
		//Bos bir stream olusturma
		Stream<String> emptyStream = Stream.empty();
	}
}
/*
Stream dedigimiz olan uzerinde bir takim islemler yapabilecegimiz dizi,kümedir.

Streamler üzerinde;
filter metodu ile Predicate'lerde oldugu gibi bir takim filtreleme,
map metodu ile Function'larda oldugu gibi ayiklama-haritalama,
foreach metodu ile Consumer'larda oldugu gibi listenin tum uyeleri uzerinde islemler yapabiliriz.


-ForEach bir terminal islemdir. Yani bir üzerinde islem yapabilecegimiz bir sey döndürmez ve en son islemi yapar.
ve forEach'ten sonra stream sonlanir.
-ForEach if present vs disindaki diger metodlar (filter,map,sorted,flatMap vs.) intermediate islemlerdir. Yani listedeki itemler
üzerinde bir takim islemler yapar ve geri item dondururler. 
-Stream'imizin son metodu intermediate metod olursa eger stream calismaz, yani filter,map,sorted gibi metodlardan sonra
foreach, ifpresent gibi terminal metod yazmak sarttir.

**NOT: Streamlerde ilk once filter sonra sorted ve sonrasinda map calistirilmalidir. Boylece daha az cpu cycle harcariz.

*/