package br.com.moikawa;

import java.util.Comparator;
public class ComparaNotaAluno implements Comparator<Aluno> { //implentar a comparacao

    @Override
    public int compare(Aluno o1, Aluno o2) {
        //return Double.valueOf(o1.getNota()).compareTo(Double.valueOf(o2.getNota()));
        //return Double.compare(o2.getNota(), o1.getNota());
        return Double.compare(o2.getNota(), o1.getNota()); // compara pela nota, se for para comparar String deve ser return this."varialvel" .compareTo(aluno.getNome())
    }
}
