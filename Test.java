
    package one.digitalinnovation.gof;

    public class Test {
        public static void main (String[] args){
            // Singleton

            SingletonLaz.SingletonLazy lazy = SingletonLaz.SingletonLazy.getInstancia();
            System.out.println(lazy);
            lazy = SingletonLaz.SingletonLazy.getInstancia();
            System.out.println(lazy);

            SingletonEager eager = SingletonEager.getInstancia();
            System.out.println(eager);
            eager = SingletonEager.getInstancia();
            System.out.println(eager);

            SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
            System.out.println(lazyHolder);
            lazyHolder = SingletonLazyHolder.getInstancia();
            System.out.println(lazyHolder);

            // Strategy

            Comportamento defensivo = new ComportamentoDefensivo();
            Comportamento normal = new ComportamentoNormal();
            Comportamento agressivo = new ComportamentoAgressivo();

            Robo robo = new Robo();
            robo.setComportamento(normal);
            robo.mover();
            robo.mover();
            robo.setComportamento(defensivo);
            robo.mover();
            robo.setComportamento(agressivo);
            robo.mover();
            robo.mover();
            robo.mover();

            // Facade

            Facade facade = new Facade();
            facade.migrarCliente("Venilton", "14801788");
        }

        }

    }

}
