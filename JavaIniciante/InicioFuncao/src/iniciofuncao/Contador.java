/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciofuncao;

/**
 *
 * @author caiom
 */
public class Contador {
    public static String operacao(int i, int f){
        String s = "";
        for (int c = i; c <= f ; c++ ){
            s += c + " ";
        }
        return s;
    }
}
