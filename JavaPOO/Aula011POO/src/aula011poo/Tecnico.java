package aula011poo;
public final class Tecnico extends Aluno{
    private String registroProficional;
    public void praticar(){
        System.out.println("Trabalhando...");
    }

    public String getRegistroProficional() {
        return registroProficional;
    }

    public void setRegistroProficional(String registroProficional) {
        this.registroProficional = registroProficional;
    }
    
}
