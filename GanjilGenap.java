import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
        System.out.println("Masukan Bilangan = ");
        int angka=sc.nextInt();
        
        if (angka%2==0){
            System.out.println("Bilangan "+angka+" adalah bilangan genap");
        }else {
             System.out.println("Bilangan "+angka+" adalah bilangan ganjil");
        }
  }
}