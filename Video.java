public class Video implements AcoesVideo{
    private String titulo;
    private String avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Metodos Construtor, sempre que um video for iniciado ele ganhará uma visualização
    public Video(){
        this.views += 1;
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
    
    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas += curtidas;
    }
 
    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

}
