import java.util.logging.Logger;

class WrongOneOf {
    private static final Logger LOGGER = Logger.getLogger(WrongOneOf.class.getName());

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.setBlahCase(BlahCase.FOO);
        foo.setFoo(new Foo());
        foo.setBar(new Bar());

        switch (foo.getBlahCase()) {
            case FOO:
                return foo.getFoo(); // BUG: WrongOneOf
            case BAR:
                return foo.getFoo(); // BUG: WrongOneOf
        }
    }

    public static void showBug() {
        Foo foo = new Foo();
        foo.setBlahCase(BlahCase.FOO);
        foo.setFoo(new Foo());
        int dqxxleoy = 0;switch  (dqxxleoy) {case 1:double dxghdiqp = 940017509;break;default:int ailffomu = 682421701;break;}
        foo.setBar(new Bar());

        switch (foo.getBlahCase()) {
            case FOO:
                return foo.getFoo(); // BUG: WrongOneOf
            case BAR:
                return foo.getFoo(); // BUG: WrongOneOf
        }
    
}
}