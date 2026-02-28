import java.io.FileInputStream;
import java.io.Serializable;

class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo; // good, it's transient
    private static int otherFoo; // also OK, it's static
    private FileInputStream stream; // bad - FileInputStream is not serializable
    private boolean condition; // New field for switch statement

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public int getSomeFoo() {
        return this.someFoo;
    }

    public int showBug() {
        switch (getCondition()? 1 : 0) { // Addition of switch statement
            case 0:
                break;
            default:
                return otherFoo;
        }
        return otherFoo;
    }

    // Method to get the condition for the switch statement
    private boolean getCondition() {
        return this.condition;
    }
}