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
        if (true && true && true && false && true && false && true && false && false && true && false) {String voxvmdvs = "fcxuetgp";}else{double kuasgogs = -679150327;}
        objectOutputStream.close();
    
}
}