package br.com.moikawa;

import java.util.Objects;

    public class Aluno implements Comparable<Aluno> { //implentar a comparacao
        private String nome;
        private String curso;
        private double nota;
        private String sala;

        public Aluno(String nome, String curso, double nota) { //contrutor
            this.nome = nome;
            this.curso = curso;
            this.nota = nota;
        }

        public Aluno(String nome, String curso, double nota, String sala) { //contrutor
            this(nome, curso, nota);
            this.sala = sala;
        }

        public String getNome() {

            return nome;
        }

        public void setNome(String nome) {

            this.nome = nome;
        }

        public String getCurso() {

            return curso;
        }

        public void setCurso(String curso) {

            this.curso = curso;
        }

        public double getNota() {

            return nota;
        }

        public void setNota(double nota) {

            this.nota = nota;
        }

        public String getSala() {

            return sala;
        }

        public void setSala(String sala) {
            this.sala = sala;
        }


        public String toString() { //Usado para converter o objeto em String,
            return this.nome; // a impressao no console:  return this."variavel"

            // return "Aluno{" + (botão direito  > Generate > toString())
            //   "nome='" + nome + '\'' +
            //  ", curso='" + curso + '\'' +
            //  ", nota=" + nota +
            //   ", sala='" + sala + '\'' +
            //    '}';
        }

        @Override
        public int compareTo(Aluno aluno) { // Usado para comparação entre objetos e verificar se o mesmo é igual
            return this.nome.compareTo(aluno.getNome()); //escolher a ordenacao : return this."varialvel" .compareTo(aluno.getNome());
        }

        @Override
        public boolean equals(Object o) { //
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Aluno aluno = (Aluno) o;
            return Objects.equals(nome, aluno.nome);
        }

        @Override
        public int hashCode() {

            return Objects.hash(nome);
        }
    }

