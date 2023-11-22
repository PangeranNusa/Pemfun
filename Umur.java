import java.util.Scanner;
 
public class Umur{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Tahun Sekarang: ");
		int tahunSekarang = sc.nextInt();
		
        System.out.print("Masukan Tahun Lahir: ");
        int tahunLahir = sc.nextInt();
		
        int umur = tahunSekarang - tahunLahir;
		System.out.println();
        System.out.println("Umur Kamu adalah " + umur + " Tahun");
    }
}