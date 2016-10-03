import java.io.*;
public class Mamalia{
	void KelasMamalia(){
		System.out.println("Ciri umum mamalia adalah bernapas dengan paru-paru");
		System.out.println("Berkembang biak dengan cara beranak");
	}
}

class Paus extends Mamalia {
	String x = "Ikan Paus";
	void TampilkanPaus(){
		System.out.println("Mamalia yang anda pilih adalah"+ x);
		System.out.println("Mamalia ini berada di laut");
		System.out.println("Paus termasuk jenis mamalia terbesar");
	}
}

class Cheetah extends Mamalia {
	String x = "Cheetah";
	void TampilkanCheetah(){
		System.out.println("Mamalia yang anda pilih adalah"+ x);
		System.out.println("Mamalia ini berada di darat");
		System.out.println("Cheetah termasuk jenis mamalia pelari tercepat di darat");
	}
}

class sapi extends Mamalia{
	String x = "Sapi";
	void TampilkanSapi(){
		System.out.println("Mamalia yang anda pilih adalah"+ x);
		System.out.println("Mamalia ini berada di darat");
		System.out.println("Paus termasuk jenis mamalia jinak");
	}
}
class Turunan {
	public static void main(String[] args) throws IOException{
		String sInput = null;
		System.out.println("___JENIS MAMALIA____");
		System.out.println("[1] Ikan Paus");
		System.out.println("[2] Cheetah");
		System.out.println("[3] Sapi");
		System.out.print("MAsukan pilihan anda : ");
		Mamalia generalx = new Mamalia();
		Paus turunan1 = new Paus();
		Cheetah turunan2 =  new Cheetah();
		Sapi turunan3 = new Sapi();
		InputStreamReader inputan = new InputStreamReader(System.in);
		BufferedReader jm = new BufferedReader(inputan);
		sInput = jm.readLine();
		int i = Integer.perseInt(sInput);
		switch (i){
			case 1:
			generalx.KelasMAmalia();
			turunan1.TampilkanPaus ();break;

			case 2:
			generalx.KelasMAmalia();
			turunan1.TampilkanCheetah ();break;

			case 3:
			generalx.KelasMAmalia();
			turunan1.TampilkanSapi ();break;

			default:
			System.out.println("Pilihan yang anda masukkan salah"); break;

		}
	}
}
