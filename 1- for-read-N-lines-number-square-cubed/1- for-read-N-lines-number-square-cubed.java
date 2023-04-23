import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Digite um valor");
		int N = sc.nextInt();
		
		for (int i=0; i<=N; i++) {			
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}

       sc.close();
    }
}
