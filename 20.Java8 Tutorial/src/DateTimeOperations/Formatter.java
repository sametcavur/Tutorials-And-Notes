package DateTimeOperations;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Formatter {
	public static void main(String[] args) {
		//Date Formatter
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter shortFormatDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumFormatDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		System.out.println(shortFormatDate.format(nowDate)); //18.06.2022
		System.out.println(mediumFormatDate.format(nowDate)); //18 Haz 2022
		System.out.println(longFormat.format(nowDate)); //18 Haziran 2022
		System.out.println(fullFormat.format(nowDate)); //18 Haziran 2022 Cumartesi
		
		
		//Time Formatter
		DateTimeFormatter shortFormatTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter mediumFormatTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		
		LocalTime nowTime = LocalTime.now();
		System.out.println(shortFormatTime.format(nowTime)); //10:26
		System.out.println(mediumFormatTime.format(nowTime)); //10:26:42
		
		
		//Custom Date Formatter
		LocalDate customDate = LocalDate.parse("1997-11-27");
		DateTimeFormatter customDateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(customDateFormat.format(customDate)); //27.11.1997
		
		//Custom Time Formatter
		LocalTime customTime = LocalTime.parse("06:30");
		LocalTime plusSecond = customTime.plus(10,ChronoUnit.SECONDS);
		DateTimeFormatter customTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(customTimeFormat.format(plusSecond)); //06:30:10
	}
}
