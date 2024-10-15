package aula011poo;
public class Bolsista extends Aluno{
    private int bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade do Bolsista"); 
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
