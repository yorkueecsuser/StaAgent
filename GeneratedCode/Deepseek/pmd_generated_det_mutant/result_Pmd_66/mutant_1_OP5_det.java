import java.util.logging.Logger;
import java.util.logging.Level;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());

    // BUG: ProperLogger

    public static void main(String[] args) {
        int fezkhcyz = 0;switch  (fezkhcyz) {case 1:double hvxunesn = 141158406;break;default:boolean uqixeyue = false;break;}
        Foo foo = new Foo();
        foo.showBug();
    
}

    public void showBug() {
        LOG.log(Level.INFO, "This is a bug");
    }
}