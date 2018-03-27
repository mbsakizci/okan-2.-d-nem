package adf;

import java.util.Scanner;

public class döngüler_hazırlıııkıkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tekrarlı işlemlerde döngü kullanılır !!
		// Bir iş kaç kere yapılacağı belli ise FOR döngüsü kullanılır !! 
		// Bir iş hangi koşula göre yapılcaksa DO,WHİLE kulllanılır !!
		
		
		
		Scanner klavye = new Scanner(System.in);
		int s1,s2,s3,s4,s5;
		System.out.println("Birinci sayı gir : ");
		s1=klavye.nextInt();
		System.out.println("İkinci sayı gir : ");
		s2=klavye.nextInt();
		System.out.println("Üçüncü sayı gir : ");
		s3=klavye.nextInt();
		System.out.println("Dördüncü sayı gir : ");
		s4=klavye.nextInt();
		System.out.println("Beşinci sayı gir : ");
		s5=klavye.nextInt();
		
		int toplam =  s1 + s2 + s3 + s4 + s5;
		System.out.println("Beş sayının toplamı : " + toplam );
		int sayi, i, donguToplam = 0;
		for (i = 1; i <= 5; i++) {
			System.out.println(i + " Sayıyı gir : ");
			sayi = klavye.nextInt();
			donguToplam = donguToplam + sayi; 
		}
		System.out.println("Döngüdeki 5 sayının toplamı : " + donguToplam);
		System.out.println("Girilen sayıların ortalaması : " +(donguToplam/5));
	
		int h=0; int hToplam = 0; int hsayi;
		do {
			h++;
			System.out.println(i + " Sayıyı gir : ");
			hsayi = klavye.nextInt();
			hToplam = hToplam + hsayi;
		}while(hsayi != 0);
		System.out.println("Döngüdeki " +h+ " sayıların toplamı : " + "Sayının toplamı : " + hToplam);
		System.out.println("Girilen sayıların ortalaması : " + (hToplam / (h - 1)));
		
		
	}

}
