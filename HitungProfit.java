import java.util.Scanner;
 
public class HitungProfit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int modal = sc.nextInt();
		double PersenKeuntungan = sc.nextDouble();
		double profit = modal + (modal * PersenKeuntungan);
		
		System.out.println(modal);
		System.out.println(PersenKeuntungan);
		System.out.println(profit);
	}
}