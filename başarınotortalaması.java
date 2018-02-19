import java.util.Scanner;

public class başarınotortalaması {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris = new Scanner(System.in);
		byte v,f,bn=0,sayac;
		short bnt = 0,vt=0,ft=0;
	
		
		for (sayac=0;sayac<5;sayac++) {
			System.out.println("Vize notunu gir: ");
			v = giris.nextByte();
			System.out.println("Final notunu gir: ");
			f = giris.nextByte();
			bn=(byte) (v*.4 + f*.6);
			
			if (bn<30)
				System.out.println("Başarı notu : FF");
			else if (bn<40)
				System.out.println("Başarı notu : DD");
			else if (bn<50)
				System.out.println("Başarı notu : DC");
			else if (bn<60)
				System.out.println("Başarı notu : CC");
			else if (bn<70)
				System.out.println("Başarı notu : CB");
			else if (bn<80)
				System.out.println("Başarı notu : BB");
			else if (bn<90)
				System.out.println("Başarı notu : BA");
			else 	System.out.println("Başarı notu : AA");
			vt=(short) (vt+v);
			ft=(short) (ft+f);
			bnt=(short) (bnt+bn);	
		
			System.out.println("Başarı notu: " + bn);
			bnt=(short) (bnt + bn);
			
			
		}
		System.out.println("Sınıf vize ortalaması: " + (vt/5));
		System.out.println("Sınıf final ortalaması: " + (ft/5));
		System.out.println("Sınıf ortalaması: " + (bnt/5));
		
	}

}
