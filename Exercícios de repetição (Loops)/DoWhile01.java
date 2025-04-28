import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número entre 1 e 100:");
        
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            
            if (numero < 1 || numero > 100) {
                System.out.println("O número deve estar entre 1 e 100.");
            }
        } while (numero < 1 || numero > 100);
        
        System.out.println("Número validado: " + numero);
        scanner.close();
    }
}