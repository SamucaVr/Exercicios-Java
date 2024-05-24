import java.util.Scanner;

public class ExercicioSenhaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha = 1234;
        int senhaDigitada = 0;

        while(senhaDigitada != senha) {
            System.out.print("Digite a senha para acessar o sistema: ");
            senhaDigitada = scanner.nextInt();

            if(senhaDigitada != senha) {
                System.out.println("Senha incorreta! Tente novamente");
            }
        }
        System.out.println("Senha Correta! Acesso concedido");
        scanner.close();
    }
}
