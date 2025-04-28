import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("Erro: Fatorial não está definido para números negativos.");
            return;
        }
        
        long fatorial = 1; 
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println(numero + "! = " + fatorial);
        
        scanner.close();
    }
}