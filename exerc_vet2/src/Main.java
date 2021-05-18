import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] vet = new int[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		System.out.println();
		
		int qtdePares = 0;
		
		for (int i=0; i<N; i++) {
			if (vet[i] % 2 == 0) {
				qtdePares++;
			}
		}
		System.out.println(qtdePares);
		sc.close();

	}

}
