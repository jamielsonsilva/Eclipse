import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int hini, hfin, durac;
		
		hini = sc.nextInt();
		hfin = sc.nextInt();
		
		
		
		if(hini < hfin ) {
		    durac = hini - hfin;
			System.out.printf("%d",durac);
		}else {
			durac = 24 - hini + hfin;
		}
		
		System.out.println(durac);
		
		sc.close();

	}

}
