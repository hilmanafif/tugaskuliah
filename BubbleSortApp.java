import java.util.Scanner;
class BubbleSortApp{
	public static arrayBub arr = new arrayBub();
	public static Scanner input=new Scanner(System.in);
	static void menu(){
		
		//arr.display();
		System.out.println("\nMenu Pilihan ");
		//System.out.println("1. Masukkan data ");
		System.out.println("1. Tampilan Data Awal");
		System.out.println("2. Tampilan data Urut");
		System.out.println("3. Keluar ");
		System.out.print("Masuukan pilihan anda : ");
		int pil=input.nextInt();
		switch(pil)
		{
			//case 1: arr.insert();			
			case 1: arr.display();
			break;
			case 2: arr.bubbleSort();
					arr.display();
			break;	
			case 3: System.exit(0);
			break;
			default : System.out.print("maaf anda salah memsaukkan kode!!");
		}
		
	}
	static void menu2(){
		
		//arr.display();
		System.out.println("\nMenu Pilihan ");
		System.out.println("1. Masukkan data ");
		System.out.println("2. Tampilan Data Awal");
		System.out.println("3. Tampilan data Urut");
		System.out.println("4. Keluar ");
		System.out.print("Masuukan pilihan anda : ");
		int pil=input.nextInt();
		switch(pil)
		{
			case 1: arr.insert();
			break;			
			case 2: arr.display();
			break;
			case 3: arr.bubbleSort();
					arr.display();
			break;	
			case 4: System.exit(0);
			break;
			default : System.out.print("maaf anda salah memsaukkan kode!!");
		}
	}
	public static void main(String[]args){
		//Scanner input=new Scanner(System.in);
		arr.insert();
		menu();
		for(int k=0;k<100;k++)
		menu2();
		//arrayBub arr = new arrayBub();
		//int maxSize = 100;
	}
	
}