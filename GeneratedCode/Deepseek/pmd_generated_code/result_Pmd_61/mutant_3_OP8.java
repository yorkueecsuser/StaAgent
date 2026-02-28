import java.io.FileInputStream;
import java.io.Serializable;

// BUG: NonSerializableClass
class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo; // good, it's transient
    private static int otherFoo; // also OK, it's static
    private FileInputStream s; // bad - FileInputStream is not serializable

    public void setStream(FileInputStream s) {
        this.s = s;
    }

    public int getSomeFoo() {
        return this.someFoo;
    }

    public int showBug() {
        return otherFoo;
    }
}