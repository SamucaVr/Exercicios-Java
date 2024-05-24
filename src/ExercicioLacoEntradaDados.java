// Enunciado: Escreva um programa que leia 5 números inteiros do usuário e exiba o maior deles.

import java.util.Scanner;

public class ExercicioLacoEntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int maiorNumero = 0;

        for(int indice = 0; indice <= 5; indice++) {
            System.out.print("Digite um número: ");
            numeroDigitado = scanner.nextInt();
            
            if(numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }
        }

        System.out.println("Esse foi o maior número digitado: " + maiorNumero);
        scanner.close();
    }   
}
