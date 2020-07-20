import java.util.Locale;
import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod,quat;
		double tot;
	    double p1 = 4.00; 
	    double p2 = 4.50; 
	    double p3 = 5.00;
	    double p4 = 2.00;
	    double p5 = 1.50;
		
		cod = sc.nextInt();
		quat = sc.nextInt();
		
		if(cod == 1) {
			tot = (double) (p1 * quat); 
		System.out.printf("Total: %.2f%n",tot);
		}else if(cod == 2) {
			tot = (double) (p2 * quat); 
		System.out.printf("Total: %.2f%n",tot);
		}else if(cod == 3) {
			tot = (double) (p3 * quat); 
		System.out.printf("Total: %.2f%n",tot);
		}else if(cod == 4) {
			tot = (double) (p4 * quat); 
		System.out.printf("Total: %.2f%n",tot);
		}else if(cod == 5) {
			tot = (double) (p5 * quat); 
		System.out.printf("Total: %.2f%n",tot);
		}
		
		
     sc.close();
	}

}
