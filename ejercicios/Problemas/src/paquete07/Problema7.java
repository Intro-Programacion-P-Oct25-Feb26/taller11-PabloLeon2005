/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
    
    public static void main(String[] args) {
        String[] listaCiudades = obtenerCiudades();

        presentarCiudadesFiltradas(listaCiudades);
    }


    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el número de ciudades a registrar: ");
        int n = entrada.nextInt();
        entrada.nextLine(); 
        
        String[] ciudades = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre de la ciudad " + (i + 1) + ": ");
            ciudades[i] = entrada.nextLine();
        }
        
        return ciudades;
    }

    public static void presentarCiudadesFiltradas(String[] datos) {
        String reporte = "\n CIUDADES FILTRADAS (4 o 5 CARACTERES) \n";
        boolean encontro = false;

        for (int i = 0; i < datos.length; i++) {
            int longitud = datos[i].length();
            
            if (longitud == 4 || longitud == 5) {
                reporte = String.format("%s- %s (Letras: %d)\n", 
                        reporte, datos[i], longitud);
                encontro = true;
            }
        }

        if (!encontro) {
            reporte += "No se encontraron ciudades con esa longitud.";
        }

        System.out.println(reporte);
    }
}
    

