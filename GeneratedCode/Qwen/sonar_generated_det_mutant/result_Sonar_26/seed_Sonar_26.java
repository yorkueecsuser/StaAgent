import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.ObjectStreamField;
import java.io.Serializable;

class RecordExample {

    record NonCompliantRecord() implements Serializable {
        @java.io.Serial
        private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0]; // BUG: Members ignored during record serialization should not be used

        @java.io.Serial
        private void writeObject(ObjectOutputStream out) throws IOException { // BUG: Members ignored during record serialization should not be used
            out.defaultWriteObject();
        }

        @java.io.Serial
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { // BUG: Members ignored during record serialization should not be used
            in.defaultReadObject();
        }

        public Object showBug() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new java.io.ByteArrayOutputStream())) {
                oos.writeObject(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    record NonCompliantExternalRecord() implements Externalizable {
        @Override
        public void writeExternal(ObjectOutput out) throws IOException { // BUG: Members ignored during record serialization should not be used
            out.writeObject("External Write");
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException { // BUG: Members ignored during record serialization should not be used
            String data = (String) in.readObject();
            System.out.println(data);
        }

        public Object showBug() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new java.io.ByteArrayOutputStream())) {
                oos.writeObject(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    record CompliantRecord() implements Serializable {
        private Object writeReplace() throws ObjectStreamException {
            return new String("Replaced Object");
        }

        private Object readResolve() throws ObjectStreamException {
            return new String("Resolved Object");
        }

        public Object showBug() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new java.io.ByteArrayOutputStream())) {
                oos.writeObject(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        NonCompliantRecord nonCompliantRecord = new NonCompliantRecord();
        nonCompliantRecord.showBug();

        NonCompliantExternalRecord nonCompliantExternalRecord = new NonCompliantExternalRecord();
        nonCompliantExternalRecord.showBug();

        CompliantRecord compliantRecord = new CompliantRecord();
        compliantRecord.showBug();
    }
}