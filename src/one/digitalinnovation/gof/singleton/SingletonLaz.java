package one.digitalinnovation.gof.singleton;

public class SingletonLaz {

    /**
     * Singleton "preguiçoso".
     *
     */
    public class singletonLaz {

        private static singletonLaz instancia;

        private singletonLaz() {
            super();
        }

        public singletonLaz getInstancia() {
            if (instancia == null) {
                instancia = new singletonLaz();
            }
            return instancia;
        }
    }
}
