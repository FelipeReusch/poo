package CheckPoint1_FelipeReusch;

public class Curso {
    private String nomeSala;
    private String valor;
    private TipoCurso tipoCurso;
    private Pessoa pessoa;
    private Turno turno;
    private String valorCurso;

    public String getNomeSala() {
        return nomeSala;
    }

    public String getValor() {
        return valor;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void setValorCurso(String s) {
        if (this.valor == "700") {
            System.out.println(this.tipoCurso + " ingles ");
        }
        if (this.valor == "800") {
            System.out.println(this.tipoCurso + "informatica");
        }
        if (this.valor == "850") {
            System.out.println(this.tipoCurso + "administracao");
        } else {
            System.out.println(this.tipoCurso + " n existe");
        }
    }

    public String getValorCurso() {
        return valorCurso;
    }

}