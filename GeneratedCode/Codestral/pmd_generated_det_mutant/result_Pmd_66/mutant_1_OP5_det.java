import java.util.logging.Logger;

class Foo {

    protected Logger LOG = Logger.getLogger(Foo.class.getName());  // BUG: ProperLogger (should be private static final)

    public void showBug() {
        int iemfpeve = 0;switch  (iemfpeve) {case 1:float hbapzsds = -970160640;break;default:String qmgunyax = "vzwoidls";break;}
        LOG.warning("This is a warning log from Foo class");
    
}

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}