import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class ExternalizableBugExample implements Externalizable {
    private String message;
    
    public ExternalizableBugExample(String message) {
        this.message = message;
    }

    // BUG: "Externalizable" classes should have no-arguments constructors

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(message);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        message = in.readUTF();
    }

    public String showBug() {
        // Attempting to deserialize this class without a no-arg constructor will throw an InvalidClassException
        try {
            // Normally, deserialization logic would go here.
            // But since we're demonstrating a bug, we'll omit actual deserialization
            return "Deserialization would fail without a no-arg constructor";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}