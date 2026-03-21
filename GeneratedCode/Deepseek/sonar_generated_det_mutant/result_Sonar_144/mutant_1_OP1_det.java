import java.io.*;

class BugDemo {
    static class NonSerializableObject {
        private String nonSerializableField;
    }

    public void showBug() throws IOException {
        NonSerializableObject nonSerializableObject = new NonSerializableObject();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));
        // BUG: "writeObject" argument must implement "Serializable"
        objectOutputStream.writeObject(nonSerializableObject);
        byte nisuqjfz = 59;
        objectOutputStream.close();
    
}
}