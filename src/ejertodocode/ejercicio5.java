/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejertodocode;

import java.util.Scanner;

/**
 *
 * @author adesm
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra:");
        String palabra = leer.next();
        while(!palabra.endsWith("salir")){
            System.out.println("Tu palabra es:"+palabra);
            System.out.print("Ingrese una palabra:");
            palabra = leer.next();
        }
        System.out.println("Fin de programa");
    }
}
