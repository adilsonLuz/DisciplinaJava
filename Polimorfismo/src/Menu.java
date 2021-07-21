
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 11:38:33
 */
public class Menu {
    Pizza pizza;
    String msg;
    Forno forno = new Forno();
    int opcao;
    
    public Menu(){
        
       msg = "Menu de Pizzas"
                    + "\n1 - Portuguesa"
                    + "\n2 - Quatro Queijo"
                    + "\n3 - Havaiana"
                    + "\n4 - Pão Caseiro"
                    + "\n9 - Sair";
       
            while(true){
                opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
                
                switch(opcao){
                    case 1: pizza = new Portuguesa();
                        break;
                    case 2: pizza = new Quatroueijos();
                        break;
                    case 3: pizza = new Havaiana();
                        break;
                    case 4: pizza = new Pao();
                        break;
                    case 9: System.exit(0);
                    
                    default: JOptionPane.showMessageDialog(null, "Opção Invalida!!!");
                        opcao = 0;
                }//Fim do switch
                if(opcao != 0 && opcao != 88){
                forno.preparar(pizza);
                }//Fim do if
            }//Fim do While
    }//

}//fim da classe
