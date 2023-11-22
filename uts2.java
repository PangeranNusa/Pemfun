import java.util.Scanner;

	public class uts2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		int item0 = 2500;
		int item1 = 3000;
		int item2 = 4000;
		int item3 = 5000;
		int item4 = 6000;
		
		int belanja0 = sc.nextInt();
		int belanja1 = sc.nextInt();
		int belanja2 = sc.nextInt();
		int belanja3 = sc.nextInt();
		int belanja4 = sc.nextInt();
		
		System.out.println("Jumlah belanja list-0 Rp.2500: " +belanja0);
		System.out.println("Jumlah belanja list-1 Rp.3000: " +belanja1);
		System.out.println("Jumlah belanja list-2 Rp.4000: " +belanja2);
		System.out.println("Jumlah belanja list-3 Rp.5000: " +belanja3);
		System.out.println("Jumlah belanja list-4 Rp.6000: " +belanja4);
		
		int harga0 = item0 * belanja0;
		int harga1 = item1 * belanja1;
		int harga2 = item2 * belanja2;
		int harga3 = item3 * belanja3;
		int harga4 = item4 * belanja4;
		
		System.out.println("Daftar belanja dan harga:");
		System.out.println("Harga barang ke-0, " +belanja0+ " item : " +harga0);
		System.out.println("Harga barang ke-1, " +belanja1+ " item : " +harga1);
		System.out.println("Harga barang ke-2, " +belanja2+ " item : " +harga2);
		System.out.println("Harga barang ke-3, " +belanja3+ " item : " +harga3);
		System.out.println("Harga barang ke-4, " +belanja4+ " item : " +harga4);
		
		int totalItem = belanja0 + belanja1 + belanja2 + belanja3 + belanja4;
		System.out.println("Total item belanja: " +totalItem);
		
		int totalBelanja = harga0 + harga1 + harga2 + harga3 + harga4;
		System.out.println("Total Belanja: " +totalBelanja);
	}
}