/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Area de un Cuadrado");
        
        System.out.println("2. Area de un Triángulo");
        
        System.out.println("3. Area de un Rectángulo");
        
        System.out.print("Seleccione una opción: ");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Opción no válida solo debe seleccionar "
                        + "1 - 2 - 3.");
        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado: ");
        double lado = entrada.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = entrada.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = entrada.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = entrada.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = entrada.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
