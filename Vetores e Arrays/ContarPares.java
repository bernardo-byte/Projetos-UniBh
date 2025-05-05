import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int pares = 0;
        
        System.out.println("Digite 20 números inteiros:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + pares);
        scanner.close();
    }
}