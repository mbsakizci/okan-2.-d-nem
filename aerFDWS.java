package asdfw;

import java.util.Scanner;

public class burkay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris = new Scanner(System.in);
		
		double f;
		int a,b,c,d;
		
		System.out.println("Lütfen a sayısını girniz: ");
		a = giris.nextInt();
		
		System.out.println("Lütfen b sayısını girniz: ");
		b = giris.nextInt();
		
		System.out.println("Lütfen c sayısını girniz: ");
		c = giris.nextInt();
		
		System.out.println("Lütfen d sayısını girniz: ");
		d = giris.nextInt();
		
		f = ((a*a+a*b)) * d / ((a +b*b*d)*c);
		System.out.println("sonuc: " + f);
		
		
	}

}
