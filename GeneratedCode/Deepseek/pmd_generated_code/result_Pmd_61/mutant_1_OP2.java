import java.io.FileInputStream;
import java.io.Serializable;

class Buzz implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo; // remains the same, it's transient
    private static int otherFoo; // remains the same, it's static

    // Creating a new class that extends FileInputStream and implements Serializable
    private static class SerializableFileInputStream extends FileInputStream implements Serializable {
        public SerializableFileInputStream(java.io.File file) throws java.io.FileNotFoundException {
            super(file);
        }
    }

    private SerializableFileInputStream stream; // now it's serializable

    public void setStream(SerializableFileInputStream stream) {
        this.stream = stream;
    }

    public int getSomeFoo() {
        return this.someFoo;
    }

    public int showBug() {
        return otherFoo;
    }
}