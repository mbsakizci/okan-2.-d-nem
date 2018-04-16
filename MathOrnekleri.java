package mathsinifi;

public class MathOrnekleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("3 ün 5 inci kuvveti : " + Math.pow(3, 5));
		System.out.println("3 ün 5 inci kuvveti : " + Math.pow(2, 3));
		System.out.println("9 un kare kökü : " + Math.sqrt(9));
		
		// Mutlak değeri alma
		System.out.println("-3 ün mutlak değeri : " + Math.abs(-3));
		
		// Ondalıklı sayıyı tabana çekme
		System.out.println("7.74 ün tabana çekilmesi : " + Math.floor(7.74));
		
		// Ondalıklı sayıyı tavana çekme
		System.out.println("7.1 in tavana çekilmesi : " + Math.ceil(7.1));
		
		// Ondalıklı sayıyı yuvarlama 
		System.out.println("7.74 ün yuvarlanması : " + Math.round(7.74));
		System.out.println("7.74 ün yuvarlanması : " + Math.round(7.1));
		
		// Girilen iki sayıdan en küçüğü
		System.out.println("5,3 ün küçüğü : " + Math.min(5, 3));
		
		// Girilen iki sayıdan en büyüğü
		System.out.println("5,3 ün büyüğü : " + Math.max(5, 3));
		
		// 0 ile 1 arasında rastgele sayı üretme
		System.out.println("Rastgele üretilen sayı 1 : " + Math.random());
		System.out.println("Rastgele üretilen sayı 2 : " + Math.random());
		double uretilenSayi = Math.random()*50;
		System.out.println("Rastgele üretilen sayı 0-50 arası : " + uretilenSayi);
		System.out.println("Rastgele üretilen sayı 0-50 arası tam kısmı : " +(int) (uretilenSayi));
		double uretilenSayi2 = Math.random()*50+25;
		System.out.println("Rastgele üretilen sayı 25-75 arası tam kısmı : " +(int) (uretilenSayi));
		
		
		
	}

}
