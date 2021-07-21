//Sessão de importação
import javax.swing.JOptionPane;

/**
 *
 * @author Adilson
 */
public class Calculadora {
    public static void main(String[] args) {
        
        //Iniciando variaveis
        String numA, numB, msg;
        int a, b, soma, multi, sub;
        float div;
        
        //Entrada de valores por meio de janelas POUP UP
        numA = JOptionPane.showInputDialog(null, "Digite o valor de A: ", "Calculadora", 3);
        numB = JOptionPane.showInputDialog(null, "Digite o valor de B: ", "Programação GUI", 0);
        
        //Convertendo STRING da POUP UP em valor INT
        //a = Integer.parseInt(numA);
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B: ", "Programação GUI", 0));
        
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A: ", "Calculadora", 3));
        
        //a = 45;
        //b = 32;
        
        //Realizando as operações
        soma = a + b;
        multi = a * b;
        sub = a - b;
        div = (float) a / b;
        
        //Configurando a variavel msg
        msg = "A soma é: " + soma + 
              "\nA subtração é: " + sub + 
              "\nA multiplicação é: " + multi + 
              "\nA divisão é: " + div;
        
        //mostrando resultados no modo HARD CODE, sem interface grafica
       /* System.out.println("A soma é:" + soma);
        System.out.println("A soma de " + a + " mais " + b + " é igual a: " + soma);
        System.err.println("A multiplicação de " + a + " vezes " + b + " só podia ser " + multi);
        System.out.println("A subtração de " + a + " menos " + b + " é igual a: " + sub);
        System.out.println("A divisão de " + a + " por " + b + " só podia ser " + div);*/
        
        
        //Parametros de mentrada para GUI's de caixa de dialogo
        //GUI - Graphical User Interface
        //JOptionPane.ShowMessageDialog (1, 2, 3, 4);
        //1 - null/this - posicionamento da GUI de comunicação com o usuario
        //2 - Texto que vai aparecer dentro da caixa de dialogo
        //3 - Titulo da caixa de dialogo
        //4 - Ícone que aparecerá na caixa de diálogo (-1 AO 3)
        //íCONES
            //-1 - Sen Icone
            // 0 - ERROR (Informação de ocorrencia de erro)
            // 1 - INFORMATION (Informação ao usuário)
            // 2 - WARNING (Um Aviso pra chamar a atenção)
            // 3 - QUESTION (Pergunta ao usuário)
            
        //Mostrando cada operação em uma janela        
        /*JOptionPane.showMessageDialog(null,"A soma é: " + soma, "Resultado das Operações", -1);
        JOptionPane.showMessageDialog(null,"A subtração é: " + sub, "Resultado das Operações", 0);
        JOptionPane.showMessageDialog(null,"A multiplicação é: " + multi, "Resultado das Operações", 1);
        JOptionPane.showMessageDialog(null,"A divisão é: " + div, "Resultado das Operações", 2);
        JOptionPane.showMessageDialog(null,"A multiplicação de novo é: " + multi, "Resultado das Operações", 3);*/
        
        //Exibindo todos resultados em uma unica janela (Mod 1)
        JOptionPane.showMessageDialog(null,"A soma é: " + soma + 
                                           "\nA subtração é: " + sub + 
                                           "\nA multiplicação é: " + multi + 
                                           "\nA divisão é: " + div, 
                                           "Resultado das Operações", -1);
        
        //Exibindo todos resultados em uma unica janela (Mod 2) a partir da variavel msg
        JOptionPane.showMessageDialog(null, msg, "Resultado das Operações", -1);
        
    }//fim do main
 }//fim da classe
