/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = entrada.nextLine();

        System.out.println("\n MENÚ DE SERVICIOS ");
        System.out.println("1. Calcular Valor de Planilla de Luz");
        System.out.println("2. Calcular Valor de Predio");
        System.out.print("Seleccione una opción: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                calcularValorLuz(nombre, cedula);
                break;
            case 2:
                calcularPredio(nombre, cedula);
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    public static void calcularValorLuz(String cliente, String id) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor del kilovatio: ");
        double valorKw = entrada.nextDouble();
        System.out.print("Ingrese el número de kilovatios consumidos al mes: ");
        double numKw = entrada.nextDouble();

        double totalLuz = valorKw * numKw;

        String reporte = String.format("Cliente %s con cédula %s debe cancelar el valor de $%.2f",
                cliente, id, totalLuz);

        System.out.println("\n" + reporte);
    }

    public static void calcularPredio(String cliente, String id) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor del bien inmueble: ");
        double valorInmueble = entrada.nextDouble();

        double valorPredio = valorInmueble * 0.02;

        String reporte = "Cliente " + cliente + " con cédula " + id
                + " tiene un bien inmueble valorado en $" + valorInmueble
                + " y tiene que pagar de predio $" + valorPredio;

        System.out.println("\n" + reporte);
    }
}
