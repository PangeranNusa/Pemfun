import java.util.Scanner;

public class MenghitungBilangan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan angka yang diinginkan: ");
		int angka = sc.nextInt();
		
		if(angka > 0){
		System.out.println(angka+ " adalah angka bilangan positif");
		}
		else if (angka < 0){
		System.out.println(angka+ " adalah angka bilangan negatif");
		}
		else {
		System.out.println(angka+ " adalah angka nol");
		}
	}
}