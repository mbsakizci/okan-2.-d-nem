package asdfw;

import java.util.Scanner;

public class ADGHJG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner giris = new Scanner(System.in);
		
		double cevre;
		double alan;
		int yaricap;
		double PI = 3.14;
		
		System.out.println("Yarıçap giriniz: ");
		yaricap = giris.nextInt();
		
		cevre = (2*PI*yaricap);
		System.out.println("cevre: " + cevre);
		
		alan = (PI*yaricap*yaricap);
		System.out.println("alan: " + alan);
		
		
		
		
		
		
		
	}

}
