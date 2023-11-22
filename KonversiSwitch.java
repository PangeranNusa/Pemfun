import java.util.Scanner;
 
public class KonversiSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		char huruf = sc.next().charAt(0);
		double angka;
		
		System.out.println("Nilai huruf " +huruf);
		switch (huruf) {
			case 'A':
				angka = 4.0;
				System.out.println("dikonversi menjadi " +angka);
				break;
			case 'B':
				angka = 3.0;
				System.out.println("dikonversi menjadi " +angka);
				break;
			case 'C':
				angka = 2.0;
				System.out.println("dikonversi menjadi " +angka);
				break;
			case 'D':
				angka = 1.0;
				System.out.println("dikonversi menjadi " +angka);
				break;
			case 'E':
				angka = 0;
				System.out.println("dikonversi menjadi " +angka);
				break;
			default: 
				System.out.println("Maaf, konversi nilai tidak diketahui");
		}
	}
}