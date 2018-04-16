package mathsinifi;

public class StringMetot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char dizi[] = {'o','k','a','n'};
		System.out.println("dizi : " + dizi);
		
		for(int i=0; i<dizi.length; i++)
			System.out.println(dizi[i]);
		
		// Diziyi String'e çevirme
		String diziStringi = new String(dizi);
		System.out.println("Stringe çevrilmiş dizi" + diziStringi);
		System.out.println("Stringin uzunluğu" + diziStringi.length());
		
		String isim= "Üniversitesi";
		System.out.println(isim);
		
		System.out.println(isim);
		String ad = "Burkay";
		String soyad = "Sakızcı";
		System.out.println("Ad Soyad : " + (ad +""+ soyad));
		System.out.println("concat ile ekleme : " + ad.concat(soyad));
		
		String il1 = "Osmaniye", il2 = "Osmaniye", il3 = "Osmaniye", il4 = "Osmaniye", il5 = "Osmaniye";
		System.out.println("il1 il2 kıyaslaması" + (il1==il2));
		System.out.println("il1 il5 kıyaslaması" + (il1==il5));
		
		// İki stringi küçük büyük harfe bakarak kıyaslar
		System.out.println("il1 il2 kıyaslaması" + (il1.equals(il2)));
		
		// İki stringi küçük büyük harfe dikkat etmeden kıyaslar
		System.out.println("il1 il2 kıyaslaması" + (il1.equalsIgnoreCase(il2)));
		
		String ad1 = "Ali", ad2= "Veli";
		System.out.println("Ali Veli : " + ad1.compareTo(ad2));
		System.out.println("Ali Ali : " + ad1.compareTo(ad1));
		System.out.println("Veli Ali : " + ad2.compareTo(ad1));
		
		// Stringin başlangıcını kontrol etme
		System.out.println("Ali A ile başlıyor mu : " + ad1.startsWith("A"));
		System.out.println("Ali l ile başlıyor mu : " + ad1.startsWith("l"));
		
		// Stringin sonunu kontrol etme
		System.out.println("Veli i ile bitiyor mu : " + ad2.endsWith("i"));
		System.out.println("Veli l ile bitiyor mu : " + ad2.endsWith("l"));
		
		// İndis değeri vererek başlangıç kontrolü  ! BAŞLANGIÇ HARFİ 0 İLE BAŞLIYOR !
		System.out.println("Ali l ile başlıyor mu : " + ad1.startsWith("l",1));
		
		// String içinden istenilen karakteri alma
		System.out.println("s2 den 2. karakteri al : " + ad2.charAt(2));
		
		isim = "BuRkAy";
		// Küçük harfe çevirme
		System.out.println("Küçük harfe çevirme : " + isim.toLowerCase());
		// Büyük harfe çevirme
		System.out.println("Büyük harfe çevirme : " + isim.toUpperCase());
		
		isim = "    Burkay     ";
		System.out.println("boşluklu : " + isim);
		System.out.println("boşluksuz : " + isim.trim());
		
		isim = "Ne Mutlu Türküm Diyene";
		System.out.println("boşluk , yas : " + isim.replace(" ", " , "));
		
		String veri[] = isim.split(" ");
		for(int i=0; i<veri.length; i++)
			System.out.println(veri[i]);
				
		System.out.println("Veri 2 : " + veri[2]);
		
		
		
		
		
		
		
	}

}
