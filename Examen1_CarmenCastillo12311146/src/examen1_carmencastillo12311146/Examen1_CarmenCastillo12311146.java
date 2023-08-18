/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_carmencastillo12311146;

import java.util.Scanner;

/**
 *
 * @author casti
 */
public class Examen1_CarmenCastillo12311146 {

    static Scanner sc = new Scanner(System.in);
    static Scanner leer = new Scanner(System.in, "ISO-8859-1");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean seguirmenu = true;
        while (seguirmenu) {
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1. Ejercicio de Palabras.");
            System.out.println("2. Salir.");
            System.out.print("Ingrese su opcion: ");
            int opcionmenu = sc.nextInt();
            System.out.println("");

            switch (opcionmenu) {

                case 1:
                    System.out.println("Opción 1 [Ejercicio de Palabras]");
                    System.out.print("Ingrese su primera palabra: ");
                    String palabra1 = leer.nextLine().toLowerCase();
                    System.out.print("Ingrese su segunda palabra: ");
                    String palabra2 = leer.nextLine().toLowerCase();

                    dosCadenas(palabra1, palabra2);

                    break;

                default:
                    seguirmenu = false;

            }

        }

    }

    public static String dosCadenas(String cadena1, String cadena2) {
        String cadenafinal = "";
        if (cadena1.equals(cadena2)) {
            for (int i = cadena1.length()-1; i >= 0; i--) {
                cadenafinal += cadena1.charAt(i);
            }
            System.out.println(cadena1+cadenafinal);

        } else if (cadena1.length() == cadena2.length()) {

            for (int i = 0; i < cadena1.length(); i++) {
                cadenafinal += cadena1.charAt(i);
                cadenafinal += cadena2.charAt(i);
            }
            
            System.out.println(cadenafinal);

        } else {

            cadenafinal = cadena1.concat(cadena2);
            System.out.println(cadenafinal);

        }

        return cadenafinal;

    }

}
