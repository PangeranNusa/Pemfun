import java.util.Scanner;
 
public class KonversiKode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String kodeNegara = sc.nextLine();
		String namaNegara;
		
		System.out.println("Masukkan kodeNegara " +kodeNegara);
		
		if (kodeNegara.equals("ES")) {
			namaNegara = "Spain";
			System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
		}
			else if (kodeNegara.equals("TN")) {
			namaNegara = "Tunisia";
			System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
		}
			else if (kodeNegara.equals("ID")) {
			namaNegara = "Indonesia";
			System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
		}
			else if (kodeNegara.equals("MM")) {
			namaNegara = "Myanmar";
			System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
		}
			else if (kodeNegara.equals("IN")) {
			namaNegara = "India";
			System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
		}
			else {
			System.out.println( "Maaf, kode negara Tidak Diketahui");
		}
	}
}