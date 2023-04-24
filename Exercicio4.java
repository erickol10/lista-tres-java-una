import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}
