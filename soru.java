import java.util.Scanner;

public class soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner giris = new Scanner(System.in);
		int toplam = 0, sayi;
		for (int i = 1; i <= 5; i++) {
			System.err.println(i+" inci sayıyı gir: ");
			sayi = giris.nextInt();
			toplam+=sayi;
			
		}
			System.out.println("sayinin ortalaması : " + (toplam/5));	
			
			System.out.println("do dongusu");
			int i=1;
			
			do {
				System.out.println(i+" inci sayıyı gir: ");
				sayi = giris.nextInt();
				toplam+=sayi;
				i++;
				
			}
			while (i<= 5);
			System.out.println("5 sayının ortalaması : " + (toplam/5));
			System.out.println("while dongusu");
			i++;
			while (i<=5) {
				System.out.println(i+" inci sayıyı gir: ");
				sayi = giris.nextInt();
				toplam+=sayi;
				
			}
			
			System.out.println("5 sayının ortalaması : " + (toplam/5));
			
	}

}
