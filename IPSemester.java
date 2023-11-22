import java.util.Scanner;

public class IPSemester{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matkul1 = sc.nextInt();
		int matkul2 = sc.nextInt();
		int matkul3 = sc.nextInt();
		int matkul4 = sc.nextInt();
		
		//masukkan nilai-nilai pada 4 mata kuliah
		System.out.println("Pemrograman Fundamental= " +matkul1);
		System.out.println("Sistem Digital= " +matkul2);
		System.out.println("Kalkulus= " +matkul3);
		System.out.println("Aqidah Akhlak= " +matkul4);
		
		double IP = (matkul1 + matkul2 + matkul3 + matkul4) /4.0 /25.0;
		System.out.println("IP Anda saat ini Adalah " +IP);
		
		if (IP >= 3.0 && IP <= 4.0) {
		System.out.println("Selamat atas kerja keras anda!");
		} else if (IP >= 2.0 && IP <= 2.9) {
		System.out.println("Tingkatkan lagi ya!");
		} else if ( IP < 2.0) {
		System.out.println("Nice try kawan");
		} 
	}
}