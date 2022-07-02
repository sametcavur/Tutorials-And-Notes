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
		
		//ÖRNEK 1:
		IInformation informations1 = (String name) -> {
			if(name.equals("Samet"))
				return true;
			else 
				return false;
		};
		System.out.println(informations1.inquireCridentials("Samett"));
		
		//**********************************************************************
		
		//ÖRNEK 2:
		IInformation informations2 = (name) -> true; 
		//Üstte görüldügü üzere parametre tipini(String) yazmak zorunlu degildir.
		//Return kullanmak için süslü parantez içine almaliyiz.
		
		//**********************************************************************
		
		//ÖRNEK 3:
		boolean value = true;
		IInformation informations3 = (name) -> value; 
		//Üstte görüldügü üzere disaridan parametre alabilir.
		
		//**********************************************************************
		
		/* ÖRNEK 4: HATALI DURUM
		boolean value2 = true;
		value2 = false;
		IInformation informations4 = (name) -> value2; 
		//Burada value2 degeri iki kere degistirildigi icin derleme hatasi verecektir. Effectivelly finally ozelligini kaybeder.
	*/
		}
}

 /* @FunctionalInterface :
 * Yalnýzca bir tane *abstract metodu* olan interfacelerdir
 * Birden fazla yada sýfýr metod olamaz. Yalnýzca 1 tane olmalidir.
 * Bu metod default yada static olabilir.
 * Bu metod, interface içinde yada super interfacesinde olabilir.
 * Parametreli yada parametresiz tanimlanabilir.
 * 
 * Normal interfaceden farki; interfacelerde Impl classinin içerisinde bu interfacenin metodlarini doldururuz. 
 * Fakat bunda direk interfaceyi kullanabiliriz.(Örnek üstte)	
 * 
 * Java 8 ile gelen diger interface özelliklerinden biride default ve statik metodlardir.
 * Default metod demek, interfacelerin içerisinde gövdesi doldurulabilir metodlardir. Ve Impl classlarinda override etmesek dahi
 * bu interfaceyi implement eden her classta bulunur. Tabi Override edip bu metodu customize da edebiliriz.
 * 
 */


