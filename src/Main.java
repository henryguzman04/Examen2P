public class Main {
    public static void main(String[] args) {
        Suma suma = new Suma();

        // Ejemplos de llamadas a los métodos sobrecargados
        System.out.println("Suma de dos numeros enteros enteros: " + suma.suma_e(52, 210));
        System.out.println("------------------------------------------");
        System.out.println("Suma de tres enteros enteros: " + suma.suma_e(26, 36, 65));
        System.out.println("------------------------------------------");
        System.out.println("Suma de dos números enteros  double: " + suma.suma_d(2.5, 3.7));
        System.out.println("------------------------------------------");
        System.out.println("Suma de tres números enteros  double: " + suma.suma_d(1.42, 2.42, 3.34));
    }
    }
