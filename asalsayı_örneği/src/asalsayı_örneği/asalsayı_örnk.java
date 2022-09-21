package asalsayı_örneği;

public class asalsayı_örnk {

	public static void main(String[] args) {
		//Asal sayı
		int number = 1;
		int remainer = number %2;
		System.out.println(remainer);
		boolean isPrime = true;
		
		if(number<2) {
			System.out.println("değil");
			return;
		}
		
		
		for(int i=2;i<number;i++) {
			if(number%i ==0) {
				isPrime =false;
			}
		}
		if(isPrime) {
			System.out.println("asal");
		}else {
			System.out.println("değil");
		}
		//Kalın-İnce sesli harf
		char harf ='A';
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın Sesli");
				break;
			default:
				System.out.println("İnce Sesli");
					
			}	
	}

}

