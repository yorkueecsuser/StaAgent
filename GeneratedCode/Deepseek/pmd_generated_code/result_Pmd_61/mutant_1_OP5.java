import java.io.FileInputStream;
import java.io.Serializable;

class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo; // good, it's transient
    private static int otherFoo; // also OK, it's static
    private FileInputStream stream; // bad - FileInputStream is not serializable
    private int unreachableSwitchCase = 1; // Added for unreachable switch statement mutation

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public int getSomeFoo() {
        return this.someFoo;
    }

    public int showBug() {
        unreachableSwitchCase = 2; // This ensures that the default case of the switch statement is always unreachable
        switch(unreachableSwitchCase) {
            case 1:
                return otherFoo;
            default:
                return -1; // This is the unreachable code
        }
    }
}