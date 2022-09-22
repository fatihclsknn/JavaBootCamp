package methods2;

public class Main {

	public static void main(String[] args) {
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(2, 3);
		System.out.println(sayi);
		int toplam = topla2(2, 4, 6);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static int topla(int number1, int number2) {
		return number1 + number2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {

			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
