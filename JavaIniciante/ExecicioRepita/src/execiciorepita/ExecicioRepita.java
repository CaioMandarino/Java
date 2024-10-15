/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execiciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author caiom
 */
public class ExecicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, par = 0, impar = 0, total = 0, maiorq100 = 0, soma = 0;
        float media;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe o valor<br>(0 Interrompe)</html>", "Entrada de Valores", JOptionPane.INFORMATION_MESSAGE));
            if ( x == 0) break;
            total++;
            if ( x % 2 == 0){
                par++;
            }
            else {
                impar++;
            }
            if ( x > 100){
                maiorq100++;
            }
            soma += x; 
        } while (x != 0);
        media = (float) soma/total;
        JOptionPane.showMessageDialog(null, "<html>Resultados:<hr>Total de valores: "+ total + "<br>Total de Pares: " + par + "<br>Total de Impares: " + impar + "<br>Acima de 100: " + maiorq100 + "<br>Media dos Valores: " + media + " </html>", "Entrada de Valores", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
