/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        int[][] resultado = obtenerSuma(informacion, informacion2);
        
        presentarReporte(resultado);
    }

    public static int[][] obtenerSuma(int[][] a, int[][] b) {
        int[][] suma = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        return suma;
    }

    public static void presentarReporte(int[][] matriz) {
        String cadena = "SUMA DE ARREGLOS BIDIMENSIONALES\n";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, matriz[i][j]);
            }
            cadena = String.format("%s\n", cadena); 
        }
        System.out.print(cadena);
    }
}
    

    
