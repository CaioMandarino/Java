package projetopessoas;
public class Aluno extends Pessoa{
    private boolean matriculado;
    private String curso;

    public Aluno(String nome, int idade, char sexo, String curso) {
        super(nome, idade, sexo);
        this.curso = curso;
        this.setMatriculado(true);
    }
    
    public void cancelarMatricula(){
        this.setMatriculado(false);
        this.setCurso(null);
    }
    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
 
}
