import java.util.Locale;
import java.util.Scanner;

public class exe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorb, result;
		
		valorb = sc.nextDouble();
				
		if(valorb > 0.00 && valorb <= 2000.00){
			System.out.println("Isento");
		}
		else if(valorb >= 2001.00 && valorb <= 3000.00){
			result = (valorb - 2000.01) * 0.08;
			System.out.printf("R$ %.2f%n",result);
		}
		else if(valorb >= 3000.01 && valorb <= 4500.00){
			result = (valorb - 3000.01) * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n",result);
		}
		else if(valorb >= 4500.00){
			result = (valorb - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n",result);
		}
		
		sc.close();
	}

}
