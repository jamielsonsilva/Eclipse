import java.util.Locale;
import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num =sc.nextInt();
		
		if(num % - 2 == 0){
			System.out.println("Par");
		}else{
			System.out.println("Impar");
		}
		
		sc.close();
	}

}
