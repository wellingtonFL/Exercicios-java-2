public class Exercicio10 {
    public static void ordenarCrescente(int[] array) {
        if (array == null || array.length <= 1) {
            // Nada a fazer se o array for nulo ou já estiver ordenado
            return;
        }

        boolean trocaRealizada;

        do {
            trocaRealizada = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocaRealizada = true;
                }
            }

        } while (trocaRealizada);
    }

    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 3};

        System.out.println("Array antes da ordenação: " + java.util.Arrays.toString(numeros));
        ordenarCrescente(numeros);
        System.out.println("Array após a ordenação crescente: " + java.util.Arrays.toString(numeros));
    }
}
