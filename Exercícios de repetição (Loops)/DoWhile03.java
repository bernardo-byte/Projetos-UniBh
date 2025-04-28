import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroSorteado = (int)(System.currentTimeMillis() % 20) + 1;
        int tentativas = 0;
        int palpite;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 20.");
        
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é MAIOR que " + palpite);
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é MENOR que " + palpite);
            }
        } while (palpite != numeroSorteado);
        
        System.out.println("\nParabéns! Você acertou o número " + numeroSorteado + 
                         " em " + tentativas + " tentativas!");
        
        scanner.close();
    }
}