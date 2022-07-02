  package FunctionalInterfaces;

@FunctionalInterface
interface IInformation {
	//public boolean inquireCridentials(String name); Bu sekilde de olur.
	public abstract boolean inquireCridentials(String name);
	
	public static void selamla() {
		System.out.println("hello static");
	}
}

public class FuncInterfaces {
	public static void main(String[] args) {
		
		//�RNEK 1:
		IInformation informations1 = (String name) -> {
			if(name.equals("Samet"))
				return true;
			else 
				return false;
		};
		System.out.println(informations1.inquireCridentials("Samett"));
		
		//**********************************************************************
		
		//�RNEK 2:
		IInformation informations2 = (name) -> true; 
		//�stte g�r�ld�g� �zere parametre tipini(String) yazmak zorunlu degildir.
		//Return kullanmak i�in s�sl� parantez i�ine almaliyiz.
		
		//**********************************************************************
		
		//�RNEK 3:
		boolean value = true;
		IInformation informations3 = (name) -> value; 
		//�stte g�r�ld�g� �zere disaridan parametre alabilir.
		
		//**********************************************************************
		
		/* �RNEK 4: HATALI DURUM
		boolean value2 = true;
		value2 = false;
		IInformation informations4 = (name) -> value2; 
		//Burada value2 degeri iki kere degistirildigi icin derleme hatasi verecektir. Effectivelly finally ozelligini kaybeder.
	*/
		}
}

 /* @FunctionalInterface :
 * Yaln�zca bir tane *abstract metodu* olan interfacelerdir
 * Birden fazla yada s�f�r metod olamaz. Yaln�zca 1 tane olmalidir.
 * Bu metod default yada static olabilir.
 * Bu metod, interface i�inde yada super interfacesinde olabilir.
 * Parametreli yada parametresiz tanimlanabilir.
 * 
 * Normal interfaceden farki; interfacelerde Impl classinin i�erisinde bu interfacenin metodlarini doldururuz. 
 * Fakat bunda direk interfaceyi kullanabiliriz.(�rnek �stte)	
 * 
 * Java 8 ile gelen diger interface �zelliklerinden biride default ve statik metodlardir.
 * Default metod demek, interfacelerin i�erisinde g�vdesi doldurulabilir metodlardir. Ve Impl classlarinda override etmesek dahi
 * bu interfaceyi implement eden her classta bulunur. Tabi Override edip bu metodu customize da edebiliriz.
 * 
 */


