/**
 *Interface criada como modelo para toda e qualquer classe que 
 * implemente como se faz uma pizza em uma pizzaria. Interface será SEMPRE
 * abstrata.
 * @author Adilson
 * @since Interface criada em 06 de maio de 2021
 */
public interface Pizza {
    
    //toda pizza tem que ser montada com ingredientes
    public void montarIngredientes();
    
    //Funcionalidade basica para assar uma pizza
    public void assar();
    
    //Toda pizza tem um valor a ser cobrado
    public void cobrar();
    
    //Toda pizza exibe uma menssagem
    public void exibirMenssagem();
    
    
}//fim da interface
