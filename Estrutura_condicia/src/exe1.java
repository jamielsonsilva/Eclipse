import java.util.Locale; 
import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num;
		
		num = sc.nextInt();
		
		if(num < 0){
			System.out.println("NEGATIVO");
			System.out.println("JAMIELSON");
			
		}else{
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
	}

}
