package projectfinalpoo;
public class ProjectFinalPOO {
    public static void main(String[] args) {
        Gafanhoto p[] = new Gafanhoto[3];
        p[0] = new Gafanhoto("Caio", 18, "M", "Caio123");
        p[1] = new Gafanhoto("Ana", 18, "F", "Caio123");
        p[2] = new Gafanhoto("Samuel", 18, "M", "Caio123");
        Video v[] = new Video[3];
        v[0] = new Video("Aprender java sem querer rebolar lentinho pros crias");
        v[1] = new Video("C++");
        v[2] = new Video("Como dar mortal");
        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(p[0], v[0]);
        vis[0].avaliar(10);
        vis[1] = new Visualizacao(p[1], v[0]);
        vis[1].avaliar(10);
        vis[2] = new Visualizacao(p[2], v[0]);
        vis[2].avaliar(0);
        System.out.println(v[0].getAvaliacao());
    }
    
}
