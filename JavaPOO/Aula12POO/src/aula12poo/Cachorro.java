package aula12poo;
public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Feliz");
        }
        else{
            System.out.println("Bravo");
        }
    }
    public void reagir(String frase){
        if(frase.equals("Vamos brincar")){
            System.out.println("Feliz e Pula");
        }
        else{
            System.out.println("Bravo");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("agitado");
        }
        else if(hora >= 18){
            System.out.println("cansado");
        }
        else {
            System.out.println("normal");
        }
    }
    public void reagir(int idade, float peso){
        
    }
}
