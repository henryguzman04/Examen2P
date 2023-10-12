// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Suma suma = new Suma();

        // Ejemplos de llamadas a los métodos sobrecargados
        System.out.println("Suma de dos enteros: " + suma.sumar(52, 210));
        System.out.println("Suma de tres enteros: " + suma.sumar(26, 36, 65));

        System.out.println("Suma de dos números double: " + suma.sumar(2.5, 3.7));
        System.out.println("Suma de tres números double: " + suma.sumar(1.42, 2.42, 3.34));
    }
    }
