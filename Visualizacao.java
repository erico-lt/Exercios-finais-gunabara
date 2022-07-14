public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
  
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int nota = 0;
        if(porc <= 20.99){
            nota = 3;
        }else if(porc <= 40.99){
            nota = 5;
        }else if(porc <= 70.99){
            nota = 8;
        }else{
            nota = 10;
        }

        this.filme.setAvaliacao(nota);
    }    
   
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString(){
        return " Espectador \n" + "--------------- \n" + this.espectador + "\n \n Filme \n" + "----------------- \n"+ this.filme;
    }


}
