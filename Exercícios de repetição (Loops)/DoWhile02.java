import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        System.out.println("=== MENU ===");
        
        do {
            System.out.println("\nOpções disponíveis:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("\nAção executada: Item adicionado com sucesso!");
            } 
            else if (opcao == 2) {
                System.out.println("\nAção executada: Item removido com sucesso!");
            } 
            else if (opcao == 3) {
                System.out.println("\nEncerrando o programa...");
            } 
            else {
                System.out.println("\nOpção inválida! Por favor, escolha 1, 2 ou 3.");
            }
            
        } while (opcao != 3); 
        
        scanner.close();
    }
}