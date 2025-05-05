import java.util.Scanner;

public class RemoverElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {5, 2, 8, 10, 3, 7, 2, 9, 4, 6};
        int[] novoVetor = new int[9];
        boolean encontrado = false;
        
        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        
        System.out.print("\n\nDigite o número a ser removido: ");
        int numero = scanner.nextInt();
        
        int indiceRemocao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero && !encontrado) {
                indiceRemocao = i;
                encontrado = true;
            }
        }
        
        if (encontrado) {
            int j = 0;
            for (int i = 0; i < vetor.length; i++) {
                if (i != indiceRemocao) {
                    novoVetor[j] = vetor[i];
                    j++;
                }
            }
            
            System.out.println("\nVetor após remoção:");
            for (int num : novoVetor) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("\nNúmero não encontrado no vetor.");
        }
        
        scanner.close();
    }
}