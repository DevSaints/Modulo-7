// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

/*
Enunciado: ctividad: Tomando como base la Actividad #6, se agregará
un nuevo tipo de operación: el cálculo de potencia. Además, se utilizarán
métodos para modularizar el código y se aplicará la recursividad para el
cálculo de la potencia.*/

// importamos la clase Scanner del paquete java.util
import java.util.Scanner;

// Clase principal Main
public class Main {
    // Metodo principal main
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int tipoOperacion = 0;
        while (tipoOperacion != 1 && tipoOperacion != 2) {
            try {
                System.out.println("Ingrese el tipo de operaciones que quiere realizar \n(1) Operaciones Matemáticas multiples \n(2) Cacular Area o Perimetro de Figuras geométricas \n(3) Potencias:");
                tipoOperacion = scanner.nextInt();
            }
            catch (Exception e) {
                System.err.println("Error: Debe ingresar un número entero.");
                scanner.nextLine();
            }
        }
        if (tipoOperacion == 1) {
            new OperacionesMultiples().ejecutar();
        }
        else if (tipoOperacion == 2) {
            new FigurasGeometricas();
        }
        else if (tipoOperacion == 3) {
            new Potencias().ejecutar();
        }

        scanner.close();
    }
}