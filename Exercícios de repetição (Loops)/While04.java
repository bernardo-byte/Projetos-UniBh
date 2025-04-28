public class While04 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int contador = 0;
        
        System.out.println("Os 10 primeiros números da sequência de Fibonacci:");
        
        while (contador < 10) {
            System.out.print(a + (contador < 9 ? ", " : "\n"));
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        }
    }
}