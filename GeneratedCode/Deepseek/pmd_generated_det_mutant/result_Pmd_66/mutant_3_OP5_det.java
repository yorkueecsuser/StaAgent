import java.util.logging.Logger;
import java.util.logging.Level;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());

    // BUG: ProperLogger

    public static void main(String[] args) {
        int zkrwmtco = 0;switch  (zkrwmtco) {case 1:int romxikjw = -950959049;break;default:short rulhbeas = -4060;break;}
        Foo foo = new Foo();
        foo.showBug();
    
}

    public void showBug() {
        LOG.log(Level.INFO, "This is a bug");
    }
}