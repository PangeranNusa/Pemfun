import java.util.Scanner;
 
public class KonversiNilai{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		char huruf = sc.next().charAt(0);
		double angka;
		
		System.out.println("Nilai huruf " +huruf);
		if (huruf == 'A') {
			angka = 4.0;
			System.out.println("dikonversi menjadi " +angka);
		}
			else if (huruf == 'B') {
			angka = 3.0;
			System.out.println("dikonversi menjadi " +angka);
		}
			else if (huruf == 'C') {
			angka = 2.0;
			System.out.println("dikonversi menjadi " +angka);
		}
			else if (huruf == 'D') {
			angka = 1.0;
			System.out.println("dikonversi menjadi " +angka);
		}
			else if (huruf == 'E') {
			angka = 0;
			System.out.println("dikonversi menjadi " +angka);
		}
		else {
			System.out.println("Maaf, konversi nilai tidak diketahui");
		}
	}
}