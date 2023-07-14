package br.com.moikawa;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/**
 * Ao contrário do ArrayList, as buscas são lentas e inserções e exclusões são rápidas.
 */
    public class ExemploLinkedList {
          public static void main(String args[]) {
            exemploListaSimples();
            exemploListaSimplesOrdemAscendente();
        }

        private static void exemploListaSimples() {
            System.out.println("****** exemploListaSimples ******");
            List<String> lista = new LinkedList<>();
            lista.add("João da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            System.out.println(lista);
            System.out.println("");

            lista.remove(0); // remove item na lista
            System.out.println(lista);
            boolean contem = lista.contains("Antonio Sousa"); //consultar se tem objeto na lista (false ou true)
            System.out.println(contem);

            for (String nome : lista) { //interacao da lista, para ver se se foi removido, aparecendo os que estao na lista
                System.out.println(nome);
            }

            System.out.println(lista.get(0)); //objeto especifico da lista (como o Joao foi removido, o Antonio sera o primeiro na lista
        }

        private static void exemploListaSimplesOrdemAscendente() {
            System.out.println("****** exemploListaSimplesOrdemAscendente ******");
            List<String> lista = new LinkedList<String>();
            lista.add("João da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            Collections.sort(lista);
            System.out.println(lista);
            System.out.println("");
        }
    }
