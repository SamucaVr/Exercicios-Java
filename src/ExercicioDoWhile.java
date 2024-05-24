import java.util.Scanner;

/*
 * Enunciado: Escreva um programa que peça ao usuário para digitar números até que ele digite 0.
 * Ao final, exiba a soma dos números digitados.
 */

public class ExercicioDoWhile {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.println("Digite um número ([0] para sair): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.printf("Resultado da soma dos números digitados = %d", soma);
        scanner.close();
    }
}
