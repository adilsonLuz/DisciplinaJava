
import java.util.Date;

/**
 * Classe criada para construir o objeto cliente
 * @author Adilson Luz
 * @since Classe Criada em 20/04/2021, 14:18:04
 */
public class Tutor {
    String nome;
    String telefone;
    String celular;
    String recado;
    String endereco;
    int nunEnd;
    String bairro;
    String cidade;
    String uf;
    String cep;
    String profissao;
    float renda;
    Date nascimento;
    String rg;
    String cpf;
    String email;
    
    public Tutor() {
        //Construtor vazio
    }

    public Tutor(String nome, String telefone, String celular, String recado,
            String endereco, int nunEnd, String bairro, String cidade, String uf,
            String cep, String profissao, float renda, Date nascimento, String rg,
            String cpf, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.recado = recado;
        this.endereco = endereco;
        this.nunEnd = nunEnd;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.profissao = profissao;
        this.renda = renda;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRecado() {
        return recado;
    }

    public void setRecado(String recado) {
        this.recado = recado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNunEnd() {
        return nunEnd;
    }

    public void setNunEnd(int nunEnd) {
        this.nunEnd = nunEnd;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}//Fim da classe