import java.util.Scanner;

public class DoWhile04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaNotas = 0;
        int quantidadeNotas = 0;
        char continuar = 's'; 
        
        System.out.println("Calculadora de Média de Notas");
        System.out.println("Insira notas entre 0 e 10");
        
        do {
            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                continue;
            }
            
            somaNotas += nota;
            quantidadeNotas++;
            
            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scanner.next().charAt(0);
            
        } while (continuar == 's' || continuar == 'S');
        
        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.printf("\nMédia das notas: %.2f%n", media);
            System.out.println("Quantidade de notas inseridas: " + quantidadeNotas);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
        
        scanner.close();
    }
}