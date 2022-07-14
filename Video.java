public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Metodos Construtor, sempre que um video for iniciado ele ganhará uma visualização
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }    

    //Metodos de sobreescrever
    @Override
    public void play(){
        this.setReproduzindo(true);
    }

    @Override
    public void pause(){
       this.setReproduzindo(false);
    }

    @Override
    public void like(){
        this.setCurtidas(1);
    }   

    //Metodos gets e sets        
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    protected int getAvaliacao() {
        return avaliacao;
    }

    protected void setAvaliacao(int avaliacao) {
        this.avaliacao = (int) ((this.getAvaliacao() + avaliacao ) / this.views);
    }

    protected int getViews() {
        return views;
    }

    protected void setViews(int views) {
        this.views = views;
    }

    protected int getCurtidas() {
        return curtidas;
    }

    protected void setCurtidas(int curtidas) {
        this.curtidas += curtidas;
    }
 
    protected boolean getReproduzindo() {
        return reproduzindo;
    }

    protected void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //Status atual do do video
    @Override
    public String toString(){
        return " Titulo: " + this.getTitulo() + 
        "\n Avaliação: " + this.getAvaliacao() + 
        "\n Views: " + this.getViews() + 
        "\n Curtidas:" + this.getCurtidas() + 
        "\n Reproduzindo: " + this.getReproduzindo();
    } 

}
