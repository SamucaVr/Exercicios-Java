// Enunciado: Escreva um programa que percorra um array de inteiros e exiba a soma de seus elementos.

public class ExercicioLacoArray {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5};
        int soma = 0;

        for(int indice = 0; indice < numeros.length; indice++) {
            soma += numeros[indice];
        }
        System.out.println("Resultado da soma do Array: " + soma);
    }
}
