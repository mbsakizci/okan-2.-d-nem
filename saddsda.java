package adf;

import java.util.Scanner;

public class saddsda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// değişkenin tipi ismi tanımlarken 
		 int sayi;
		 int vize=50;
		 
		 Scanner klavye = new Scanner(System.in);
		 
		 System.out.println("Final notu gir : ");
		 
		int finalNot=klavye.nextInt();
		int bn = (int) (vize*0.4 + finalNot*0.6);
		 	
		System.out.println("Başarı notu : " + bn);
		System.out.println("Deneme");		
		
		// Aritmatik işlem yapma 2 sayı tanımladık
		
		int s1,s2;
		
		Scanner giris = new Scanner(System.in);
		System.out.println("Birinci sayıyı gir : ");
		s1=giris.nextInt();
		System.out.println("İkinci sayıyı gir : ");
		s2=giris.nextInt();
		
		// menülü yapıcaz bastığımız sayıya göre istediğimiz işlemi gerçekleştirecek.
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod al");
		System.out.println("Seçiminiz : ");
		int menu=giris.nextInt();
		switch (menu) {
		case 1:
			int toplam =s1+s2;
			System.out.println(s1+" + "+s2+" = "+toplam);
			break;
		case 2:
			System.out.println(s1+" - "+s2+" = "+(s1-s2));
			break;
		case 3:
			System.out.println(s1+" * "+s2+" = "+(s1*s2));
			break;
		case 4:
			if(s2==0) {
				System.out.println("İkinci sayı bölme yapılmaz!");
			} else {
				System.out.println(s1+" / "+s2+" = "+(s1/s2));
			}
			break;
		case 5:
			if(s2==0) {
				System.out.println("İkinci sayı bölme yapılmaz!");
			} else {
				System.out.println(s1+" % "+s2+" = "+(s1%s2));
			}
			break;
		}
		
	
	}

}
