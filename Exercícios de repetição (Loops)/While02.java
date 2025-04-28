import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        System.out.print("Digite um número (negativo para parar): ");
        int numero = scanner.nextInt();
        
        while (numero >= 0) {
            total += numero;
            System.out.print("Digite outro número (negativo para parar): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("Soma dos números positivos: " + total);
        scanner.close();
    }
}