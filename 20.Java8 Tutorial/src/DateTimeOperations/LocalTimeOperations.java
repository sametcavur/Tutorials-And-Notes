package DateTimeOperations;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeOperations {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now); //09:47:27.092820900
		
		LocalTime createTime = LocalTime.of(22, 30);
		System.out.println(createTime); //22:30
		
		LocalTime stringToLocalTime = LocalTime.parse("20:12");
		System.out.println(stringToLocalTime); //20:12
		
		LocalTime stringToLocalTime2 = LocalTime.parse("18:30");
		System.out.println(stringToLocalTime2); //18:30
		
		//Asagidaki ChronoUnit paketinin altinda gün,dakika,saat,hafta,yil,saniye gibi her türlü islem yapabilecegimiz zaman dilimi var.
		LocalTime plusMinute = stringToLocalTime.plus(1,ChronoUnit.MINUTES); //belirtilen saate 1 dakika ekle
		System.out.println(plusMinute); //20:13
		
		LocalTime plusHour = stringToLocalTime.plus(2,ChronoUnit.HOURS); //belirtilen saate 2 saat ekle
		System.out.println(plusHour); //22:12
		
		LocalTime minusHour = stringToLocalTime.minus(2,ChronoUnit.HOURS); //belirtilen saatten 2 saat cikar
		System.out.println(minusHour); //18:12
		
		System.out.println(stringToLocalTime.getHour()); //20
		System.out.println(stringToLocalTime.getSecond()); //0
		System.out.println(stringToLocalTime.getMinute()); //12
		
		//Belirtilen bir tarih digerinden önce mi sonra mi? 
		System.out.println(stringToLocalTime.isAfter(stringToLocalTime2)); //true
		System.out.println(stringToLocalTime.isBefore(stringToLocalTime2)); //false 
	}
}