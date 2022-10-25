package src.com.beneditorodrigo.gof.strategy;

public class TesteStrategy {

    public static void main(String[] args) {

        System.out.println("Testando Design Patter Strategy");

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
