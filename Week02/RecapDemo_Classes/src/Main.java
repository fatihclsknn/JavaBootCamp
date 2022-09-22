
public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int topla = dortIslem.Topla(4, 4);
		int cıkar = dortIslem.Cıkar(4, 4);
		int carp = dortIslem.Carp(4, 4);
		int bol = dortIslem.Bol(4, 4);
		
		System.out.printf("Toplam=%d, Fark=%d, Carpim=%d, Bolum=%d",topla,cıkar,carp,bol);




	}

}
