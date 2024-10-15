
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Toolkit info = Toolkit.getDefaultToolkit();
        Dimension resolucao = info.getScreenSize();
        int comprimento = resolucao.width;
        int altura = resolucao.height;
        System.out.println("A resolução da tela é: " + comprimento + "x" + altura);
    }   
}
