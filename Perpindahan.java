public class Perpindahan{
	public static void main(String[] args0) {
		int A = 33;
		int B = 55;
		
		//Sebelum Perpindahan
		System.out.println("Sebelum Perpindahan");
		System.out.println("A = " +A);
		System.out.println("B = " +B);
		System.out.println(" ");
		
		int C;
		C = A;
		A = B;
		B = C;
		
		//Sesudah Perpindahan
		System.out.println("Sesudah Perpindahan");
		System.out.println("A = " +A);
		System.out.println("B = " +B);
	}
}