public class Exercicio08 {
    
    public static int encontrarMaiorElemento(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("A matriz não pode ser nula e deve conter elementos.");
        }

        int maiorElemento = matriz[0][0];

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maiorElemento) {
                    maiorElemento = elemento;
                }
            }
        }

        return maiorElemento;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {3, 7, 1},
            {8, 4, 2},
            {5, 9, 6}
        };

        int maior = encontrarMaiorElemento(matriz);
        System.out.println("8. O maior elemento na matriz é: " + maior);
    }
}
