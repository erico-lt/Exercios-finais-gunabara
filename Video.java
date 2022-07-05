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
    protected String getTitulo() {
        return titulo;
    }
    
    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    protected String getAvaliacao() {
        return avaliacao;
    }

    protected void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
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

}
