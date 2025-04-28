import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        final String SENHA_CORRETA = "4200";  
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            
            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Acesso concedido");
                break;  
            } else {
                System.out.println("Senha incorreta, tente novamente.");
            }
        }
        
        scanner.close();
    }
}