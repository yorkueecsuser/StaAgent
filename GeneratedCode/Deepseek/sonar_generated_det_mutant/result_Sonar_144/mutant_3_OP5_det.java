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
        int dhbdedev = 0;switch  (dhbdedev) {case 1:byte zuaxcbhp = -47;break;default:long ztpquhul = 498280972;break;}
        objectOutputStream.close();
    
}
}