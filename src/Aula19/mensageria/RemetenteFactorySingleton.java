package Aula19.mensageria;

public class RemetenteFactorySingleton {
    private static Rementente rementente;
    public static Rementente newInstance(){
        if(rementente==null){
            rementente = new Rementente();
            rementente.setNome("GLEYSON RENT");
            rementente.setNumero("86876786");
        }
        return rementente;
    }
}
