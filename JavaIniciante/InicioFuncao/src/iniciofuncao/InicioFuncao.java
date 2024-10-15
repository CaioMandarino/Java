/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iniciofuncao;

/**
 *
 * @author caiom
 */
public class InicioFuncao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        for (int y = x - 1 ; y > 1 ; y-- ){
            x *= y;
        }
        System.out.println(x);
    }
    
}
