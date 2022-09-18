package diziler;

public class diziler {
	public static void main(String[] args) {
		String[] öğrenciler = new String[3];
		öğrenciler[0]="Can";
		öğrenciler[1]="Canan";
		öğrenciler[2]="Cansu";
		for(int i=0;i<öğrenciler.length;i++) {
			System.out.println(öğrenciler[i]);
		}
		//For döngüsünde başka bir yazım şekli
		System.out.println("-------------------------------");
		for(String öğrenci:öğrenciler) {
			System.out.println(öğrenci);
		}
		double[] myList = {1.2,1.3,4.3,5.6};
		double total=0;
		double max=myList[0];
		for(double number:myList) {
			if(max<number) {
				max =number;
			}
			total = total +number;
			System.out.println(number);
		}
		System.out.println("toplam =" +total);
		System.out.println("En büyük =" +max);
		
		//Çok Boyutlu Diziler
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Urfa";
		sehirler[2][2] = "Antep";
		
		for(int i = 0;i<=2;i++) {
			for(int j =0;j<=2;j++) {
			System.out.println(sehirler[i][j]);
			}
		}

	}

}


