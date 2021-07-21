/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 25/03/2021, 11:48:57
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;
    
    //Metodo para construir um objeto na memoria (Construtor)
    public Pessoa(String n, int i, float a){
        nome = n;
        idade = i;
        altura = a;
    }
    
    //Metodo para exibir os dados de uma pessoa
    public void exibirPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}//fim da classe
