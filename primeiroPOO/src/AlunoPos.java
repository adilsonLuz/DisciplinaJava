
import javax.swing.JOptionPane;

/**
 * Classe criada para demonstrar a sobrescrita de metodos dentro de uma estrutura de herança.
 * A clase AlunoPos herda TODOS atributos e metodos da 
 * @author Adilson Luz
 * @since Classe Criada em 15/04/2021, 12:12:03
 */
public class AlunoPos extends Aluno{
    String projeto;
    String orientador;
    boolean aprovado;
    
    //construtor de alunoPos

    public AlunoPos(String nome, int idade, float altura, int ra,
            String curso, float nota, String sexo, int faltas,
            String projeto, String orientador, boolean aprovado) {
        super(nome, idade, altura, ra, curso, nota, sexo, faltas);
        this.projeto = projeto;
        this.orientador = orientador;
        this.aprovado = aprovado;
    }
    
    @Override
    public void exibirDados(){
        String msg;
        msg = "O aluno(a) " +nome+ " que é do curso de pós-graduação, cujo projeto é:\n"+projeto
                + " é orientado pelo professor(a)\n"+orientador+ " e seu desempenho foi "
                + "considerado " +(aprovado?"Aprovado":"Reprovado")+ ". A sua graduação foi:\n" + curso+ " em que ele(a) tinha como "
                        + "nº de registro academico RA:" + ra;
        
        JOptionPane.showMessageDialog(null,msg, "Dados do Aluno", 1);
    }

}//fim da classe
