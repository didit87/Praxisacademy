
 
import java.util.Scanner;

public class LuasSegitiga{


public static void main(String[] args) {

//deklarasi 

	Double luas;
	int alas, tinggi; 


//buat scanner baru 

	Scanner baca = new Scanner(System.in);

//input 

	System.out.println("==program hitung luas segitiga ==");
	System.out.print("input alas:  ");
	alas = baca.nextint();
	System.out.print("input tinggi:  ");
	tinggi = baca.nextint();

//proses
	luas = Double.ValueOf((alas * tinggi) / 2 );

	//outputnya 

	System.out.println("luas = "+luas);


}

}