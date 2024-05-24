// Enunciado: Escreva um programa que exiba uma tabela de multiplicação de 1 a 10.

public class ExercicioLacoAninhado {
    public static void main(String[] args) {
        for(int numero1 = 1; numero1 <= 10; numero1++) {
            for(int numero2 = 1; numero2 <= 10; numero2++) {
                System.out.println(numero1 + " X " + numero2 + " = " + (numero1 * numero2));
            }
            System.out.println(" ");
        }
    }
}
