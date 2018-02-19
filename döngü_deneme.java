import java.util.Scanner;

public class döngü_deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris = new Scanner(System.in);
		int sayac;
		double alan,yaricap,cevresi;  
		for (sayac=1;sayac<=3;sayac++) {
			
		
		System.out.println("Yarıçapı giriniz: ");
		  
		  yaricap= giris.nextDouble(); 
		  alan=3.14 * yaricap *yaricap ; 
		  cevresi = 2*Math.PI*yaricap ;
		  
		  System.out.println("Dairenin alanı= " + alan);
		  
		  System.out.println("Dairenin cevresi= " + cevresi);

	
		}
	}

}
