public class Exercicio09 {
    
    public static boolean ehPalindromo(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("A string não pode ser nula.");
        }

        // Remover espaços e tornar minúsculas as letras para melhor verificação
        String textoFormatado = texto.replaceAll("\\s", "").toLowerCase();

        int inicio = 0;
        int fim = textoFormatado.length() - 1;

        while (inicio < fim) {
            if (textoFormatado.charAt(inicio) != textoFormatado.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palavra = "arara";

        boolean resultado = ehPalindromo(palavra);
        System.out.println("9. A palavra \"" + palavra + "\" é um palíndromo? " + resultado);
    }
}
