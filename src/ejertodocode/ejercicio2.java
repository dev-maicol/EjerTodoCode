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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el limite:");
        int n = leer.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
