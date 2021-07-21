/**
 * Classe criada para impementar os metodos da intreface pizza
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 10:33:33
 */
public class Havaiana implements Pizza{

    @Override
    public void montarIngredientes() {
        System.out.println("Sabor: Havaiana");
        System.out.println("Ingredientes: Queijo, abacaxi, lombo suíno");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno 10 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor R$ 29,50");
    }

 
}//fim da classe
