// Enunciado: Escreva um programa que exiba todos os números pares de 1 a 20.

public class ExercicioFor {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 20; numero++) {
            if(numero % 2 == 1) {
                continue;
            }
            System.out.println(numero);
        }
    }
}
