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
        int fwrxomeu = 0;switch  (fwrxomeu) {case 1:String ebihdnsp = "ttceqajp";break;default:double darxoedg = 795069449;break;}
        foo.setFoo(new Foo());
        foo.setBar(new Bar());

        switch (foo.getBlahCase()) {
            case FOO:
                return foo.getFoo(); // BUG: WrongOneOf
            case BAR:
                return foo.getFoo(); // BUG: WrongOneOf
        }
    
}
}