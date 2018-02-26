import java.util.Scanner;

public class yaşmaaşort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris = new Scanner(System.in);
		int kirkyastop=0,kirkmaastop = 0,kirkmaassay=0,yasTop=0,maasTop=0,kirkyassay = 0;
		System.out.println("kaç kişi için çalışacak: ");
		int ks = giris.nextInt();
		int i,yas,maas;
		for(i=0; i<ks; i++) {
			System.out.println("Yaşı giriniz : ");
			yas = giris.nextInt();
			System.out.println("Maaşı giriniz : ");
			maas = giris.nextInt();
			yasTop+=yas;
			maasTop+=maas;
			if(yas>40) {
				kirkyastop+=yas;
				kirkmaastop+=maas;
				kirkyassay++;
				
			}
		}
		System.out.println("Yas ortalaması: " + (yasTop/ks));
		System.out.println("Maaş ortalaması: " + (maasTop/ks));
		System.out.println("40 ta büyüklerin yaş ortalaması: " + (kirkyastop/kirkyassay));
		System.out.println("Maaş ortalaması: " + (kirkmaastop/kirkyassay));
	}

}
