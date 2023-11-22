import java.util.Scanner;
   
class DiskonBelanja {
  public static void main(String args[]){
            
    Scanner sc = new Scanner(System.in);
     
    System.out.print("Total Belanja: Rp.");
    int totalBelanja = sc.nextInt();
	double hargaAkhir;
     
    if (totalBelanja >= 50000 && totalBelanja < 100000) {
      hargaAkhir = totalBelanja - (0.1*totalBelanja);
      System.out.println("Selamat, anda mendapat diskon 10%");
    }
    else if (totalBelanja >= 100000 && totalBelanja < 500000) {
      hargaAkhir = totalBelanja - (0.2*totalBelanja);
      System.out.println("Selamat, anda mendapat diskon 20%");
    }
    else if (totalBelanja >= 500000 && totalBelanja < 1000000) {
      hargaAkhir = totalBelanja - (0.3*totalBelanja);
      System.out.println("Selamat, anda mendapat diskon 30%");
    }
	else if (totalBelanja >= 1000000) {
	  hargaAkhir = totalBelanja - (0.5*totalBelanja);
	  System.out.println("Selamat, anda mendapat diskon 50%");
	}
    else {
      hargaAkhir = totalBelanja;
    }
  
	System.out.println("Total bayar: Rp."+ hargaAkhir);
  }
}