import java.util.Scanner;

public class MaiorValorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        
        int maior = vetor[0];
        int posicao = 0;
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }
        
        System.out.println("O maior valor é " + maior + " na posição " + posicao);
        scanner.close();
    }
}