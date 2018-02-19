import java.util.Scanner;

public class tek_çift_tümsayıları_ekranayazdırma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris = new Scanner(System.in);
		byte i;
        int tekt=0,ciftt=0,toplam=0,sayi,sayac;
     
        for (sayac=1;sayac<=10;sayac++) {
        	 System.out.print("Bir sayı girin");
             sayi=giris.nextInt();
            if (sayi %2==0) 
               ciftt+=sayi;
             
            else 
            	  tekt+=sayi;
        }
		
		System.out.println("tüm sayıların toplamı: " + toplam);
		System.out.println("teklerin ortalaması " + tekt);
		System.out.println("tüm sayıların toplamı: " + ciftt);
	}

}
