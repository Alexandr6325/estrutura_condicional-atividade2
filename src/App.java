import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();

        if (N % 2 == 1) {
            System.out.println("IMPAR");
        } else {
            System.out.println("PAR");
        }
    }
}
