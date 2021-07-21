/**
 * Classe criada para gerar o objeto polimorfico forno que será capaz
 * de assasr todo e qualquer tipo de pizza.
 * @author Adilson Luz
 * @since Classe Criada em 06/05/2021, 10:41:07
 */
public class Forno {
    
    public void preparar(Pizza pizza){
        pizza.montarIngredientes();
        pizza.assar();
        pizza.cobrar();
    }
}//fim da classe
