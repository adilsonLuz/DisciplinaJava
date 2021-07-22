/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.p2java.controler;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 22/07/2021, 19:25:59
 */
public class ProdutosDAO {
    
    public void limparCampos(JPanel container){
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
            if (component instanceof JComboBox) {
                ((JComboBox) component).setSelectedIndex(-1);
            }
        }
    }

}//fim da classe
