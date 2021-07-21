
import java.util.Date;

/**
 * Classe criada para criar objeto Pet
 * @author Adilson Luz
 * @since Classe Criada em 22/04/2021, 15:05:50
 */
public class Pet {

    String nome;
    int idade;
    Date nascimento;
    String especie;
    String raca;
    String cor;
    float peso;
    String sexo;
    String castrado;
    boolean vermi1;
    boolean vermi2;
    boolean raiva;
    boolean v101;
    boolean v102;
    boolean v103;
    boolean giardia1;
    boolean giardia2;
    boolean gripe;
    int mes;

    
    public Pet(){
        
    }

    public Pet(String nome, int idade, Date nascimento, String especie,
            String raca, String cor, float peso, String sexo, String castrado,
            boolean vermi1, boolean vermi2, boolean raiva, boolean v101,
            boolean v102, boolean v103, boolean giardia1, boolean giardia2,
            boolean gripe, int mes) {
        this.nome = nome;
        this.idade = idade;
        this.nascimento = nascimento;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
        this.sexo = sexo;
        this.castrado = castrado;
        this.vermi1 = vermi1;
        this.vermi2 = vermi2;
        this.raiva = raiva;
        this.v101 = v101;
        this.v102 = v102;
        this.v103 = v103;
        this.giardia1 = giardia1;
        this.giardia2 = giardia2;
        this.gripe = gripe;
        this.mes = mes;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String castrado) {
        this.castrado = castrado;
    }

    public boolean isVermi1() {
        return vermi1;
    }

    public void setVermi1(boolean vermi1) {
        this.vermi1 = vermi1;
    }

    public boolean isVermi2() {
        return vermi2;
    }

    public void setVermi2(boolean vermi2) {
        this.vermi2 = vermi2;
    }

    public boolean isRaiva() {
        return raiva;
    }

    public void setRaiva(boolean raiva) {
        this.raiva = raiva;
    }

    public boolean isV101() {
        return v101;
    }

    public void setV101(boolean v101) {
        this.v101 = v101;
    }

    public boolean isV102() {
        return v102;
    }

    public void setV102(boolean v102) {
        this.v102 = v102;
    }

    public boolean isV103() {
        return v103;
    }

    public void setV103(boolean v103) {
        this.v103 = v103;
    }

    public boolean isGiardia1() {
        return giardia1;
    }

    public void setGiardia1(boolean giardia1) {
        this.giardia1 = giardia1;
    }

    public boolean isGiardia2() {
        return giardia2;
    }

    public void setGiardia2(boolean giardia2) {
        this.giardia2 = giardia2;
    }

    public boolean isGripe() {
        return gripe;
    }

    public void setGripe(boolean gripe) {
        this.gripe = gripe;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

   
}//fim da classe
