/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao02;

/**
 *
 * @author caiom
 */
public class CalculoFatorial {
    private String formula = "";
    private int fat = 1;
    public void getValor(int n1){
        String s = "";
        int f = 1;
        for (int c = n1 ; c > 1 ; c--){
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    public String setFomula (){
        return formula;
    }
    public int setFatorial (){
        return fat;
    }
}
