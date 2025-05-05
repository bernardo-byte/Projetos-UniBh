import java.util.Scanner;

public class OrdenarVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nVetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}