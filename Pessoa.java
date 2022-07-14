public class Pessoa {
    protected String nome;
    protected String sexo;
    protected float experiencia;
    protected int idade;

    public Pessoa(String nome, String sexo, int idade){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setExperiencia(0);
    }

    @Override
    public String toString(){
        return " Nome: " + this.getNome() + 
        "\n Idade: " + this.getIdade() + 
        "\n Sexo: " + this.getSexo() +
        "\n Experiência: " + this.getExperiencia();
        
    }

    protected void ganharExp(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
