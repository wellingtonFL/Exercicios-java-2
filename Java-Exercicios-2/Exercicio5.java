public class Exercicio5 {
    public static int contarVogais(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("O texto não pode ser nulo.");
        }

        int contador = 0;
        for (char caractere : texto.toCharArray()) {
            char caractereLowerCase = Character.toLowerCase(caractere);
            if (caractereLowerCase == 'a' || caractereLowerCase == 'e' || caractereLowerCase == 'i'
                    || caractereLowerCase == 'o' || caractereLowerCase == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String frase = "Exemplo de Contagem de Vogais";
        int vogais = contarVogais(frase);
        System.out.println("5. Número de vogais na frase: " + vogais);
    }
}
