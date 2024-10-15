package projetolivro;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        setAberto(false);
        setPagAtual(0);   
    }
    public void detalhe(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Paginas: " + this.getTotPaginas());
        System.out.println("Pagina Atual: " + this.getPagAtual());
        System.out.println("Livro aberto? " + this.isAberto());
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    @Override
    public void abrir(Pessoa pessoa) {
        this.setLeitor(pessoa);
        this.setPagAtual(1);
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        if (this.isAberto()){
            this.setPagAtual(0);
            this.setAberto(false);    
        }
        else {
            System.out.println("O livro ja esta fechado");
        }
    }

    @Override
    public void folhear(int p) {
        if(this.isAberto()){
            if(p <= getTotPaginas() && p >= 1){
                setPagAtual(p);
            }
            else{
                System.out.println("Nao foi possivel abrir na pagina " + p + ", o total de paginas eh " + this.getTotPaginas());
            }
        }
        else{
            System.out.println("o livro esta fechado");
        }
        
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()){
            if(this.getPagAtual() < this.getTotPaginas()){
                setPagAtual(getPagAtual()+1);
            }
            else{
                System.out.println("Ja esta na ultima pagina");
            }
        }
        else {
            System.out.println("O livro esta fechado");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){
            if(this.getPagAtual() > 1){
                setPagAtual(getPagAtual()-1);
            }
            else{
                System.out.println("Ja esta na primeira pagina");
            }
        }
        else {
            System.out.println("O livro esta fechado");
        }
    }
    
}
