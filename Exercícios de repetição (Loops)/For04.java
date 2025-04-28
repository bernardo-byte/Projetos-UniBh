public class For4 {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 100:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                
                if (i < 99) {
                    System.out.print(", ");
                }
            }
        }
    }
}