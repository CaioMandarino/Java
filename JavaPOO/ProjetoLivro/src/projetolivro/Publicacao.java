package projetolivro;
public interface Publicacao {
    public abstract void abrir(Pessoa pessoa);
    public abstract void fechar();
    public abstract void folhear(int p);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
