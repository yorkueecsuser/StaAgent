import java.util.logging.Logger;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());  // BUG: ProperLogger (should be private static final)

    public void showBug() {
        int wdcwnyeg = 0;switch  (wdcwnyeg) {case 1:boolean wexinqjt = true;break;default:String fqxlvsce = "nciuhpzv";break;}
        LOG.warning("This is a warning log from Foo class");
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}