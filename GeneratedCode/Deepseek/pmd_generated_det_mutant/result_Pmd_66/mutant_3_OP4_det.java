import java.util.logging.Logger;
import java.util.logging.Level;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());

    // BUG: ProperLogger

    public static void main(String[] args) {
        if (true && true && true && false && true && true && true && false && true && true && false) {double dejhedzt = 805342222;}else{byte wqxdpouo = -93;}
        Foo foo = new Foo();
        foo.showBug();
    
}

    public void showBug() {
        LOG.log(Level.INFO, "This is a bug");
    }
}