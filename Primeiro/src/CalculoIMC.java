//Sessão de importação
import javax.swing.JOptionPane;


/**
 * Classe criada para entrar com o peso e a altura para e mostra
 * os respestivos IMC's de cada um
 * @author Adilson Luz
 * @since Classe Criada em 01/03/2021, 10:46:23
 */
public class CalculoIMC {
    
    public static void main(String[] args) {
        float peso, altura, imc;
        peso = altura = imc = 0;
        
        altura = Float.parseFloat(JOptionPane.showInputDialog("Sua Altura"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Seu Peso"));
       
        imc = peso / (altura * altura);
        
        System.out.println("Seu IMC é: " + imc);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc, "Calculo para IMC", -1);
        
    }//fim do main
}//fim da classe
