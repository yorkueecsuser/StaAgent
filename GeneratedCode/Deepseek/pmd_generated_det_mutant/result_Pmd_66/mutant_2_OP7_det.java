import java.util.logging.Logger;
import java.util.logging.Level;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());

    // BUG: ProperLogger

    public static void main(String[] args) {
        boolean wtgnmwmg = false;while (wtgnmwmg && false && false && false && true && false && true && true && true && true && true && false) {char jfavwxdc = 'd';}
        Foo foo = new Foo();
        foo.showBug();
    
}

    public void showBug() {
        LOG.log(Level.INFO, "This is a bug");
    }
}