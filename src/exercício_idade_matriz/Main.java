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
public class Main {
    
    public static void main(String[] args) {
        Pessoa[] vetor_pessoas = new Pessoa[10];
        int aux;
        OrdenadorIdade ordIdade = new OrdenadorIdade();
        OrdenadorNome ordNome = new OrdenadorNome();
        
        vetor_pessoas = ListaPessoas.cria_vetor();
        
        System.out.println("Vetor desordenado");
        ListaPessoas.imprimeValor(vetor_pessoas);
        
        ordIdade.ordena(vetor_pessoas);
        System.out.println("Vetor ordenado por idade:");
        ListaPessoas.imprimeValor(vetor_pessoas);
        
        ordNome.ordena(vetor_pessoas);
        System.out.println("Vetor ordenado por nome:");
        ListaPessoas.imprimeValor(vetor_pessoas);
    }
    
}
