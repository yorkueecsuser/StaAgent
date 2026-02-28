import java.io.FileInputStream;
import java.io.Serializable;

// BUG: NonSerializableClass
class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int renamedFoo; // Changed the variable name
    private static int otherFoo; // still OK, it's static
    private FileInputStream stream; // still bad - FileInputStream is not serializable

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public int getRenamedFoo() { // Changed the method name to match the variable rename
        return this.renamedFoo;
    }

    public int showBug() {
        return otherFoo;
    }
}