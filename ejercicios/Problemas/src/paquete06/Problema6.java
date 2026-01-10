/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
    

    public static void main(String[] args) {
        
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double media = obtenerMedia(informacion);

        double desviacion = obtenerDesviacion(informacion, media);

        System.out.printf("Media Aritmética: %.2f\n", media);
        System.out.printf("Desviación Estándar: %.2f\n", desviacion);
    }

    public static double obtenerMedia(int[] datos) {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        return suma / datos.length;
    }

    public static double obtenerDesviacion(int[] datos, double media) {
        double sumaDiferencias = 0;
        
        for (int i = 0; i < datos.length; i++) {
            sumaDiferencias = sumaDiferencias + Math.pow(datos[i] - media, 2);
        }
        
        double total = sumaDiferencias / datos.length;
        return Math.sqrt(total);
    }
}
    
