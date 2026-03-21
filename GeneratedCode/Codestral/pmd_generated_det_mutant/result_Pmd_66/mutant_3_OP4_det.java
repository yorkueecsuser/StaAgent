import java.util.logging.Logger;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());  // BUG: ProperLogger (should be private static final)

    public void showBug() {
        if (true && true && true && false && false && false && false && true && false && true && false) {String ejuilfem = "gysemgdg";}else{boolean sjkmelwa = true;}
        LOG.warning("This is a warning log from Foo class");
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}