
public class Stringler {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı :"+mesaj.length());
		System.out.println("5. eleman :"+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın"));
		System.out.println(mesaj.startsWith("B"));
		
		//Büyük küçük harfe duyarlı
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("n"));
		
		//Metnin ilk 5 harfini alan kod
		char[] karakter = new char[5];
		mesaj.getChars(0, 5, karakter, 0);
		System.out.println(karakter);
		//aranan elemanın metinde kaçıncı indexte olduğunu arar.
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));
		//karakterleri değiştirmek
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		//System.out.println(mesaj.replace(' ', '_'));
		//////////////////////////////////////////////////
		//Metni belli indexten keser
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));
		//Metni ayırmaya yarar
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		//Metindeki bütün karakterleri küçültme veya büyüme
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		//Metnin başında ve sonundaki gereksiz boşlukları yok eder
		System.out.println(mesaj.trim());
		
		
	}

}

