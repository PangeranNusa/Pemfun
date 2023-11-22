import java.io.*;

public class HelloWorld {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		BufferedReader bfn;
		String phi = bfn.readLine();
		String r = bfn.readLine();
      
       double phi = 3.14;
      int r = Integer.parseInt(null);
		double luas = phi * r * r;
		
		System.out.println("Luas Lingkaran" +luas);
		
        
    }
}