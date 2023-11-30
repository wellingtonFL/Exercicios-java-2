public class Exercicio4 {

    public static long fatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O fatorial não está definido para números negativos.");
        }
        
        if (numero == 0 || numero == 1) {
            return 1;
        }

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int num = 5;
        long resultadoFatorial = fatorial(num);
        System.out.println("4. Fatorial de " + num + ": " + resultadoFatorial);
    }
}
