package uec;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds; 
    private boolean valida;
    public Luta(){
        this.setValida(false);
        this.setRounds(0);
        this.setDesafiado(null);
        this.setDesafiante(null);
    }
    public void marcarLuta(Lutador l1,Lutador l2, int ro){
        if ((l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2) && (ro % 2 == 0) && (ro > 0))){
            this.setValida(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            this.setRounds(ro);
            System.out.println("Luta marcada!");
        }
        else {
            this.setValida(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            this.setRounds(0);
            System.out.println("Nao foi possivel marcar a luta!");
        }
    }
    public void lutar(){
        if (getValida()){
            int vantagemL1 = 0, vantagemL2 = 0, vantagem, valorganhar, valornocaute, round = 0, contL1 = 0, contL2 = 0, totrounds;
            Random valor = new Random();
            totrounds = (this.getRounds() / 2) + 1;
            if (this.getDesafiante().getIdade() < this.getDesafiado().getIdade()){
                vantagemL1++;
            }
            else if ((this.getDesafiante().getIdade() > this.getDesafiado().getIdade())){
                vantagemL2++;
            }
            if (this.getDesafiante().getAltura() > this.getDesafiado().getAltura()){
                vantagemL1++;
            } 
            else if (this.getDesafiante().getAltura() < this.getDesafiado().getAltura()){
                vantagemL2++;
            }
            if (this.getDesafiante().getPeso() > this.getDesafiado().getPeso()){
                vantagemL1++;
            }
            else if (this.getDesafiante().getPeso() < this.getDesafiado().getPeso()){
                vantagemL2++;
            }
            if (this.getDesafiante().getVitorias() > this.getDesafiado().getVitorias()){
                vantagemL1++;
            }
            else if (this.getDesafiante().getVitorias() < this.getDesafiado().getVitorias()){
                vantagemL2++;
            }
            vantagem = vantagemL1 - vantagemL2; // escopo de 12 numeros 0 - 12, alterando a propabilidade de vitoria  
            vantagemL1 = 7 - vantagem; // 7 -12
            vantagemL2 = 6 - vantagem; // 1 - 6
            while(round < getRounds()){
            valorganhar = valor.nextInt(12) + 1;
            valornocaute = valor.nextInt(12) + 1;
                for (int i = 1 ; i <= vantagemL2 ; i++){
                    if (i == valorganhar){
                        round++;
                        contL2++;
                        System.out.print("\nO " + this.getDesafiado().getNome() + " ganhou o " + round + ".o round");

                        if (valorganhar == valornocaute){
                            System.out.println(" e nocauteou o " + this.getDesafiante().getNome());
                            this.getDesafiado().ganharLuta();
                            this.getDesafiante().perderLuta();
                            return;
                        }
                        if(contL2 == totrounds){
                            round = this.getRounds();
                        }
                        break;
                    }
                }
                for (int i = 12 ; i >= vantagemL1 ; i--){
                    if (i == valorganhar) {
                        round++;
                        contL1++;
                        System.out.print("\nO " + this.getDesafiante().getNome() + " ganhou o " + round + ".o round");
                        
                        if (valorganhar == valornocaute){
                            System.out.println(" e nocauteou o " + this.getDesafiado().getNome());
                            this.getDesafiante().ganharLuta();
                            this.getDesafiado().perderLuta();
                            return;
                        }
                        if (contL1 == totrounds){
                            round = this.getRounds();
                        }
                        break;
                    }
                }
            }
            if (contL1 == contL2){
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
                System.out.println("\nA luta termina em empate.");
            } else if (contL1 > contL2) {
                this.getDesafiante().ganharLuta();
                this.getDesafiado().perderLuta();
                System.out.println("\nO " + this.getDesafiante().getNome() + " ganhou a luta.");
            } else {
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
                System.out.println("\nO " + this.getDesafiado().getNome() + " ganhou a luta.");
            }
        }
        else {
            System.out.println("Nao foi possivel lutar");
        }
    }
    public Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean getValida() {
        return valida;
    }

    private void setValida(boolean valida) {
        this.valida = valida;
    }
    
}
