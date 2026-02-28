import java.io.FileInputStream;
import java.io.Serializable;

// BUG: NonSerializableClass
class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo; // good, it's transient
    private static int otherFoo; // also OK, it's static
    private FileInputStream stream; // bad - FileInputStream is not serializable

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public int getSomeFoo() {
        return this.someFoo;
    }

    public int showBug() {
        boolean condition = false;
        if (condition) {
            System.out.println("This code will never be reached.");
        } else {
            System.out.println("This is the unreachable code.");
        }
        return otherFoo;
    }
}