package linguagemdosistema;

import java.util.Locale;

public class LinguagemDoSistema {


    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        String lingua = loc.getDisplayLanguage();
        System.out.println("O seu sistema esta em: " + lingua);
    }
    
}
