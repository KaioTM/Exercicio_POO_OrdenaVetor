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
   
    public static void main(String[] args) {
        Pessoa[] vetor_pessoas = new Pessoa[10];
        int aux;
        vetor_pessoas = cria_vetor();
        System.out.println("Vetor desordenado");
        imprimeValor(vetor_pessoas);
        ordenaNomes(vetor_pessoas);
        ordenaIdade(vetor_pessoas);
    }
    
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
     public static void ordenaNomes(Pessoa[] vetor_pessoas){
         boolean trocou = true;
         Pessoa aux2;
         int i,j;
         do {
            trocou = false;
            for (j = 0; j<9;j++){
                if(vetor_pessoas[j].getNome().compareToIgnoreCase(vetor_pessoas[j+1].getNome())>0){
                    aux2 = vetor_pessoas[j];
                    vetor_pessoas[j] = vetor_pessoas[j+1];
                    vetor_pessoas[j+1] = aux2;
                    trocou = true;
                }
            }
        }while (trocou);
        System.out.println("Ordenado por Nomes:");
        imprimeValor(vetor_pessoas);
     }
     public static void ordenaIdade(Pessoa[] vetor_pessoas){
         boolean trocou = true;
         Pessoa aux2;
         int i,j;
         do {
            trocou = false;
            for (j = 0; j<9;j++){
                if(vetor_pessoas[j].getIdade()>vetor_pessoas[j+1].getIdade()){
                    aux2 = vetor_pessoas[j];
                    vetor_pessoas[j] = vetor_pessoas[j+1];
                    vetor_pessoas[j+1] = aux2;
                    trocou = true;
                }
            }
        }while (trocou);
         System.out.println("Ordenado por idade:");
         imprimeValor(vetor_pessoas);
     }
}
