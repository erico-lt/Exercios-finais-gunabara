public class Gafanhoto extends Pessoa{   

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, float experiencia, String login) {
        super(nome, sexo, idade, experiencia);
        this.setLogin(login);
        this.setTotAssistindo(0);
    }

    @Override
    public String toString(){
        return super.toString() + "\n Login: " + this.getLogin() + 
        "\n Assistido: " + this.getTotAssistido();
    }

    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistindo(int totAssistido) {
        this.totAssistido = totAssistido;
    }

}
