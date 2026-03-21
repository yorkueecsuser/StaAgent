import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectStreamField;
import java.io.Serial;

class RecordSerializationBugDemo {

    // Noncompliant Record class implementing Serializable with ignored methods
    record SerializableRecord() implements java.io.Serializable {
        @Serial
        private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0]; // BUG: Members ignored during record serialization should not be used

        @Serial
        private void writeObject(java.io.ObjectOutputStream out) throws IOException { // BUG: Members ignored during record serialization should not be used
            // This method is ignored during serialization
        }
    }

    // Noncompliant Record class implementing Externalizable with ignored methods
    record ExternalizableRecord() implements Externalizable {

        @Override
        public void writeExternal(ObjectOutput out) throws IOException { // BUG: Members ignored during record serialization should not be used
            // This method is ignored during serialization
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException { // BUG: Members ignored during record serialization should not be used
            // This method is ignored during deserialization
        }
    }

    public void showBug() {
        SerializableRecord sr = new SerializableRecord();
        ExternalizableRecord er = new ExternalizableRecord();
        
        System.out.println("SerializableRecord and ExternalizableRecord instances created.");
    }
}