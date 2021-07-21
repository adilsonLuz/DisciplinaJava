
import java.util.Date;

/**
 * Classe criada para ser a base na geração de clientes de objeto do tipo 
 * Cliente que será manipulado em memoria
 * @author Adilson Luz
 * @since Classe Criada em 22/03/2021, 11:27:17
 */
public class Cliente {
    String nome;
    Date nascimento;
    String endereço;
    int numeroEndereço;
    String cidade;
    String uf;
    String cpf;
    String sexo;
    float renda;
    boolean leitura;
    boolean futebol;
    boolean pescaria;
    boolean danca;
    boolean videoGame;
    boolean corrida;
    boolean cozinhar;
    boolean musica;
    
    //Metodo construtor - resposavel por criar uma instancia (objeto) na memoria
    public Cliente(){
        //Construtor vazio;        
    }
    
    //Metodo assessores
    //Set & Get
    //Set - Para guardar uma informação no atributo
    //Get - Pegar uma informação de um atributo do objeto (instância)

    public Cliente(String nome, Date nascimento, String endereço, int numeroEndereço,
                   String cidade, String uf, String cpf, String sexo, float renda, 
                   boolean leitura, boolean futebol, boolean pescaria, boolean danca, 
                   boolean videoGame, boolean corrida, boolean cozinhar, boolean musica
                  ) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereço = endereço;
        this.numeroEndereço = numeroEndereço;
        this.cidade = cidade;
        this.uf = uf;
        this.cpf = cpf;
        this.sexo = sexo;
        this.renda = renda;
        this.leitura = leitura;
        this.futebol = futebol;
        this.pescaria = pescaria;
        this.danca = danca;
        this.videoGame = videoGame;
        this.corrida = corrida;
        this.cozinhar = cozinhar;
        this.musica = musica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getNumeroEndereço() {
        return numeroEndereço;
    }

    public void setNumeroEndereço(int numeroEndereço) {
        this.numeroEndereço = numeroEndereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }
    /**
     * O conteúdo deste campo virá do item selecionado na Combo Box
     * @param uf Uma String que é o estado escolhido pelo usuário
     * @return Não retorna nada
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public boolean isLeitura() {
        return leitura;
    }

    public void setLeitura(boolean leitura) {
        this.leitura = leitura;
    }

    public boolean isFutebol() {
        return futebol;
    }

    public void setFutebol(boolean futebol) {
        this.futebol = futebol;
    }

    public boolean isPescaria() {
        return pescaria;
    }

    public void setPescaria(boolean pescaria) {
        this.pescaria = pescaria;
    }

    public boolean isDanca() {
        return danca;
    }

    public void setDanca(boolean danca) {
        this.danca = danca;
    }

    public boolean isVideoGame() {
        return videoGame;
    }

    public void setVideoGame(boolean videoGame) {
        this.videoGame = videoGame;
    }

    public boolean isCorrida() {
        return corrida;
    }

    public void setCorrida(boolean corrida) {
        this.corrida = corrida;
    }

    public boolean isCozinhar() {
        return cozinhar;
    }

    public void setCozinhar(boolean cozinhar) {
        this.cozinhar = cozinhar;
    }

    public boolean isMusica() {
        return musica;
    }

    public void setMusica(boolean musica) {
        this.musica = musica;
    }
    

}//fim da classe
