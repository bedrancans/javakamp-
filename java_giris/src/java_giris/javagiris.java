package java_giris;

import java.util.Scanner;

public class javagiris {
public static void main(String[] args) {
		
		//Bu allahın emri yazılcak:)
		System.out.println("Hello Kodlamaio");
		
		
		//en büyük sayıyı ekrana yazdıran kod
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk =sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk =sayi3;
		}
		System.out.println(enBuyuk);
		
		
		//Öğrencinin notuna göre geçip kaldığını söyleyen kod
		Scanner scanner = new Scanner (System.in);
		System.out.println("Notu Giriniz: ");
		String not = scanner.next();
		switch (not) {
			case "a":
				System.out.println("Geçtiniz");
				break;
			case "b":
				System.out.println("Geçtiniz");
				break;
			case "c":
				System.out.println("Geçtiniz");
				break;
			case "f":
				System.out.println("Kaldırnız");
				break;
			default:
				System.out.println("Geçersiz not");
		
		     
		
		
		}
		
		
		
		
		
		
		

		
		
		
		
		
		
		}
		


}
