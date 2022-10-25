package src.com.beneditorodrigo.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Comportamento Agressivo...");
    }
}
