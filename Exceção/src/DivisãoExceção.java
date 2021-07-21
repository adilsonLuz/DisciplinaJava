/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 29/04/2021, 11:07:09
 */
class DivisãoExceção extends Exception {
    
    public DivisãoExceção(){
        super("O Número digitado para o 'A' não pode ser negativo");
    }
    
    public DivisãoExceção(int x){
        super("O Número digitado para o 'B' não pode ser maior que 100, você digitou: " + x);
    }

}//fim da classe
