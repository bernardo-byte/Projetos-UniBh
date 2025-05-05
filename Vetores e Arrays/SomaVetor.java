public class SomaVetor {
    public static void main(String[] args) {
        int[] vetor = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        
        int soma = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}