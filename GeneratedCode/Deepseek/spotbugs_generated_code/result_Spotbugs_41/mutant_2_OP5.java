import java.io.*;

class SerializationBug implements Serializable {

    private String data;

    public SerializationBug(String data) {
        this.data = data;
    }

    public void writeObject(ObjectOutputStream out) throws IOException { // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
        out.defaultWriteObject();
        out.writeObject(data.toUpperCase());
    }

    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        data = (String) in.readObject();

        // MUTANT: Unreachable switch statement
        boolean shouldRun = getCondition();
        if(shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    public SerializationBug showBug() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(this);
        os.close();

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream is = new ObjectInputStream(in);
        SerializationBug buggyObject = (SerializationBug) is.readObject();
        is.close();

        System.out.println("Original data: " + data);
        System.out.println("Deserialized data: " + buggyObject.data);

        return buggyObject;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationBug bug = new SerializationBug("hello world");
        bug.showBug();
    }

    // Helper methods for avoiding unreachable statement errors
    private boolean getCondition() { return false; }
    private int getValue() { return 0; }
}