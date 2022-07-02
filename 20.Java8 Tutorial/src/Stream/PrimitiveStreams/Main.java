package Stream.PrimitiveStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		// Bu primitive streamler uzerinde de filter map gibi stream metodlarini kullanabiliriz.

		// 1 ile 100 arasindaki sayilardan bir stream olusturduk(1 dahil,100 dahil degil) ve uzerinde toplama yaptik.
		int sum = IntStream
				.range(1, 100)
				.sum();
		System.out.println("Sum : " + sum);

		double avg = IntStream.of(74, 28, 31, 65, 14)
				.average()
				.getAsDouble(); 
		System.out.println("Avg : " + avg);

		//BOXING-UNBOXING 
		//Boxing : Buradaki IntStream,DoubleStream ve LongStream interfaceleri ile elimizdeki primitive streami wrapper listeye cevirebiliriz.
		List<Integer> toIntWrap = IntStream
				.range(5, 25)
				.filter(num -> num % 2 == 0)
				.boxed() //Bu metod araciligiyla yaptik.
				.collect(Collectors.toList());
		System.out.println(toIntWrap);
		
		//Unboxing : Usttekinin tam tersi olarak elimizdeki Wrapper Listeyi primitive type cevirebiliriz.
		double toPrimitive = Arrays.asList(66,34)
				  .stream()
				  .mapToInt(num -> num) //Bu metod araciligiyla yaptik.
				  .average()
				  .getAsDouble();
		
		System.out.println(toPrimitive);
		
	}
}

/*
 * Bu konunun mantigi söyledir. Belirledigimiz herhangi 2 sayi arasinda toplama
 * cikarma vs vs bir cok islem yapabiliriz.
 * 
 */