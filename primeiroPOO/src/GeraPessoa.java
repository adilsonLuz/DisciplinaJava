/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 08/04/2021, 10:22:11
 */
public class GeraPessoa {
    public static void main(String[] args) {
        Pessoa x;
        x = new Pessoa("Pedro Paulo", 34, 1.78f, "Masculino");
        System.out.println("Dados de pessoa:");
        x.exibirDadosPessoaLinha();
        x.exibirDados();
        
        System.out.println("\n\nDados de Aluno:");
        Aluno aluno = new Aluno("Carlos Gomes", 23, 1.65f, 20192001, "ADS", 7.83f, "Masculino", 12);
        aluno.exibirDados();
        
        
        aluno.mostrarDadosAlunoLinha();
        aluno.exibirAluno();
        aluno.analizarNotaAluno();
        aluno.analizarFaltasAluno();
        aluno.analizaNotaFaltaAluno();
        
        System.out.println("\n\nDados do aluno da Pós-Graduação");
        AlunoPos ap = new AlunoPos("Claudia Ribeiro", 28, 1.68f, 20211555, "CST em Gestão Comercial",
                8.9f, "Feminino",8, "Melhoramento Logistico para distribuição de Alimentos",
                "Angela Toshio", true);
        
        ap.exibirDados();
        
    }//fim do main

}//fim da classe
