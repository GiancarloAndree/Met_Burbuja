/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Metodo_Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int arreglo[] = null;
        int numer_Elementos;
        int au;
        Scanner in = new Scanner(System.in);
        numer_Elementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de Elementos:"));

        for (int i = 0; i < numer_Elementos; i++) {
            System.out.println((i + 1) + "Digite un numero: ");
        }
        
        
        // metodo de la burbuja
        for (int i = 0; i < (numer_Elementos-1); i++) {
            for (int j = i; j < (numer_Elementos-1); j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    au = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j] = au;

                }

            }
        }
        //En forma creciente
        System.out.println("Mostrar arreglo ordenado: ");
        for (int i = 0; i < numer_Elementos; i++) {

            System.out.print(arreglo[i] + " - ");

        }
    }

}
