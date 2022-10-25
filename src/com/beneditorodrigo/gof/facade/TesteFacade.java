package src.com.beneditorodrigo.gof.facade;

public class TesteFacade {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.migrarCliente("Benedito Rodrigo", "10.800-960");
    }
}
