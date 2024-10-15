package uec;
public class Lutador implements Acao{
    private String nome;
    private String nascionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;

    public Lutador(String nome, String nascionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empate) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empate = empate;
    }
    
    @Override
    public void apresentar() {
        System.out.println("---------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nascionalidade: " + this.getNascionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpate());
    }

    @Override
    public void status() {
        System.out.print(this.getNome());
        System.out.print(" eh um peso " + this.getCategoria());
        System.out.print(", com " + this.getVitorias() + " vitorias, ");
        System.out.print("com " + this.getDerrotas() + " derrotas e com");
        System.out.println(this.getEmpate() + " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+ 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+ 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    private void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Invalido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9){
            this.categoria = "Medio";
        } else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    private void setEmpate(int empate) {
        this.empate = empate;
    }
    
}
