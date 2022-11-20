package one.digitalinnovation.gof.singleton;

public class SingletonEager {

    /**
     * Singleton "apressado".
     *
     */
    public static class singletonEager {

        private static singletonEager instancia = new singletonEager();

        private singletonEager() {
            super();
        }

        public static singletonEager getInstancia() {
            return instancia;
        }
    }
}
