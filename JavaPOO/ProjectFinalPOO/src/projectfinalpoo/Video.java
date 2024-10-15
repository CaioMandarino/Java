package projectfinalpoo;
public class Video implements AcoesVideos{
    private String titulo;
    private int view;
    private int curtidas;
    private int avaliacao;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.curtidas = 0;
        this.view = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nota;
        nota = ((this.getAvaliacao() * (this.view - 1) ) + avaliacao)/ this.view;
        this.avaliacao = nota;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);

    }

    @Override
    public void like() {
        this.setCurtidas(getCurtidas()+1);
    }
    
}
