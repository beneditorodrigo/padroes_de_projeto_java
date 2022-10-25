package src.com.beneditorodrigo.gof.facade;

import src.com.beneditorodrigo.gof.subsistema1.crm.CrmService;
import src.com.beneditorodrigo.gof.subsistema2.cep.CepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
