package br.com.moikawa;

import br.com.moikawa.Aluno;
import java.util.*;

/**
 * HashSet nao tem ordem
 * O acesso aos dados eh mais rapio que eem um TreeSet,  mas nada garante que os dados estarem ordenados.
 * Nao repete valores na lista
 */
public class ExemploHashSet {

    public static void main(String args[]) {
        exemploListSimples();
        exemploListSimplesOrdemAscendente();
        exemploListNovo();
    }

    private static void exemploListNovo() {
        System.out.println("*** exemploListNovo ***");
        Set<Integer>  inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        System.out.println(inteiros);
    }

    /**
     * Nao repete valores na  lista.
     */

    private static void exemploListSimples() {
        System.out.println("*** exemploListaSimples ***");
        Set<String> lista =  new HashSet<>();
        lista.add("Joao da Silva");
        lista.add("Antonio  Souza");
        lista.add("Lucia Ferreira");
        lista.add("Joao da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListSimplesOrdemAscendente() {
        System.out.println("*** exemploListaSimplesOrdem Ascendente ***");
        Set<String>  lista = new HashSet<String>();
        lista.add("Joao da Silva");
        lista.add("Antonio Souza");
        lista.add("Lucia Ferreira");
        //collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
