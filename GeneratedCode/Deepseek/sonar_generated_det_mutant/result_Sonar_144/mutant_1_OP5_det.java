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
        int lsqsjxtl = 0;switch  (lsqsjxtl) {case 1:char fblbkdmw = 'f';break;default:int selixcsk = 829229120;break;}
        objectOutputStream.close();
    
}
}