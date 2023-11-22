import java.util.Scanner;

public class Belanja {
	
	public static void main (String [] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int harga[] = {2500, 3000, 4000, 5000, 6000};
			int barang[] = new int[harga.length];
			System.out.println("Inputkan jumlah barang belanja");
			
			for(int x=0; x<harga.length; x++) {
				System.out.print("Jumlah belanja item ke-" + x + " Rp." + harga[x] + " : ");
				barang[x] = sc.nextInt();
			}
			System.out.println("Daftar belanja dan harga: ");

			int total = 0;
			for(int x=0;x< harga.length; x++) {
				total = harga[x] * barang[x];
				System.out.println("Harga barang ke-" + x + ", Rp." + harga[x] + ", " + barang[x] + " item " + " : " + total);
			}		
			int totalbarang = 0;
			for(int x=0; x< harga.length; x++) {
				totalbarang = totalbarang + barang[x];
			}
			System.out.println("Total item belanja: " + totalbarang);
			
			int totalbelanja = 0;
			for(int x=0; x< harga.length; x++) {
				totalbelanja = totalbelanja + harga[x] * barang[x];
			}
					System.out.println("Total belanja: " + totalbelanja);
		}
	}
}