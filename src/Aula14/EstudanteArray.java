package Aula14;

import java.util.*;

public class EstudanteArray {
    public static void main(String[] args) {
        String[] alunos = {"jose", "maria", "marcos", "jose" };

        // LISTAR NOMES
        /*List<String> nomes = new ArrayList();
        nomes.add("jose");
        nomes.add("maria");
        nomes.add("marcos");
        nomes.add("jose");

        for (String nome : nomes) {
            System.out.println(nome);
        }*/

        // PEGAR NOMES SEM REPETIR
        /*Set<String> nomes = new HashSet();
        nomes.add("jose");
        nomes.add("maria");
        nomes.add("marcos");
        nomes.add("jose");

        for (String nome : nomes) {
            System.out.println(nome);
        }*/

        // PEGAR NOMES SEM REPETIR EM ORDEM
        Set<String> nomes = new TreeSet();
        nomes.add("jose");
        nomes.add("maria");
        nomes.add("marcos");
        nomes.add("jose");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        /*for (String nome:nomes){
            if("jose".equals(nome))
                nomes.add("jose");
        }*/

        /*for(String aluno:alunos){
            System.out.println("");
        } }*/
    }
}
