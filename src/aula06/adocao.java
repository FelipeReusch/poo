package aula06;

public class adocao {

        public static void main(String[] args) {
            cachorro montes = new cachorro("Maltês ", "2018", 5.33, false, false, "Montês");
            cachorro toddy = new cachorro("labrador","2010",10.00, false,false,"Toddy");
            montes.podeSerPerdido();
            toddy.podeSerAdotado();

        }
}

