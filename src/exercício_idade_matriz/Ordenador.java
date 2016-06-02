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
abstract class Ordenador {

    public void ordena(Pessoa[] vetorPessoas) {
        boolean trocou = true;
        Pessoa aux2;
        int j;
        do {
            trocou = false;
            for (j = 0; j < 9; j++) {
                if (compara(vetorPessoas[j], vetorPessoas[j + 1])) {
                    aux2 = vetorPessoas[j];
                    vetorPessoas[j] = vetorPessoas[j + 1];
                    vetorPessoas[j + 1] = aux2;
                    trocou = true;
                }
            }
        } while (trocou);

    }

    protected abstract boolean compara(Pessoa P1, Pessoa P2);
}
