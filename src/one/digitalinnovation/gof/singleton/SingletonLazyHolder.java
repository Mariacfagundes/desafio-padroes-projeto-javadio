package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    /**
     * Singleton "Lazy Holder".
     *
     * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
     *
     */
    public static class singletonLazHolder {

        private static class InstanceHolder {
            public static singletonLazHolder instancia = new singletonLazHolder();
        }

        private singletonLazHolder() {
            super();
        }

        public static singletonLazHolder getInstancia() {
            return InstanceHolder.instancia;
        }
    }
}
