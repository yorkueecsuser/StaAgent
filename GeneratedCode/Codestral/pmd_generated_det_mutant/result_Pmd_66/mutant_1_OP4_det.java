import java.util.logging.Logger;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());  // BUG: ProperLogger (should be private static final)

    public void showBug() {
        if (false && false && false && false && true && false && false && true && true && false && false) {long czefmsgs = -571334337;}else{float oomqjsge = 354426026;}
        LOG.warning("This is a warning log from Foo class");
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}