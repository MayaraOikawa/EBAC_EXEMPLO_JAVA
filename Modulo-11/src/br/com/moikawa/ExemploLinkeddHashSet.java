package br.com.moikawa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkeddHashSet {
1
    public static void main(String args[]) { exemploListaSimples(); }

    private static void exemploListaSimples() {
        System.out.println(" ***** exemploListaSimples *****");
        Set<String> lista = new LinkedHashSet<~>();
        lista.add("Joao da Silva");
        lista.add("Antonio Souza");
        lista.add("Lucia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }
}
