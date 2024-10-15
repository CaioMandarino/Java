package uec;

import java.util.Scanner;

public class UEC {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];
        Luta competir = new Luta();
        String nome, nasc;
        int id, vi, de, em;
        float peso, alt;
        Scanner tecl = new Scanner(System.in);
        /*for (int i = 0 ; i < 2 ; i++){
            System.out.println("Nome: ");
            nome = tecl.nextLine();
            System.out.println("Nascionalidade: ");
            nasc = tecl.nextLine();
            System.out.println("Altura: ");
            alt = tecl.nextFloat();
            System.out.println("Peso: ");
            peso = tecl.nextFloat();
            System.out.println("Idade: ");
            id = tecl.nextInt();
            System.out.println("Vitorias: ");
            vi = tecl.nextInt();
            System.out.println("Derrotas: ");
            de = tecl.nextInt();
            System.out.println("Empates: ");
            em = tecl.nextInt();
            
            tecl.nextLine();
            lutadores[i] = new Lutador(nome, nasc, id, alt, peso, vi, de, em);
        }*/
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutadores[1] = new Lutador ("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutadores[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador ("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutadores[5] = new Lutador ("Nerdaart", "EVA", 30, 1.81f, 105.7f, 12, 2, 4);
        competir.marcarLuta(lutadores[0], lutadores[1], 22);
        competir.lutar();

    }
}
