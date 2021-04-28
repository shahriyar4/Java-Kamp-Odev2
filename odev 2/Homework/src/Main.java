
public class Main {

	public static void main(String[] args) {
		Kodlamaio kodlamaio1 = new Kodlamaio(1, "Programlamaya giriş için temel Kurs", "Engin Demirog");
		Kodlamaio kodlamaio2 = new Kodlamaio(2, "Yazılım Geliştirme  Kursu(Java+React)", "Engin Demirog");
		Kodlamaio kodlamaio3 = new Kodlamaio(3, "Yazılım Geliştirici  yetiştime Kampı(C#+Angular)", "Engin Demirog");

		Kodlamaio[] kodlamaios = { kodlamaio1, kodlamaio2, kodlamaio3 };
		for (Kodlamaio kodlamaio4 : kodlamaios) {
			System.out.println(kodlamaio4.courseName);
			System.out.println(kodlamaio4.teacherName);
			
		}
		
		KodlamaioManager kodlamaioManager = new KodlamaioManager();
		kodlamaioManager.register(kodlamaio2);
		kodlamaioManager.homework(kodlamaio2);
	}

}
