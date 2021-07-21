
import java.util.Set;

/**
 * Classe criada para demosntrar o principipo da Herança. A classe Aluno
 * Herdará atributos (caracteristiscas físicas) e métodos (carasteristicas
 * comportamentais) da superclasse Pessoa.
 * @author Adilson Luz
 * @since Classe Criada em 08/04/2021, 09:27:03
 */
public class Aluno extends Pessoa{
    int ra;
    String curso;
    float nota;
    int faltas;
    
    //Construtor Aluno
    public Aluno(String nome, int idade, float altura, int ra, String curso, float nota, String sexo, int faltas){
        super(nome, idade, altura, sexo);
        this.ra = ra;
        this.curso = curso;
        this.nota = nota;
        this.faltas = faltas;
    }
    
    //metodo pa ra exibir aluno
    public void exibirAluno(){
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso);
        System.out.println("Nota: " + nota);
        super.exibirPessoa();
    }
    
    //metodo sobreescrito da classe pessoa
    @Override
    public void exibirDados(){
        System.out.println("O aluno "+nome+ " tirou a nota "+nota);
    }
    
    //Metodo sobrecarregado para axibir aluno
    //O que define a sobrecarga do metodo é sua assinatura, ou seja:
    //o tipo, a quantidade e a ordem dos paramentros
    public void exibirAluno(int x){
        System.out.println("Aluno " + nome);
    }
    
    
    public void exibirAluno(String z){
        System.out.println("Aluno " + nome);
    }
    
    
    //Método para exibir dados de um alumo em duas linha
    public void mostrarDadosAlunoLinha(){
        super.exibirDadosPessoaLinha();
        System.out.println("Ele é um aluno do curso " + curso 
                + ", registrado sob o RA: " + ra + " e obteve a nota "+ nota);
        System.out.println("Este aluno é do sexo " + sexo);
    }
    
    //Metodo para analisar a nota do aluno e emitir um resultado
    public void analizarNotaAluno(){
        if(nota>= 6.0)
            System.out.println("Aluno aprovado com nota " + nota);
        else
            System.err.println("Aluno foi reprovado porque tirou " + nota);
    }
    
    //Metodos para analizar faltas
    public void analizarFaltasAluno(){
        if(faltas <= 20)
            System.out.println("Aluno aprovado pela frequencia! " 
                    + (1-(float)faltas / 80) * 100 + "% aulas");
        else
            System.err.println("Aluno reprovado pela frequncia de " 
                    + (100-(faltas/0.8)) + "% das aulas");    
    }
    
    //Metodo para analizar notas e faltas
    public boolean analizarNota(){
        if(nota >= 6)
            return true;
        else
            return false;
    }
    
    //Metodo para analizar notas e faltas
    public boolean analizarFaltas(){
        return faltas <= 20;
    }
    
    //metodo para analizar e dar o resultado final com base nas notas e faltas do aluno
    public void analizaNotaFaltaAluno(){
        if(analizarNota() && analizarFaltas())
            System.out.println("Aluno Aprovado ====> Parabens!!!");
        else
            System.err.println("Aluno REPROVADO");
    }
    
    

}//fim da classe



