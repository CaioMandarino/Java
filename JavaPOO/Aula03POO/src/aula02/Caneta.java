package aula02;
public class Caneta {
    String cor;
    String modelo;
    float ponta;
    boolean tampada;
    int carga;
    void rabisca(){
        if (this.tampada == true){
            System.out.println("ERRO! Caneta tampada.");
        } else {
            System.out.println("Estou Rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void status(){
        System.out.print("A caneta " + this.cor);
        System.out.println(" está tampada? " + this.tampada);
        System.out.println("A ponta da caneta: " + this.ponta);
        System.out.println("Uma carga de " + this.carga + "%");
        System.out.println("Modelo: " + this.modelo);
    }
}
