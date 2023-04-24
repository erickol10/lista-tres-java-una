import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("A senha não pode ser igual ao nome de usuário. Tente novamente.");
            }
        } while (senha.equals(usuario));

        System.out.println("Usuário e senha cadastrados com sucesso!");
    }
}
