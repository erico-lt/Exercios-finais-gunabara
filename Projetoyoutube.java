public class Projetoyoutube {
    public static void main(String[] args){

        Gafanhoto pe[] = new Gafanhoto[2];
        pe[0] = new Gafanhoto("Lucas", "M", 15, "LordSupremo");
        pe[1] = new Gafanhoto("Guilherme", "M", 20, "Big Jhoson");

        Video vid[] = new Video[2];
        vid[0] = new Video("Aprenda jogar dota 2");
        vid[1] = new Video("Aprenda a jogar BF4");

       Visualizacao vis[] = new Visualizacao[2];
       vis[0] = new Visualizacao(pe[0], vid[0]);
       vis[1] = new Visualizacao(pe[1], vid[0]);

       vis[0].avaliar(86.55f);
       vis[1].avaliar(40.80f);

       System.out.println(vis[0].toString());
    }
}
