package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Caio", 19, 'M');
        p1.fazerAniver();
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getSexo());
        Aluno p2 = new Aluno("Jose", 19, 'M', "Eng de SoftWare");
        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getSexo());
        System.out.println(p2.getCurso());
    }
    
}
