import java.util.Locale;
import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int num1, num2;
	
	System.out.println("Digitar 1-numero");
	num1 = sc.nextInt();
	System.out.println("Digitar 2-numero");
	num2 = sc.nextInt();
	
	if(num1 % num2 <= 0){
		System.out.println("Sao Multiplos");
	}else {
		System.out.println("Nao sao Multiplos");
	} 
	
	sc.next();
	}

}
