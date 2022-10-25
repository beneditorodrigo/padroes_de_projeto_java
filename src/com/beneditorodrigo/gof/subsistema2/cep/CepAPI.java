package src.com.beneditorodrigo.gof.subsistema2.cep;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();
    }

    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Tauá";
    }

    public String recuperarEstado(String cep){
        return "CE";
    }
}
