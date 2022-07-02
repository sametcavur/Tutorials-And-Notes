package DateTimeOperations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeOperations {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); //2022-06-18T10:06:52.575343200

		LocalDateTime createLocalDateTime = LocalDateTime.of(2022, 12, 31, 12, 00);
		System.out.println(createLocalDateTime); //2022-12-31T12:00
		
		LocalDateTime stringToLocalDateTime = LocalDateTime.parse("2000-01-30T12:00"); //Tarih ve saatin ayrildigi noktada T harfi var!.
		System.out.println(stringToLocalDateTime); //2000-01-30T12:00
		
		LocalDateTime stringToLocalDateTime2 = LocalDateTime.parse("2020-11-22T00:00"); //Tarih ve saatin ayrildigi noktada T harfi var!.
		System.out.println(stringToLocalDateTime2); //2020-11-22T00:00
		
		LocalDateTime plusDay = stringToLocalDateTime.plusDays(10); //10 gün ekle
		System.out.println(plusDay); //2000-02-09T12:00
		
		LocalDateTime plusHour = stringToLocalDateTime.plusHours(50); //50 saat ekle
		System.out.println(plusHour); //2000-02-01T14:00
		
		LocalDateTime plusWeek = stringToLocalDateTime.minusWeeks(10); //10 hafta cikar
		System.out.println(plusWeek); //1999-11-21T12:00
		
	
		//Create LocalDateTime by LocalDate and LocalTime
		LocalDate localDate = LocalDate.of(2022, 12, 31);
		LocalTime localTime = LocalTime.of(12, 00);
		
		LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime1); //2022-12-31T12:00
		
		LocalDateTime localDateTime2 = LocalDateTime.of(localDate, LocalTime.of(23, 59));
		System.out.println(localDateTime2); //2022-12-31T23:59
	}
}
