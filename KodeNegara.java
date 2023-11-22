import java.util.Scanner;
 
public class KodeNegara{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String kodeNegara = sc.nextLine();
		String namaNegara;
		
		System.out.println("Masukkan kodeNegara " +kodeNegara);
		switch (kodeNegara) {
			case "ES":
				namaNegara = "Spain";
				System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
				break;
			case "TN":
				namaNegara = "Tunisia";
				System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
				break;
			case "ID":
				namaNegara = "Indonesia";
				System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
				break;
			case "MM":
				namaNegara = "Myanmar";
				System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
				break;
			case "IN":
				namaNegara = "India";
				System.out.println("Kode negara diketahui "+kodeNegara+" = "+namaNegara);
				break;
			default: 
				System.out.println( "Maaf, kode negara Tidak Diketahui");
		}
	}
}