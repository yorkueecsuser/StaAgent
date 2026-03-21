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
        if (false && false && false && false && false && true && false && true && true && true && false) {byte qahhqbps = 72;}else{char hegygfyi = 'g';}
        objectOutputStream.close();
    
}
}