package projetopessoas;
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, char sexo, String setor ) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.setTrabalhando(false);
    }
    public void vamoTrabalhar(){
        this.setTrabalhando(true);
    }
    public void canceiVamoParaCasa(){
        this.setTrabalhando(false);
    }
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
