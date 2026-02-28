import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Main {

    public record Record(int value) implements Serializable {
        private void writeObject(ObjectOutputStream out) throws IOException {
            // BUG: Members ignored during record serialization should not be used
            out.defaultWriteObject();
            out.writeInt(value);
        }
    }

    public Object showBug(int value) {
        try {
            Record record = new Record(value);
            ObjectOutputStream out = new ObjectOutputStream(System.out);
            record.writeObject(out);
            out.flush();
            return out;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug(42);
    }
}