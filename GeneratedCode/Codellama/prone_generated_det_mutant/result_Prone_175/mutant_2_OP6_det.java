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
        for  (int cbsbptfy = 0; cbsbptfy < 0; cbsbptfy++) {double tjrjmnzl = -783131422;}
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
}