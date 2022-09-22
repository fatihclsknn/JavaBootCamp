package methods;

public class Main {

	public static void main(String[] args) {
			sayiBul();

	}
	
	public static void sayiBul()
	{
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 2;
		boolean varMi = false;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == aranacak) {
				varMi= true;
				break;
			}
				
		}
		if(varMi)
		{
			mesajVer("Sayi mevcuttur:"+ aranacak);
		}
		else {
			mesajVer("Sayi mevcut değildir:"+ aranacak);
		}
	}
	public static void mesajVer(String mesaj)
	{
		System.out.println(mesaj);

	}
}
