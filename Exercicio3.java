import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite seu salário: ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        do {
            System.out.print("Digite seu sexo (f/m): ");
            sexo = scanner.next();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.print("Digite seu estado civil (s/c/v/d): ");
            estadoCivil = scanner.next();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("\nInformações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}
