/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício_idade_matriz;

import java.util.Random;
/**
 *
 * @author kaio.teixeira
 */
public class ListaPessoas {
    
    public static Pessoa[] cria_vetor(){
        Pessoa[] vetor_pessoas = new Pessoa[10];
        int i;
        Random gerador = new Random();
        for (i=0;i<=9;i++){
            vetor_pessoas[i] = new Pessoa("A"+gerador.nextInt(10),gerador.nextInt(100));
            
        }
        return vetor_pessoas;
    }
    
     public static void imprimeValor(Pessoa[] vetor_pessoas){         
        int n;
        for (n=0;n<=9;n++){
            System.out.print(vetor_pessoas[n].getNome()+ " ");
            System.out.println(vetor_pessoas[n].getIdade());
        }
        
        
    }
}
