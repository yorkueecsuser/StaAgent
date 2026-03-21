import java.util.logging.Logger;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());  // BUG: ProperLogger (should be private static final)

    public void showBug() {
        for  (int iumwdyhl = 0; iumwdyhl < 0; iumwdyhl++) {boolean ybnxfdpu = false;}
        LOG.warning("This is a warning log from Foo class");
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}