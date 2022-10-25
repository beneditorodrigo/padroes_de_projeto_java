package src.com.beneditorodrigo.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author beneditorodrigo
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}