public class Exercicio07 {
    public static double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double temperaturaCelsius = 25.0;

        double temperaturaFahrenheit = converterCelsiusParaFahrenheit(temperaturaCelsius);

        System.out.println("7. " + temperaturaCelsius + " graus Celsius é equivalente a " +
                           temperaturaFahrenheit + " graus Fahrenheit.");
    }
}
