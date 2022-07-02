package Stream.Peek;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Peek aslinda forEach ile ayni isi görür fakat terminal operation degil
		//intermediate operationdur bu sebeple sonrasinda filter map gibi metodlar kullanilabilir.
		
		
		List<String> list = Arrays.asList("samet", "cavur");

		List<String> list2 = list.stream()
			.peek(val -> System.out.print(val.toUpperCase() + " "))
			.filter(val -> val.startsWith("c"))
			.toList();

		System.out.println(list2); //SAMET CAVUR [cavur]

	}
}
