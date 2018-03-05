import java.util.Scanner;

public class Menülü_Örnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris = new Scanner(System.in);
		System.out.println("Kaç veri girecekseniz : ");
		int ss = giris.nextInt();
		// Dizi tanımı 
		int sayi[] = new int [ss];
		// Sayıların belleğe aktarım tanımı
		for ( int i = 0; i < ss; i++) {
			System.out.println(i + " nci sayıyı giriniz : ");
			sayi[i] = giris.nextInt();
		}
		
		// Menü tanımı sonsuz döngü ile 
		for(;;) {
			menuYaz();
			int menu = giris.nextInt();
			switch(menu) {
			  case 1 : Ortalama(sayi); //toplam ortalama 
				break;
			  case 2 : tekOrtalama(sayi);
				break;
			  case 3 : çiftOrtalama(sayi);
				break;
			  case 4 : enkücük(sayi);
				break;
			  case 5 : enbüyük(sayi);
				break;
			  case 6 : System.exit(0);
				break;
			  default:
				  System.out.println("yanlış seçim\n");
			}
		}	
	}

	private static void enbüyük(int[] sayi) {
		// TODO Auto-generated method stub
		int eb = sayi[0];
		for (int i = 0; i<sayi.length; i++) {
			if(sayi[i]>eb) eb = sayi[i];
		}
		System.out.println("Sayıların en büyüğü : " + eb);
	}

	private static void enkücük(int[] sayi) {
		// TODO Auto-generated method stub
		int ek = sayi[0];
		for (int i = 0; i<sayi.length; i++) {
			if(sayi[i]<ek) ek = sayi[i];
		}
		System.out.println("Sayıların en küçüğü : " + ek);
	}

	private static void çiftOrtalama(int[] sayi) {
		// TODO Auto-generated method stub
		int ctoplam = 0, cs= 0;
		for (int i = 0; i<sayi.length; i++) {
			if(sayi[i]%2==0) {
				ctoplam+=sayi[i];
				cs++;
			}
			System.out.println("Çift sayıların ortalaması : " + (ctoplam/cs));
		}
	}

	private static void tekOrtalama(int[] sayi) {
		// TODO Auto-generated method stub
		int ttoplam = 0, ts= 0;
		for (int i = 0; i<sayi.length; i++) {
			if(sayi[i]%2==1) {
				ttoplam+=sayi[i];
				ts++;
			}
			System.out.println("Tek sayıların ortalaması : " + (ttoplam/ts));
		}
	}

	private static void Ortalama(int[] sayi) {
		// TODO Auto-generated method stub
		int toplam = 0;
		for (int veri:sayi) {
			toplam+=veri;
		}
		System.out.println("Tüm sayıların ortalaması : " + (toplam/sayi.length));
	}

	private static void menuYaz() {
		// TODO Auto-generated method stub
		System.out.println("1- Ortalama \n2 - Teklerin Ortalaması \n3 - Çiftlerin Ortalaması");
		System.out.println("4- En kücük \n5 - En büyük \n6 - Çıkış \n Seçiminiz : ");
		
		
		
	}

}
