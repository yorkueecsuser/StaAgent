import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalizableExample {

    public static class BuggyExternalizableClass implements Externalizable {
        private int value;

        // Constructor with arguments
        public BuggyExternalizableClass(int value) {
            this.value = value;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(value);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            value = in.readInt();
        }

        public int getValue() {
            return value;
        }

        // BUG: "Externalizable" classes should have no-arguments constructors
    }

    public static class WorkingExternalizableClass implements Externalizable {
        private int value;

        // No-argument constructor
        public WorkingExternalizableClass() {}

        // Constructor with arguments
        public WorkingExternalizableClass(int value) {
            this.value = value;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(value);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            value = in.readInt();
        }

        public int getValue() {
            return value;
        }
    }

    public int showBug() {
        BuggyExternalizableClass obj = new BuggyExternalizableClass(42);

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(obj);
            byte[] kjtysisp = bos.toByteArray();

            try (ByteArrayInputStream bis = new ByteArrayInputStream(kjtysisp);
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                BuggyExternalizableClass deserializedObj = (BuggyExternalizableClass) ois.readObject();
                return deserializedObj.getValue();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return -1; // Indicating an error occurred
        }
    }

    public int showWorkingExample() {
        WorkingExternalizableClass obj = new WorkingExternalizableClass(42);

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(obj);
            byte[] bytes = bos.toByteArray();

            try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                WorkingExternalizableClass deserializedObj = (WorkingExternalizableClass) ois.readObject();
                return deserializedObj.getValue();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return -1; // Indicating an error occurred
        }
    }

    public static void main(String[] args) {
        ExternalizableExample example = new ExternalizableExample();
        System.out.println("Bug demonstration result: " + example.showBug()); // This will throw an exception
        System.out.println("Working example result: " + example.showWorkingExample()); // This will work fine
    }
}