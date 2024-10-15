/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author caiom
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = {1, 4, 3, 2, 1};
        int aux;
        for (int c = 0; c < v.length; c++){
            for (int j = c + 1 ; j < v.length; j++ ){
                if ( v[c] > v[j] ){
                    aux = v[c];
                    v[c] = v[j];
                    v[j] = aux;
                }
            }
        }
        for (int c : v){
            System.out.println(c);
        }
        //int p = Arrays.binarySearch(v, 1);
        //System.out.println(p);
    }
    
}
