package sayı_bulma;

public class sayıbulma {

	public static void main(String[] args) {
		int[] sayılar = new int[] {1,2,3,4,5,6};
		int aranan = 1;
		boolean cvp = false;
		
		for(int i=0;i<sayılar.length;i++) {
			if(aranan ==i) {
				cvp=true;
			}
		}
		if(cvp==true) {
			System.out.println("var");
		}else {
			System.out.println("yok");
		}
		

	}

}

