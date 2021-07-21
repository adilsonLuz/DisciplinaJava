/**
 * Classe criada para implementar todos os metodos da interface pizza
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 10:28:29
 */
public class Quatroueijos implements Pizza{

    @Override
    public void montarIngredientes() {
        System.out.println("Sabor: Quatro Queijos");
        System.out.println("Ingredientes: Molho de tomate, mussarela, parmesão, provolone, gorgonzola");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno 7 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$ 42,00");
    }

    @Override
    public void congelar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}//fim da classe
