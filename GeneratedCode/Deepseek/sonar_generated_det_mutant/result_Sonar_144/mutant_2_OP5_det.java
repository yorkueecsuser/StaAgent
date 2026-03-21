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
        int bqptgtxg = 0;switch  (bqptgtxg) {case 1:boolean glxhedvy = false;break;default:short sfnctztp = 2103;break;}
        objectOutputStream.close();
    
}
}