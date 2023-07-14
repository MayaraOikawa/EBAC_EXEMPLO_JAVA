package br.com.moikawa;

import br.com.moikawa.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploConsultando();
        exemploRemover();
    }

    private static void exemploRemover() {
        System.out.println("*** exemploRemover ***");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Joao da Silva","Linux Basico",0);
        Aluno b = new Aluno("Antonio Souza","OpenOffice",0);
        Aluno c = new Aluno("Lucia Ferreira","Internet",0);
        Aluno d = new Aluno("Antonio Souza","OpenOffice",10);
        Aluno e = new Aluno("Teste","OpenOffice",10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(a);
        System.out.println(conjunto);

        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
        }
    }

    private static void exemploConsultando() {
        System.out.println("*** exemploConsultando ***");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Joao da Silva","Linux Basico",0);
        Aluno b = new Aluno("Antonio Souza","OpenOffice",0);
        Aluno c = new Aluno("Lucia Ferreira","Internet",0);
        Aluno d = new Aluno("Antonio Souza","OpenOffice",10);
        Aluno e = new Aluno("Teste","OpenOffice",10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto.contains(e));
    }

    /**
     * Para nao repetir objetos na lista de aluno eh necessario que a classe
     * Aluno implemente o  equals e hashcode
     */

    private static void  exemploListaSimples(){
        Set<Aluno> conjunto = new HashSet<>();

        Aluno a = new Aluno("Joao da Silva","Linux Basico",0);
        Aluno b = new Aluno("Antonio Souza", "OpenOffice", 0);
        Aluno c = new Aluno("Lucia Ferreira", "Internet",  0);
        Aluno d = new Aluno("Antonio Souza",  "OpenOffice",  10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}

