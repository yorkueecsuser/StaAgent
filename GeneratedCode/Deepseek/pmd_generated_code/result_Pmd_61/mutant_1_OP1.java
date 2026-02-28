import java.io.FileInputStream;
import java.io.Serializable;

class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo; 
    private static int otherFoo; 
    private FileInputStream stream; 

    private String mutantVariable_a1b2c3d4; // This mutant variable will not be used at all in this code

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public int getSomeFoo() {
        int deadVariable; // This variable is not used anywhere in this code
        return this.someFoo;
    }

    public int showBug() {
        return otherFoo;
    }
}