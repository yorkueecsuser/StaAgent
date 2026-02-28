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

    // Mutant Code: Unreachable while loop
    public void unreachableWhileLoop() {
        boolean condition = false;
        while (condition) {
            // This code will never be executed
            // But it's necessary to make the loop unreachable
            // for the mutation to take effect
        }
    }
}