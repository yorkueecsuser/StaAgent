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
        boolean pppdcjek = false;while (pppdcjek && true && true && true && false && true && true && false && false && true && false && false) {short nwrdzsbv = -4222;}
        objectOutputStream.close();
    
}
}