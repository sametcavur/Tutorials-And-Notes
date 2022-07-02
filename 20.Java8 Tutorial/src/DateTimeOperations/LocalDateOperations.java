package DateTimeOperations;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateOperations {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now); //2022-06-18
		
		LocalDate createDate = LocalDate.of(2001, 12, 31);
		System.out.println(createDate); //2001-12-31
		
		LocalDate stringToLocalDate = LocalDate.parse("2002-12-31");
		System.out.println(stringToLocalDate); //2002-12-31
		
		LocalDate stringToLocalDate2 = LocalDate.parse("2003-01-01");
		System.out.println(stringToLocalDate2); //2003-01-01
		
		//Asagidaki ChronoUnit paketinin altinda gün,dakika,saat,hafta,yil,saniye gibi her türlü islem yapabilecegimiz zaman dilimi var.
		LocalDate plusDay = stringToLocalDate.plus(5,ChronoUnit.DAYS); //belirtilen tarihe 5 gün ekle
		System.out.println(plusDay); //2003-01-05
		
		LocalDate plusWeek = stringToLocalDate.plus(1,ChronoUnit.WEEKS); //belirtilen tarihe 5 gün ekle
		System.out.println(plusWeek); //2003-01-07
		
		LocalDate minusMonths = stringToLocalDate.minus(12,ChronoUnit.MONTHS); //belirtilen tarihten 12 ay cikar
		System.out.println(minusMonths); //2001-12-31
		

		System.out.println(stringToLocalDate.getDayOfMonth()); //31
		System.out.println(stringToLocalDate.getMonthValue()); //12
		System.out.println(stringToLocalDate.getYear()); //2002
		System.out.println(stringToLocalDate.getDayOfWeek());  //TUESDAY
		
		//Belirtilen bir tarih digerinden önce mi sonra mi? 
		System.out.println(stringToLocalDate.isAfter(stringToLocalDate2)); //false
		System.out.println(stringToLocalDate.isBefore(stringToLocalDate2)); //true
	}
}
