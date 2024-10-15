package aula04poo;
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    public Caneta(String m, String c, float p){
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
        this.tampar();
    }
    public void tampar(){
        tampada = true;
    }
    public void destampar(){
        tampada = false;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonto(float f){
        this.ponta = f;
    }
    public void status(){
        System.out.println("Sobre a Caneta:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
