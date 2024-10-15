package aula02;
public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    private boolean tampada;
    protected int carga;
    public void rabisca(){
        if (this.tampada == true){
            System.out.println("ERRO! Caneta tampada.");
        } else {
            System.out.println("Estou Rabiscando!");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("A caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("A ponta da caneta: " + this.ponta);
        System.out.println("Uma carga de " + this.carga + "%");
        System.out.println("Modelo: " + this.modelo);
    }
}

