import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;
        
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        
        System.out.println("\nA soma total dos elementos é: " + soma);
        scanner.close();
    }
}