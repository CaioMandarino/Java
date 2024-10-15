package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Caio", 19, 'M');
        p1.fazerAniver();
        p1.apresentar();
        Livro livro1 = new Livro("One Piece", "Zezon", 100);
        livro1.abrir(p1);
        livro1.folhear(110);
        livro1.detalhe();
 
    }
    
}
