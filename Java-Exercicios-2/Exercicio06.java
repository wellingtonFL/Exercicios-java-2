public class Exercicio06 {
    public static void trocarValores(int[] numeros) {
        if (numeros == null || numeros.length != 2) {
            throw new IllegalArgumentException("O array deve conter exatamente dois elementos.");
        }

        int temp = numeros[0];
        numeros[0] = numeros[1];
        numeros[1] = temp;
    }

    public static void main(String[] args) {
        int[] valores = { 5, 10 };

        System.out.println("Valores antes da troca: " + valores[0] + ", " + valores[1]);
        trocarValores(valores);
        System.out.println("Valores após a troca: " + valores[0] + ", " + valores[1]);
    }
}
