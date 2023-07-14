package br.com.moikawa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {

    public static void main(String args[]) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("****** exemploListaSimplesOrdenadaClasseExterna ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Joao da Silva","Linux basico", 3); //puxa do construtor na classe ALUNO
        Aluno b = new Aluno("Antonio Souza", "openOffice", 9);
        Aluno c = new Aluno("Lucia Ferreira", "Internet", 5);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("****** exemploListaSimplesOrdenadaClasseExterna ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Joao da Silva","Linux basico", 3);
        Aluno b = new Aluno("Antonio Souza", "openOffice", 9);
        Aluno c = new Aluno("Lucia Ferreira", "Internet", 5);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenacao" + lista);
        Collections.sort(lista);
        System.out.println("Lista com ordenacao" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno(); //puxa da classe ComparaNotaAluno
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenacao por nota" + lista);

        System.out.println("");
    }
}
