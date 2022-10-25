package src.com.beneditorodrigo.gof.singleton;

public class TesteSingleton {

    public static void main(String[] args) {

        System.out.println("== Testes do Design Pattern Singleton ==");
        System.out.println("Teste de Singleton Lazy");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("Teste de Singleton Eager");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("Teste de Singleton Lazy Holder");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}