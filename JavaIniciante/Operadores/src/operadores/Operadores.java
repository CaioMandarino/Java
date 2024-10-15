/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author caiom
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        int x;
        System.out.println("Digite sua idade: ");
        x = tecl.nextInt();
        if ( 16 > x ) {
            System.out.println("Proibido Votar!");
        }
        else if ((x >= 16) && (x <= 18) || (x > 70)){
            System.out.println("Opcional Votar!");
        }
        else {
            System.out.println("Obrigatorio Votar!");
        }
    }
}
