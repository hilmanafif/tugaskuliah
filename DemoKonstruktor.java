public class DemoKonstruktor{
	/** Main Methode */ 
	public static void main(String[] args)
	{
		System.out.println("\nPROGRAM DEMO KONSTRUKTOR");
		System.out.println("--------------------------");

		//Membuat lingkaran dengan radius 10.0
		Lingkaran lingkaranSatu = new Lingkaran(10.0);
		System.out.println("Luas lingkaran dengan radius " + lingkaranSatu.radius+ "\t :"+ lingkaranSatu.luas());

		//Membuat lingkaran dengan radius default
		Lingkaran lingkaranDua = new Lingkaran();
		System.out.println("Luas lingkaran dengan radius default " + lingkaranDua.radius+ " :"+lingkaranDua.luas());

		lingkaranDua.radius = 15;
		System.out.println("Luas lingkaran dengan radius "+lingkaranDua.radius+"\t :"+lingkaranDua.luas());
	}
}
	//Mendefinisikan kelas lingkaran dengan dua konstruktor
	class Lingkaran
	{
		double radius;

		/** Konstruktor Default **/
		Lingkaran()
		{
			radius = 1.0;
		}

		/** Konstruktor dengan suatu radius*/
		Lingkaran(double r)
		{
			radius=r;
		}

		/** Methode mengembalikan luas lingkaran */
		double luas()
		{
			return radius*radius*Math.PI;
		}
	}
