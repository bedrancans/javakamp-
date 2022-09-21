
public class kalınince_harf {

	public static void main(String[] args) {
		//Kalın-İnce sesli harf
				char harf ='E';
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

