/**
 * Classe criada para exemp´lificar mais regras de exceção para o codigo da classe
 * Divisão
 * @author Adilson Luz
 * @since Classe Criada em 29/04/2021, 12:07:35
 */
public class MaisRegrasException extends Exception {

    public MaisRegrasException() {
        super("O número A não pode ser menor que número B.");
    }
    
    public MaisRegrasException(String x) {
        super("O número A não pode ser exatamente iguais número B.");
    }

}//fim da classe
