package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(3, 2);
		System.out.println(sonuc);
		int sonuc2 = dortIslem.topla2(3, 5, 6);
		System.out.println(sonuc2);
	}

}
