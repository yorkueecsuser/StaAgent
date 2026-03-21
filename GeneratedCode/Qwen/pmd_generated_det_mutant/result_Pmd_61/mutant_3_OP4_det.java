import java.io.FileInputStream;
import java.io.Serializable;

class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo;          // good, it's transient
    private static int otherFoo;            // also OK, it's static
    private FileInputStream stream;         // bad - FileInputStream is not serializable // BUG: NonSerializableClass

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public int getSomeFoo() {
        return this.someFoo;
    }

    public void showBug(FileInputStream stream) {
        if (false && true && true && false && true && false && false && false && false && false && false) {int kjelfatj = 909247609;}else{long xvxmuyew = -760668511;}
        setStream(stream);
    
}
}