// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

/*
Enunciado: Tomando como base la Actividad #5, el programa ahora debe permitir al usuario
 realizar múltiples operaciones y almacenar los resultados en un arreglo.
 Además, debe manejar posibles errores de entrada del usuario.*/

import java.util.Scanner;
public class FigurasGeometricas {
    // Atributos
    private double lado;
    private double base;
    private double altura;
    private double radio;
    private double area;
    private double perimetro;
    private double pi = 3.1416;

    // Constructor
    public FigurasGeometricas() {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int tipoFigura = 0;
        while (tipoFigura < 1 || tipoFigura > 3) {
            try {
                System.out.println("Ingrese el tipo de figura geométrica para calcular su área y perímetro: \n(1) Triángulo, \n(2) Cuadrado, \n(3) Círculo \n(4) Rectángulo \n(5) Pentágono");
                tipoFigura = scanner.nextInt();
                if (tipoFigura < 1 || tipoFigura > 3) {
                    System.err.println("Error: Debe ingresar un número entero entre 1 y 3.");
                }
            } catch (Exception e) {
                System.err.println("Error: Debe ingresar un número entero.");
                scanner.nextLine();
            }
        }
        switch (tipoFigura) {
            case 1:
                calcularTriangulo(scanner);
                break;
            case 2:
                calcularCuadrado(scanner);
                break;
            case 3:
                calcularCirculo(scanner);
                break;
            case 4:
                calcularRectangulo(scanner);
                break;
            case 5:
                calcularPentagono(scanner);
                break;
        }
        scanner.close();
    }

    // Métodos
    private void calcularTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base del triángulo: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = scanner.nextDouble();
        area = (base * altura) / 2;
        perimetro = base * 3;
        System.out.println("El área del triángulo es: " + area);
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }

    private void calcularCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        radio = scanner.nextDouble();
        area = pi * radio * radio;
        perimetro = 2 * pi * radio;
        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }

    private void calcularCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = scanner.nextDouble();
        area = lado * lado;
        perimetro = lado * 4;
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }

    private void calcularRectangulo(Scanner scanner) {
        System.out.print("Ingrese la base del rectángulo: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = scanner.nextDouble();
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

    private void calcularPentagono(Scanner scanner) {
        System.out.print("Ingrese el lado del pentágono: ");
        lado = scanner.nextDouble();
        area = (5 * lado * lado) / (4 * Math.tan(Math.PI / 5));
        perimetro = lado * 5;
        System.out.println("El área del pentágono es: " + area);
        System.out.println("El perímetro del pentágono es: " + perimetro);
    }
}


