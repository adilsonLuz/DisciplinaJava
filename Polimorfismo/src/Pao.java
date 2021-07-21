/**
 * Classe criada para implementar os metodos da interface pizza
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 11:33:37
 */
public class Pao implements Pizza{

    @Override
    public void montarIngredientes() {
        System.out.println("Pão Caseiro");
        System.out.println("Ingredientes: farinha, ovos, sal e leite");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno 45 min");
        
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$ 10,00");
    }

    @Override
    public void congelar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}//fim da classe
