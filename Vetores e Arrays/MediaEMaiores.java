import java.util.Scanner;

public class MediaEMaiores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[12];
        double soma = 0;
        int acimaMedia = 0;
        
        System.out.println("Digite 12 números:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }
        
        double media = soma / numeros.length;
        
        for (double num : numeros) {
            if (num > media) {
                acimaMedia++;
            }
        }
        
        System.out.printf("\nMédia dos valores: %.2f", media);
        System.out.println("\nQuantidade de elementos acima da média: " + acimaMedia);
        
        scanner.close();
    }
}