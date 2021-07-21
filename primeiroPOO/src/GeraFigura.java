/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 15/04/2021, 11:02:04
 */
public class GeraFigura {
    public static void main(String[] args) {
        Desenho ponto = new Desenho(500);
        Desenho linha = new Desenho(10, 75);
        Desenho triangulo = new Desenho(20, 65, 113);
        Desenho retangulo = new Desenho(5, 15, 25, 40);
        
        ponto.exibirFigura("blablabla");
        linha.exibirFigura(3);
        triangulo.exibirFigura(false);
        retangulo.exibirFigura("w",1);
        
    }

}//fim da classe
