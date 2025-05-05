import java.util.Scanner;
import java.util.ArrayList;

public class ElementosComuns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[6];
        int[] vetorB = new int[6];
        ArrayList<Integer> comuns = new ArrayList<>();
        
        System.out.println("Digite os elementos do primeiro vetor (6 números):");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("VetorA[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }
        
        System.out.println("\nDigite os elementos do segundo vetor (6 números):");
        for (int i =  ͏0; i < vetorB.length; i++) {
            System.out.print("VetorB[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j] && !comuns.contains(vetorA[i])) {
                    comuns.add(vetorA[i]);
                }
            }
        }
        
        System.out.println("\nElementos comuns aos dois vetores:");
        for (int num : comuns) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}