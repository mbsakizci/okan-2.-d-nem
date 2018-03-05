import java.util.Scanner;

public class metodlar_özellikleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		yaziYaz(); //metoda veri gönderilmedi ve geriyede veri döndürülmedi
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir isim giriniz : ");
		String ad = giris.next();
		selamVer(ad);
		System.out.println("Yaşınızı giriniz : ");
		int yas = giris.nextInt();
		int dt = yasHesap(yas);
		System.out.println("Doğum tarihiniz : " + dt);
		
	}

		static int yasHesap(int yas) {
		// TODO Auto-generated method stub
		System.out.println("Parametresiz geri dönüşsüz metod");
			return 2018-yas;
	}

		static void selamVer(String ad) {
		// TODO Auto-generated method stub
		System.out.println("\n gelen parametreli metod");
		System.out.println("Merhaba : " + ad);
	}

		static void yaziYaz() {
		// TODO Auto-generated method stub
		System.out.println("Parametresiz geri dönüş metodu");
	}

}
