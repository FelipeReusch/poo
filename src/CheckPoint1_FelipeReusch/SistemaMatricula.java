package CheckPoint1_FelipeReusch;

import Aula07.Endereco;

public class SistemaMatricula {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setCpf("42502804892");
        felipe.setMatricula("001");
        felipe.setNome("Felipe Reusch");
        felipe.setPessoaTipo(pessoaTipo.ALUNO);


        Endereco endereco = new Endereco();
        endereco.setBairro("CENTRO");
        endereco.setCidade("RIO");
        endereco.setLogradouro("RUA BABABA");
        endereco.setUf("RJ");
        endereco.setNumero("333");


        Curso curso = new Curso();
        curso.setNomeSala("Tutancamon");
        curso.setTurno(Turno.MANHA);
        curso.setValorCurso("700");
        curso.setTipoCurso(TipoCurso.INGLES);
        curso.setPessoa(felipe);


        Professor roberto = new Professor();
        roberto.setFormacao(Formacao.DOUTORADO);
        roberto.setValorHora(100.00);
        roberto.setPessoaTipo(pessoaTipo.PROFESSOR);



        System.out.println("Felipe é  " + felipe.getPessoaTipo() + " com matricula " + felipe.getMatricula() + " e estuda na sala " + curso.getNomeSala());
        System.out.println("Roberto é " + roberto.getPessoaTipo() + " sua formação é " + roberto.getFormacao());
        System.out.println("paga $700 então o curso é "+ curso.getTipoCurso());










    }
}
