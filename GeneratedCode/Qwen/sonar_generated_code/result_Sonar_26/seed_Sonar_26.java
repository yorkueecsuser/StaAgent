import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

class RecordExample {

    record NonCompliantRecord1() implements Serializable {
        @java.io.Serial
        private static final java.io.ObjectStreamField[] serialPersistentFields = new java.io.ObjectStreamField[0]; // BUG: Members ignored during record serialization should not be used

        @java.io.Serial
        private void writeObject(ObjectOutputStream out) throws IOException { // BUG: Members ignored during record serialization should not be used
            out.defaultWriteObject();
        }

        public void showBug1() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new java.io.ByteArrayOutputStream())) {
                oos.writeObject(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    record NonCompliantRecord2() implements Externalizable {
        @Override
        public void writeExternal(ObjectOutput out) throws IOException { // BUG: Members ignored during record serialization should not be used
            out.writeObject("Some data");
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException { // BUG: Members ignored during record serialization should not be used
            in.readObject();
        }

        public void showBug2() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new java.io.ByteArrayOutputStream())) {
                oos.writeObject(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    record CompliantRecord() implements Serializable {
        private Object writeReplace() throws ObjectStreamException {
            return new SerializedProxy(this);
        }

        private Object readResolve() throws ObjectStreamException {
            return new CompliantRecord();
        }

        public void showBug() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new java.io.ByteArrayOutputStream())) {
                oos.writeObject(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static class SerializedProxy implements Serializable {
        private static final long serialVersionUID = 1L;
        private final CompliantRecord record;

        SerializedProxy(CompliantRecord record) {
            this.record = record;
        }

        private Object readResolve() {
            return record;
        }
    }

    public static void main(String[] args) {
        NonCompliantRecord1 record1 = new NonCompliantRecord1();
        record1.showBug1();

        NonCompliantRecord2 record2 = new NonCompliantRecord2();
        record2.showBug2();

        CompliantRecord record3 = new CompliantRecord();
        record3.showBug();
    }
}