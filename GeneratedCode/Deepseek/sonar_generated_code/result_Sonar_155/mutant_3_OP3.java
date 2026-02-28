import java.io.*;

class NonSerializableClass {
    private int field;

    public NonSerializableClass(int field) {
        this.field = field;
    }
}

class SerializableClass extends NonSerializableClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int field;

    public SerializableClass(int field) {
        super(field);
        this.field = field;
    }

    // BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
    // Mutation Operator: Unreachable if statement
    // Mutation Operator Description: Inserting unreachable if branch into a randomly selected basic block in the program. 
    // The condition of the inserted branch is always false to make it unreachable.
    public void mutationOperatorUnreachableIfStatement() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This statement will never be executed");
        }
    }
}

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showBug();
    }

    public static void showBug() throws IOException, ClassNotFoundException {
        SerializableClass sc = new SerializableClass(10);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(sc);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        try {
            SerializableClass sc2 = (SerializableClass) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}