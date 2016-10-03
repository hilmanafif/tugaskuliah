import java.text.DecimalFormat;

public class DemoEnkapsulasi{
	public static void main (String[] args){
		DecimalFormat digitalpresisi=new DecimalFormat("0,00");
		System.out.println("\nDEMO ENKAPSULASI");
		System.out.println("==================");
		HitungGaji tony=new HitungGaji();
		tony.setGaji(25000000);
		tony.hitungGaji();
		System.out.println("Informasi Gaji Pegawai");
		System.out.println("\nBesar Gaji Kotor : "+ digitpresisi.format(tony.getGajiKotor()));
		System.out.println("Besar Gaji yang dibawa pulang : "+ digitalpresisi.format(tony.getGajiBersih()));
	}
}

class HitungGaji{
	private double gajiKotor,gajiSetelahPajak;
	public double gajiBersih;
	private double potongan=7500.00;
	public void setGaji(double gaji){
		gajiKotor=gaji;
	}
}