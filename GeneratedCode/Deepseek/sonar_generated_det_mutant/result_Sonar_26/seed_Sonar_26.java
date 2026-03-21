import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectStreamException;

record Record(String name) implements Serializable {

    // Compliant solution
    private Object writeReplace() throws ObjectStreamException {
        return new SerializedObject(name);
    }

    private Object readResolve() throws ObjectStreamException {
        return this;
    }

    // This is a bug because the `showBug` method uses the noncompliant writeObject method
    public String showBug() throws IOException {
        Record r = new Record("test");
        ObjectOutputStream out = new ObjectOutputStream(System.out);
        out.writeObject(r);
        return "Buggy code executed";
    }

    record SerializedObject(String name) implements Serializable {
        // Compliant solution
        private Object writeReplace() throws ObjectStreamException {
            return new SerializedObject(name);
        }
        private Object readResolve() throws ObjectStreamException {
            return this;
        }
    }
}