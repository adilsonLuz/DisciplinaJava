/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 08/04/2021, 10:12:36
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;
    String sexo;
    
    //Métodopara construir um objeto na memoria
    public Pessoa(String nome, int idade, float altura, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        
    }
    
    //Metodo para exibir os dados de uma Pessoa na tena
    public void exibirPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
    }
    
    //Método para exibir os dasdosa de pessoa em uma unica linha
    public void exibirDadosPessoaLinha(){
        System.out.println(nome + " tem " + idade + " anos e " + altura + " de altura");   
             
    }
    
    
    //Metodo para exibir os dados de uma pesso
    public void exibirDados(){
        System.out.println("A pessoa " + nome + " tem " +idade+ " anos.");
    }

}//fim da classe
