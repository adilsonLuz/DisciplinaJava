
import javax.swing.JOptionPane;

/**
 * Classe criada para demonstrar o tratamento de exceção feito com try ... cath ... throws
 * @author Adilson Luz
 * @since Classe Criada em 29/04/2021, 10:33:51
 */
public class Divisão {
    public static void main(String[] args) {
        int a, b, result;
        
        try{
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite 1º número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite 2º número"));
        
            result = dividir(a,b);
            JOptionPane.showMessageDialog(null, result, "Resultado", 1);
            System.out.println("Resultado: " + result);
            result = subtrair(a,b);
        }
        catch(ArithmeticException err){
            JOptionPane.showMessageDialog(null,"Não existe divisão por zero", "AVISO!!!", 2); 
            System.out.println("Não existe divisão por zero");
        }
        catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Digite apenas números", "ERRO", 0);
            System.out.println("Digite apenas numeros");
        }
        catch(DivisãoExceção err){
            JOptionPane.showMessageDialog(null, err.toString(), "ERRO", 0);
        }
        catch(MaisRegrasException e){
            JOptionPane.showMessageDialog(null, e.toString(), "ERRO", 0);
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro do tipo: \n" + err.toString()
                    +"\nEntre em contato pelo celular (11) 9 9546-6654", "AVISO DE ERRO", 2);
            System.out.println("Ocorreu um erro do tipo: " + err.toString());
            System.out.println("Entre em contato pelo celular (11) 9 9546-6654");
        }
    }//fim do main
    
    public static int dividir(int a, int b) throws DivisãoExceção, MaisRegrasException{
        
        if(a < 0)
            throw new DivisãoExceção();
        if(b > 100)
            throw new DivisãoExceção(b);
        if(b > a)
            throw new MaisRegrasException();
        
        return a / b;
    }

    private static int subtrair(int a, int b) throws MaisRegrasException {
        if(b == a)
            throw new MaisRegrasException("xx");
        return a - b;
    }

}//fim da classe
