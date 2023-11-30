public class Media03{

    public static double calcularMedia(double[] numeros) {
        if (numeros.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.length;
    }

    public static void main(String[] args) {
        double[] lista = { 2.5, 4.0, 6.7, 8.1 };
        double media = calcularMedia(lista);
        System.out.println("3. Média: " + media);
    }
}
