/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício_idade_matriz;

/**
 *
 * @author kaio.teixeira
 */
public class OrdenadorIdade extends Ordenador{
    
     public boolean compara(Pessoa P1, Pessoa P2){
        return (P1.getIdade()>P2.getIdade());      
    }
    
    
}
