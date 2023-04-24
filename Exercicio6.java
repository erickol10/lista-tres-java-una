import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Os números no intervalo de " + numero1 + " e " + numero2 + " são:");
        for (int i = numero1; i <= numero2; i++) {
            System.out.print(i + " ");
        }
    }
}
