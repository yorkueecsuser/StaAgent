import java.io.FileInputStream;
import java.io.Serializable;

class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo; 
    private static int otherFoo; 
    private FileInputStream stream;

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public int getSomeFoo() {
        return this.someFoo;
    }

    public int showBug() {
        boolean neverRun = false; // added mutation

        // start of mutant block
        if (neverRun) { 
            neverRun = true;
            System.out.println("This statement is never reached");
        }
        // end of mutant block

        return otherFoo;
    }
}