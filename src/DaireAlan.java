import java.util.Scanner;

public class DaireAlan {

	public static void main(String[] args) {
		
		
		int r;
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dairenin Yaricapi: ");
		r = scanner.nextInt();
		double alan = pi * r * r;
		double cevre = 2 * pi * r;
		
		System.out.println("Dairenizin Alani: " + alan);
		System.out.println("Dairenizin Cevresi: " + cevre);

	}

}
