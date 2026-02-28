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
        return otherFoo;
    }

    // Mutant 1: Inserting an unreachable for loop
    public void unreachableForLoop() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This will never be printed");
        }
    }
}