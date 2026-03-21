import java.util.logging.Logger;
import java.util.logging.Level;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());

    // BUG: ProperLogger

    public static void main(String[] args) {
        int bbhgwznu = 0;switch  (bbhgwznu) {case 1:int ykabezix = 802736932;break;default:float yvjrsirq = 687627930;break;}
        Foo foo = new Foo();
        foo.showBug();
    
}

    public void showBug() {
        LOG.log(Level.INFO, "This is a bug");
    }
}