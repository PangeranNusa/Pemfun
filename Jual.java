import java.util.Scanner;

public class Jual {
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int modal = sc.nextInt();
	double persenKeuntungan = sc.nextDouble();
	
	double hargaJual = modal + (modal * persenKeuntungan);
	double profit = hargaJual - modal;
	
	System.out.println(modal);
	System.out.println(hargaJual);
	System.out.println(profit);
	}
}