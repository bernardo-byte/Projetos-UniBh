import java.util.Scanner;

public class ContarOcorrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        int contador = 0;
        
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.print("\nDigite o número que deseja contar: ");
        int numeroBuscado = scanner.nextInt();
        
        for (int num : vetor) {
            if (num == numeroBuscado) {
                contador++;
            }
        }
        
        System.out.println("\nO número " + numeroBuscado + " aparece " + contador + " vezes no vetor.");
        
        scanner.close();
    }
}