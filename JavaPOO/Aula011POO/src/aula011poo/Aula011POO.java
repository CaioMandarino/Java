package aula011poo;
public class Aula011POO {
    public static void main(String[] args) {
        Visitante p1 = new Visitante();
        p1.setNome("Caio");
        p1.setIdade(19);
        p1.setSexo("M");
        System.out.println(p1.toString());
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        a1.pagarMensalidade();
        b1.pagarMensalidade();
    }
    
}
