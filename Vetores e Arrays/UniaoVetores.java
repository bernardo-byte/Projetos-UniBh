import java.util.Scanner;

public class UniaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }
        
        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            C[i] = A[i];
            C[i + 5] = B[i];
        }
        
        System.out.println("\nVetor C (união de A e B):");
        for (int num : C) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}