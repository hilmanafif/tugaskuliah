import java.util.Scanner;
class arrayBub{
	//public int[] bil;
	public int bil[]=new int[10];
	private int n;

//public arrayBub(int max){
	//bil = new int[max];
	//n = 0;
//}

public void insert(){
	Scanner input=new Scanner(System.in);
	
	for(int i=0; i<3;i++){
		System.out.print("Masukkan data ke-"+(i+1)+" : ");
	bil[i]=input.nextInt();
	}
	//bil[n]= nilai;
	//n++;
	}

public void display(){
	for(int j=0; j<3; j++)
	System.out.print(bil[j] + " ");
	System.out.println(" ");
	}

public void bubbleSort(){
	int i, j;
	System.out.print("Data Urutnya adalah : ");
	for(i=0; i<3-1; i++)
		for(j=0; j<3-1; j++)
		if(bil[j+1] < bil[j])
			swap(j, j+1);
	}

private void swap(int a, int b){
	int temp;
	temp = bil[a];
	bil[a] = bil[b];
	bil[b] = temp;
	}
}
