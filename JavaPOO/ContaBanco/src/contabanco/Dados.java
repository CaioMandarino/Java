package contabanco;
public class Dados {
    private static int numContaGlobal = 0;
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public Dados(){
        saldo = 0f;
        status = false;
    }
    public String abrirConta(String nome, String tipo){
        if ( !(tipo.equals("CC")) && !(tipo.equals("CP")) ){
            this.status = false;
            return "Erro ao abrir a conta";
            
        }
        else {
            numContaGlobal += 1;
            this.numConta = numContaGlobal;
            this.dono = nome;
            this.tipo = tipo;
            if (tipo.equals("CC")){
                this.saldo = 50f;
            }
            else {
                this.saldo = 150f;
            }
            this.status = true;
            return "Conta aberta com sucesso";
        }
    }
    public String depositar(float f){
        if (this.status == true){
            this.saldo += f;   
            return "Deposito com sucesso";
        }
        else {
            return "Conta nao foi aberta";
        }
        
    }
    public String sacar(float f){
        if (this.status == true){
            if ( f > this.saldo){
                return "ERRO, Saldo insuficiente";
            }
            this.saldo -= f;
            return "Saque com sucesso!";
        }
        else {
            return "Conta nao foi aberta";
        }
        
    }
    public String pagarMensal(){
        if (this.status == true){
            int v;
            if (this.tipo.equals("CC")){
                v = 12;
            }
            else { 
                v = 20;
            }
            if (v > saldo){
                return "Saldo Insuficiente";
            }
            else {
                if ( this.tipo.equals("CC")){
                    this.saldo -= v;
                    return "Pagamento Efetuado";
                } else {
                    this.saldo -= v;
                    return "Pagamento Efetuado";
                }    
            }
  
        }
        else {
           return "Conta nao foi aberta";
        } 
    }
    public String fecharConta(){
        if (this.status == true){
            if (this.saldo != 0){
                if (this.saldo > 0){
                    return "ERRO, saldo na Conta";
                }
                else {
                    return "ERRO, saldo negativo";
                }
            } else {
            this.status = false;
            this.dono = null;
            this.numConta = 0;
            this.tipo = null;
            this.saldo = 0f;
            
            return "Conta Fechada";
            }
        }
        else {
           return "Conta nao foi aberta";
        } 
    }
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    
}
