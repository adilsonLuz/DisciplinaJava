/**
 * Classe criada para implementar uma pizza de acordo com as funcionalidades 
 * da interface
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 10:17:10
 */
public class Portuguesa implements Pizza{

    @Override
    public void montarIngredientes() {
        System.out.println("Sabor: Portuguesa");
        System.out.println("Ingredientes: Molho de tomate, ervilha, ovos, azeitonas preta, cebola"
                + ", presunto");
        
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno 12 min");
        
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$ 35,00");
        
    }

    public void exibirMenssagem() {
    }

    @Override
    public void congelar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}//fim da classe
