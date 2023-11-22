import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		String kalimat = scanner.nextLine();
		int jumlahPengulangan = scanner.nextInt();
		
        System.out.print("Masukkan kalimat: " +kalimat);	
        System.out.print("Masukkan jumlah pengulangan: " +jumlahPengulangan);
        
		
        int hitung = 0;
        while (hitung < jumlahPengulangan) {
            System.out.println(kalimat);
            hitung++;
        }
    }
}
