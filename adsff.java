package asdfw;

import java.util.Scanner;

public class adsff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris = new Scanner(System.in);
		
	
		System.out.println("Adınız: ");
		String isim = giris.next();
		System.out.println("Vize notunu giriniz: ");
		byte vize = giris.nextByte();
		System.out.println("Final notunu giriniz: ");
		byte finall = giris.nextByte();
		float bn = (float) (vize*0.4+finall*0.6);
		System.out.println("Adınız: " + isim + "\nVize notunuz: \t" + vize + "\nFinal notunuz: \t" + finall + "\nBaşarı notunuz: \t" + bn);

		
		
	}

}
