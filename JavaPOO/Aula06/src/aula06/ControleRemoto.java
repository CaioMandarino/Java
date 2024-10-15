package aula06;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 1; i <= this.getVolume(); i+= 10){
                System.out.print("|");
            }
            System.out.println("");
        } 
        else {
            System.out.println("Impossivel abrir o menu");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
            System.out.println("Fechando Menu...");    
        }
        else {
            System.out.println("Impossivel fechar o menu");
        }
        
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() < 100){
            this.setVolume(getVolume() + 1);
        }
        else {
            System.out.println("Nao foi possivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(getVolume() - 1);
        }
        else {
            System.out.println("Nao foi possivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() != 0){
            this.setVolume(0);
        } 
        else {
            System.out.println("Nao foi possivel colocar no mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume()== 0){
            this.setVolume(50);
        }
        else {
            System.out.println("Nao foi possivel tirar do mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
        else {
            System.out.println("Nao foi possivel reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        else {
            System.out.println("Nao foi possivel pausar");
        }
    }
    
    
}
