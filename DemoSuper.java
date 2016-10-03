public class DemoSuper{
	public class void main(String[] args){
		System.out.println("Demo Super pada INHERITANCE");
		KelasAnak kA = new KelasAnak();
		kA.methodAnak();
	}
}

class KelasAnak extends KelasInduk{
	public KelasAnak(){
		super();
	}

	public void methodeAna(){
		super.methodeInduk();
	}
}

class KelasInduk{
	public KelasInduk(){
		System.out.println("Ini adalah konstruktor kelas Induk");
	}

	public void methodeInduk(){
		System.out.println("Methode ini dimiliki oleh kelas Induk");
	}
}