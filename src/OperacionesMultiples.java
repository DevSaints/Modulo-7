// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

import java.util.Scanner;
public class OperacionesMultiples {
    public void main(String[] args) {
        OperacionesMultiples operacion = new OperacionesMultiples();
        operacion.ejecutar();

    }
    public void ejecutar() {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer la cantidad de operaciones a realizar
        int cantidadOperaciones = 0;
        while (cantidadOperaciones <= 0) {
            try {
                System.out.print("Ingrese la cantidad de operaciones a realizar: ");
                cantidadOperaciones = scanner.nextInt();
                if (cantidadOperaciones <= 0) {
                    System.err.println("Error: Debe ingresar un número entero positivo.");
                }
            } catch (Exception e) {
                System.err.println("Error: Debe ingresar un número entero.");
                scanner.nextLine();
            }
        }

        // Crear un arreglo para almacenar los resultados de las operaciones
        double[] resultados = new double[cantidadOperaciones];
        // Realizar las operaciones
        for (int i = 0; i < cantidadOperaciones; i++) {
            double resultado = 0;
            int operacion = 0;
            while (operacion < 1 || operacion > 4) {
                try {
                    System.out.println("Ingrese el tipo de operación a realizar: \n(1) Suma, \n(2) Resta, \n(3) Multiplicación, \n(4) División, \n(5)Salir");
                    operacion = scanner.nextInt();
                    if (operacion < 1 || operacion > 4) {
                        System.err.println("Error: Debe ingresar un número entero entre 1 y 4.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: Debe ingresar un número entero.");
                    scanner.nextLine();
                }
            }
            double numero1 = 0;
            double numero2 = 0;
            boolean error = false;
            while (!error) {
                try {
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    numero2 = scanner.nextDouble();
                    error = true;
                } catch (Exception e) {
                    System.out.println("Error: Debe ingresar un número.");
                    scanner.nextLine();
                }
            }
            switch (operacion) {
                case 1:
                    resultado = numero1 + numero2;
                    resultados[i] = resultado;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    resultados[i] = resultado;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    resultados[i] = resultado;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        resultados[i] = resultado;
                    } else {
                        System.err.println("Error: No se puede dividir por cero.");
                        i--;
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
            }
            System.out.println("El resultado de la operación es: " + resultado);
            for (int j = 0; j < cantidadOperaciones; j++) {
                System.out.println("_________________________________________");
                System.out.println("El resultado de la operación " + (j + 1) + " es: " + resultados[j]);
            }
        }
        scanner.close();
    }
}