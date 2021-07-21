/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 15/04/2021, 10:56:29
 */
public class Desenho {
    
    int a, b, c, d;
    
    //Construtor para um desenho
    public Desenho(int a){
        this.a = a;
    }
   
    //construtor para uma linha
     public Desenho(int a, int b){
        this.a = a;
        this.b = b;
    }
          
     //construtor para uma triangulo
     public Desenho(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
     
     //construtor para uma retangulo
     public Desenho(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
     
     //Metodo para exibir o valor para o Ponto
     public void exibirFigura(String w){
         System.out.println("O valor do Ponto é: " + a);
         
     }
     
      //Metodo para exibir as coordenadas da linha
     public void exibirFigura(int x){
         System.out.println("As coordenadas da linha são: " + a + " e " + b);
                  
     }
     
      //Metodo para exibir o valor para o Ponto
     public void exibirFigura(boolean j){
         System.out.println("É um triangulo de coodenadas" +a+ ", " +b+ " e " +c);
     }
     
      //Metodo para exibir o valor para o Ponto
     public void exibirFigura(String w, int r){
         System.out.println("O Retangulo foi construido com as seguintes coodenadas " +a+ ", " +b+ ", " +c+ " e " +d);
     }
     
}//fim da classe
