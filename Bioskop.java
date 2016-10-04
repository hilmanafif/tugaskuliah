import java.util.Scanner;
public class Bioskop{
	public static void main(String[] args){
		System.out.println ("Program Bioskop");
		System.out.println ("---------------");
		int umur;
		Scanner input = new Scanner(System.in);
		System.out.println ("Masukkan umur anda");
		umur = input.nextInt();
		if (umur > 17)
			System.out.println ("Silahkan Masuk");
		else
		{
			System.out.println ("Maaf, umur anda baru "+umur+" tahun");
			System.out.println ("Anda dilarang masuk!");
		}	
	}
}