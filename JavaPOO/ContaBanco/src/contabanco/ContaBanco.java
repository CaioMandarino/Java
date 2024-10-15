package contabanco;

public class ContaBanco {

    public static void main(String[] args) {
        Dados c1 = new Dados();
        System.out.println(c1.abrirConta("Caio", "CC"));
        System.out.println(c1.sacar(40));
        System.out.println(c1.pagarMensal());
        
    }
    
}
