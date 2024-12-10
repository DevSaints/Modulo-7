import java.util.Scanner;

public class Potencias {
    public static void main(String[] args) {
        Potencias potencias = new Potencias();
        potencias.ejecutar();
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        double base = 0;
        int exponente = 0;
        boolean entradaValida = false;

        // Solicitar la base de la potencia
        while (!entradaValida) {
            try {
                System.out.print("Ingrese la base de la potencia: ");
                base = scanner.nextDouble();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }

        entradaValida = false;

        // Solicitar el exponente de la potencia
        while (!entradaValida) {
            try {
                System.out.print("Ingrese el exponente de la potencia: ");
                exponente = scanner.nextInt();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }

        // Calcular la potencia utilizando recursividad
        double resultado = calcularPotencia(base, exponente);

        // Mostrar el resultado
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);

        scanner.close();
    }

    // Metodo recursivo para calcular la potencia
    public double calcularPotencia(double base, int exponente) {
        // Caso base: cualquier número elevado a la 0 es 1
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo: multiplicar la base por la potencia de la base con el exponente decrementado
        return base * calcularPotencia(base, exponente - 1);
    }
}
