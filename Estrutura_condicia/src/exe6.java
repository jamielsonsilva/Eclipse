import java.util.Locale;
import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double val;
		
		val = sc.nextDouble();
		
		if(val >= 0 && val <= 25){
			System.out.println("Intervalo [0,25]");
		}else if(val >= 25 && val <= 50){
			System.out.println("Intervalo (25,50]");
		}else if(val >= 50 && val <= 75){
			System.out.println("Intervalo (50,75)");
		}else if(val >= 75 && val <= 100){
			System.out.println("Intervalo (75,100]");
		}else{
			System.out.println("Fora de Intervalo");
		} 
		
		sc.close();
		
	}

}
