/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] viviendas = obtenerViviendas();
        
        double[][] consumos = obtenerConsumos();
        
        double[] total = obtenerTotal(consumos);
        
        presentarReporte(viviendas, total);
    }

    public static String[] obtenerViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre de la vivienda " + (i+1) + " ");
            viviendas[i] = entrada.nextLine();
        }
        return viviendas;
    }

    public static double[][] obtenerConsumos() {
        Scanner entrada = new Scanner(System.in);
        double[][] matriz = new double[10][12];
        for (int i = 0; i < 10; i++) {
            System.out.println("Registro de consumos para Vivienda " + (i+1) 
                    + " ");
            for (int j = 0; j < 12; j++) {
                System.out.print("  Mes " + (j + 1) + ": ");
                matriz[i][j] = entrada.nextDouble();
            }
        }
        return matriz;
    }

    public static double[] obtenerTotal(double[][] xd) {
        double[] totales = new double[10];
        for (int i = 0; i < 10; i++) {
            double sumaVivienda = 0;
            for (int j = 0; j < 12; j++) {
                sumaVivienda += xd[i][j];
            }
            totales[i] = sumaVivienda;
        }
        return totales;
    }

    public static void presentarReporte(String[] viviendas, double[] totales) {
        String reporte = "REPORTE \n";
        for (int i = 0; i < 10; i++) {
            reporte += "Vivienda: " + viviendas[i] + "  Consumo Total: " + totales[i] + "\n";
        }
        System.out.println(reporte);
    }
}
